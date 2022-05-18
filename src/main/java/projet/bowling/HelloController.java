package projet.bowling;

import apply.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import modele.Pratiquant;

public class HelloController {

    @FXML
    private Label LblErreur;

    @FXML
    void BtnConnexion(ActionEvent event) {

    }

    @FXML
    void BtnInscription(ActionEvent event) {
        StartApplication.changeScene("/projet/bowling/inscription","Inscription", new InscriptionController());
    }
}