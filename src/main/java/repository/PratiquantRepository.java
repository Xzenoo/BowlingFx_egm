package repository;

import BDD.Bdd;
import modele.Pratiquant;

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
        PreparedStatement requeteSQL = coBdd.BddCo().prepareStatement("Select * from `Pratiquant` where email=? and mdp=?");
        try{
            requeteSQL.setString(1,mail);
            requeteSQL.setString(2,mdp);
            ResultSet mesResultats = requeteSQL.executeQuery();
            if (mesResultats.next()) {
                pratiquant = new Pratiquant(mesResultats.getInt("id_pratiquant"), mesResultats.getString("nom"), mesResultats.getString("prenom"),mesResultats.getInt("cp"),mesResultats.getString("rue"),mesResultats.getString("ville"),mesResultats.getString("email"), mesResultats.getString("mdp"),mesResultats.getString("genre"),mesResultats.getBoolean("estAdmin"));
                System.out.println(pratiquant.getId_Pratiquant());
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return pratiquant;
    }

    public int inscription()throws SQLException{
        Pratiquant pratiquant = null;
            Bdd coBdd = new Bdd();
            PreparedStatement requeteSql = coBdd.BddCo().prepareStatement("INSERT INTO `pratiquant` (nom,prenom,cp,rue, ville, email, mdp,genre,estAdmin) VALUES (?,?,?,?,?,?,?,?,?)");
            requeteSql.setString(1,pratiquant.getNom());
            requeteSql.setString(2,pratiquant.getPrenom());
            requeteSql.setInt(3,pratiquant.getCp());
            requeteSql.setString(4,pratiquant.getRue());
            requeteSql.setString(5,pratiquant.getVille());
            requeteSql.setString(6,pratiquant.getEmail());
            requeteSql.setString(7,pratiquant.getMdp());
            requeteSql.setBoolean(8,false);

        return requeteSql.executeUpdate();
        }

}
