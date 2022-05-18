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

    public void connexion(Pratiquant pratiquant) throws SQLException {
        Bdd coBdd = new Bdd();
        PreparedStatement requeteSQL = coBdd.BddCo().prepareStatement("Select * from `Pratiquant` where mail=? and mdp=?");
        try{
            requeteSQL.setString(1,pratiquant.getEmail());
            requeteSQL.setString(2,pratiquant.getMdp());
            ResultSet mesResultats = requeteSQL.executeQuery();
            if (mesResultats.next()) {
                int last_inserted_id =mesResultats.getInt("id_user");
                pratiquant.setId_Pratiquant(last_inserted_id);
                StartApplication.changeScene("/projet/bowling/accueil", "Bowling!", new accueilController(this.));
                System.out.println(pratiquant.getId_Pratiquant());
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return;
    }

}
