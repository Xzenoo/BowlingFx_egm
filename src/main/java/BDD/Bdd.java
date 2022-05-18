package BDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Bdd {
    private Connection maConnexion;
    public Connection BddCo () throws SQLException {

        // Information nécessaire pour se connecter à la bdd
        String mysqlAdresse = "localhost:3306";   // l'adresse IP ou se trouve MySQL | Par défaut -> "localhost:3306" pour Mysql et "localhost:3307" pour MariaDB
        String mysqlBdd = "egm_BowlingFx";       // Le nom de votre BDD
        String mysqlUser = "bowling";      // le nom d'utilisateur de la BDD | Par défaut -> "root"
        String mysqlPassword = "b0ul1ng=)";  // le mot de passe de la BDD | Par défaut -> ""

        this.maConnexion = DriverManager.getConnection("jdbc:mysql://"+mysqlAdresse+"/"+mysqlBdd+"?serverTimezone=UTC", mysqlUser, mysqlPassword);
        return this.maConnexion;
    }
}