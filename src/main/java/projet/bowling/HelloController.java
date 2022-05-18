package projet.bowling;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import repository.PratiquantRepository;

public class HelloController {

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

    }
}