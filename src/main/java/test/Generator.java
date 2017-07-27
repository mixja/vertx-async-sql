package test;

import org.jooq.util.GenerationTool;
import org.jooq.util.jaxb.*;

public class Generator {
    public static void main(String[] args) {
        org.jooq.util.jaxb.Generate generateSettings = new org.jooq.util.jaxb.Generate();
        generateSettings.setDaos(true);
        generateSettings.setFluentSetters(true);
        generateSettings.setPojos(true);
        generateSettings.setInterfaces(true);

        Configuration configuration = new Configuration()
                .withJdbc(new Jdbc()
                        .withDriver("org.postgresql.Driver")
                        .withUrl("jdbc:postgresql://localhost/cola")
                        .withUser("cola")
                        .withPassword("password"))
                .withGenerator(new org.jooq.util.jaxb.Generator()
                        .withDatabase(new Database()
                                .withName("org.jooq.util.postgres.PostgresDatabase")
                                .withIncludes(".*")
                                .withExcludes("")
                                .withInputSchema("cola"))
                        .withTarget(new Target()
                                .withPackageName("test.data")
                                .withDirectory("src/main/java"))
                        .withGenerate(generateSettings));
        try {
            GenerationTool.generate(configuration);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
