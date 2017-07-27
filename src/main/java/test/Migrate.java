package test;

import org.flywaydb.core.Flyway;

public class Migrate {
    public static void main(String[] args) {
        Flyway flyway = new Flyway();
        flyway.setBaselineOnMigrate(true);
        flyway.setLocations("migrations");
        flyway.setDataSource(
                "jdbc:postgresql://localhost/cola",
                "cola",
                "password"
        );
        flyway.migrate();
    }
}
