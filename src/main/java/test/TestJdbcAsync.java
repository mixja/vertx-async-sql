package test;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.jdbc.JDBCClient;
import io.vertx.ext.sql.SQLClient;
import io.vertx.ext.sql.SQLConnection;
import io.vertx.ext.sql.UpdateResult;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;

import java.sql.Timestamp;
import java.util.UUID;

import static test.data.tables.ContentItemSet.CONTENT_ITEM_SET;

public class TestJdbcAsync {
    static private JsonArray getBindValues(Query query) {
        JsonArray bindValues = new JsonArray();
        for (Param<?> param : query.getParams().values()) {
            Object value = convertToDatabaseType(param);
            if(value==null){
                bindValues.addNull();
            }else{
                bindValues.add(value);
            }
        }
        return bindValues;
    }

    static <T> Object convertToDatabaseType(Param<T> param) {
        System.out.println(param.getBinding().converter().to(param.getValue()).getClass().getName());
        return param.getBinding().converter().to(param.getValue()).toString();
    }

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        Configuration configuration = new DefaultConfiguration();
        configuration.set(SQLDialect.POSTGRES_9_5);
        DSLContext context = DSL.using(configuration);
//        Query query = context.insertInto(
//                CONTENT_ITEM_SET,
//                CONTENT_ITEM_SET.ID,
//                CONTENT_ITEM_SET.SOURCE,
//                CONTENT_ITEM_SET.TIMESTAMP)
//                .values(UUID.randomUUID(), "2", new Timestamp(System.currentTimeMillis()));
//        System.out.println(query.getParams());
        JsonObject dbConfig = new JsonObject()
                .put("url", "jdbc:postgresql://localhost/cola")
                .put("user", "cola")
                .put("password", "password")
                .put("max_pool_size", 50);
        SQLClient client = JDBCClient.createShared(vertx, dbConfig);
        for (int i = 0; i < 1; i++) {
            client.getConnection(sqlConnectionResult -> {
                if (sqlConnectionResult.succeeded()) {
                    System.out.println(new Timestamp(System.currentTimeMillis()).toString());
                    SQLConnection connection = sqlConnectionResult.result();
                    String query = String.format(
                            "INSERT INTO content_item_set (id, source, timestamp) values ('%s','%s','%s')",
                            UUID.randomUUID(),
                            "hello",
                            new Timestamp(System.currentTimeMillis()));
//                    String query = "INSERT INTO content_item_set (id, source, timestamp) values (?,?,?)";
//                    System.out.println(getBindValues(query));
                    connection.update(query, result -> {
                        System.out.println(result.cause());
                        UpdateResult resultSet = result.result();
                        System.out.println(resultSet);
                        connection.close();
                    });
//                    connection.updateWithParams(query, new JsonArray()
//                            .add(UUID.randomUUID().toString())
//                            .add("hello")
//                            .add((new Timestamp(System.currentTimeMillis())).toString()), result -> {
//                                System.out.println(result.cause());
//                                UpdateResult resultSet = result.result();
//                                System.out.println(resultSet);
//                                connection.close();
//            //                    vertx.close();
//                    });
                } else {

                }
            });
        }

    }
}
