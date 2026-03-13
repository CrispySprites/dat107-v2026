package no.hvl.dat107;

public class Databaseoppsett {
    public static final String JDBC_DRIVER = "org.postgresql.Driver";

    public static final String DATABASE = "h187985";   // Endre til din databae = ditt brukernavn
    public static final String BRUKERNAVN = "h187985"; // Endre til ditt brukernavn
    public static final String PASSORD = "pass";    // Endre til ditt passord

    public static final String TJENER_OG_PORT = "ider-database.westeurope.cloudapp.azure.com:5433";
    public static final String DB_URL = "jdbc:postgresql://" + TJENER_OG_PORT + "/" + DATABASE;
}
