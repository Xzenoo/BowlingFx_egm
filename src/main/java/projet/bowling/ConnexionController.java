package projet.bowling;

import apply.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import modele.Pratiquant;
import repository.PratiquantRepository;

import java.sql.SQLException;

public class ConnexionController {

    @FXML
    private Label LblErreur;

    @FXML
    private TextField fldEmail;

    @FXML
    private PasswordField fldMdp;

    @FXML
    void BtnConnexion(ActionEvent event) throws SQLException {
        PratiquantRepository pratiquantRepository = new PratiquantRepository();
        Pratiquant p = pratiquantRepository.connexion(fldEmail.getText(), fldMdp.getText());
        if(p != null){
            StartApplication.changeScene("/projet/bowling/accueil", "Bowling!", new accueilController(p));
            System.out.println(p.getNom());
        }else {
            LblErreur.setVisible(true);
        }
    }

    @FXML
    void BtnInscription(ActionEvent event) {
        StartApplication.changeScene("/projet/bowling/inscription","Inscription", new InscriptionController());
    }
}