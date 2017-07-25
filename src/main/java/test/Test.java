package test;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.asyncsql.PostgreSQLClient;
import io.vertx.ext.sql.SQLClient;
import io.vertx.ext.sql.SQLConnection;
import io.vertx.ext.sql.UpdateResult;

import java.sql.Timestamp;
import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        JsonObject dbConfig = new JsonObject()
                .put("host", "localhost")
                .put("username", "cola")
                .put("password", "password")
                .put("database", "cola");
//        insert into "cola"."content_item_set" ("id", "source", "timestamp") values (?, ?, cast(? as timestamp))
        SQLClient client = PostgreSQLClient.createShared(vertx, dbConfig);
        client.getConnection(sqlConnectionResult -> {
            if (sqlConnectionResult.succeeded()) {
                System.out.println("Got connection...");
                SQLConnection connection = sqlConnectionResult.result();
                String query = String.format(
                        "INSERT INTO content_item_set (id, source, timestamp) values ('%s','%s','%s')",
                        UUID.randomUUID(),
                        "hello",
                        new Timestamp(System.currentTimeMillis()));
                connection.update(query, result -> {
                    UpdateResult resultSet = result.result();
                    System.out.println(resultSet);
                    client.close();
                    vertx.close();
                });
            } else {

            }
        });
    }
}
