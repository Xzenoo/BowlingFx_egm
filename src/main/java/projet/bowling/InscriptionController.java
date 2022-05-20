package projet.bowling;

import apply.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import modele.Pratiquant;
import repository.PratiquantRepository;

public class InscriptionController {

    @FXML
    private Label LblErreur;

    @FXML
    private TextField Cp;

    @FXML
    private TextField Email;

    @FXML
    private RadioButton Male;

    @FXML
    private RadioButton Female;

    @FXML
    private ToggleGroup Genre;

    @FXML
    private TextField MDP;

    @FXML
    private TextField Nom;

    @FXML
    private TextField Prenom;

    @FXML
    private TextField Rue;

    @FXML
    private TextField Ville;

    @FXML
    void BtnConnexion(ActionEvent event) {
        StartApplication.changeScene("/projet/bowling/hello-view","Connexion");
    }

    @FXML
    void Validez(ActionEvent event) {
        PratiquantRepository pratiquantRepository = new PratiquantRepository();
        Pratiquant p = pratiquantRepository.inscription(Nom.getText(),Prenom.getText(),Cp.getText(),Rue.getText(),Ville.getText(),Email.getText(),MDP.getText(),Genre.getSelectedToggle());
        if(p != null){
            StartApplication.changeScene("/projet/bowling/inscription","Inscription");
            System.out.println(p.getNom());
        }else {
            LblErreur.setVisible(true);
        }

    }

}
