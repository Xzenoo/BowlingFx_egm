package projet.bowling;

import apply.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import modele.Pratiquant;
import repository.PratiquantRepository;

public class ConnexionController {

    @FXML
    private Label LblErreur;

    @FXML
    void BtnConnexion(ActionEvent event) {
        PratiquantRepository pratiquantRepository = new PratiquantRepository();
        pratiquantRepository.connexion(pratiquant);
        LblErreur.setVisible(true);
    }

    @FXML
    void BtnInscription(ActionEvent event) {
        StartApplication.changeScene("/projet/bowling/inscription","Inscription", new InscriptionController());
    }
}