package repository;

import BDD.Bdd;
import apply.StartApplication;
import modele.Pratiquant;
import projet.bowling.accueilController;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PratiquantRepository {

    private String table = "Pratiquant";
    private Bdd coBdd;

    public void PratiquantRepository(){
        coBdd =new Bdd();
    }

    public Pratiquant connexion(String mail, String mdp) throws SQLException {
        Pratiquant pratiquant = null;
        Bdd coBdd = new Bdd();
        PreparedStatement requeteSQL = coBdd.BddCo().prepareStatement("Select * from `Pratiquant` where mail=? and mdp=?");
        try{
            requeteSQL.setString(1,mail);
            requeteSQL.setString(2,mdp);
            ResultSet mesResultats = requeteSQL.executeQuery();
            if (mesResultats.next()) {
                pratiquant = new Pratiquant(mesResultats.getInt("id_pratiquant"), mesResultats.getString("nom"), mesResultats.getString("prenom"),mesResultats.getInt("cp"),mesResultats.getString("rue"),mesResultats.getString("ville"),mesResultats.getString("email"),mesResultats.getString("genre"),mesResultats.getBoolean("estAdmin"));
                System.out.println(pratiquant.getId_Pratiquant());
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return pratiquant;
    }

}
