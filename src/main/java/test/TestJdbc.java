package test;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Timestamp;
import java.util.UUID;

import static test.data.tables.ContentItemSet.CONTENT_ITEM_SET;

public class TestJdbc {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost/cola",
                "cola",
                "password")) {
            DSLContext context = DSL.using(conn, SQLDialect.POSTGRES);
            for (int i = 0; i < 50000; i++) {
                context.insertInto(CONTENT_ITEM_SET, CONTENT_ITEM_SET.ID, CONTENT_ITEM_SET.SOURCE, CONTENT_ITEM_SET.TIMESTAMP)
                        .values(UUID.randomUUID(), "2", new Timestamp(System.currentTimeMillis())).execute();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
