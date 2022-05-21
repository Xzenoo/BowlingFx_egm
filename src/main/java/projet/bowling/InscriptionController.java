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

import java.sql.SQLException;

public class InscriptionController {

    @FXML
    private Label LblErreur;

    @FXML
    private TextField fldCp;

    @FXML
    private TextField fldEmail;

    @FXML
    private RadioButton rbtnMale;

    @FXML
    private RadioButton rbtnFemale;

    @FXML
    private ToggleGroup Genre;

    @FXML
    private TextField fldMdp;

    @FXML
    private TextField fldNom;

    @FXML
    private TextField fldPrenom;

    @FXML
    private TextField fldRue;

    @FXML
    private TextField fldVille;

    private String genre;

    @FXML
    void BtnConnexion(ActionEvent event) {
        StartApplication.changeScene("/projet/bowling/hello-view","Connexion");
    }

    @FXML
    void Validez(ActionEvent event) throws SQLException {
        PratiquantRepository pratiquantRepository = new PratiquantRepository();
        if(rbtnMale.isSelected()){
            genre = "Homme";
        }else{
            genre = "Femme";
        }
        Pratiquant pratiquant = new Pratiquant(fldNom.getText(), fldPrenom.getText(), fldCp.getText(), fldRue.getText(), fldVille.getText(), fldEmail.getText(), fldMdp.getText(), genre);
        if (fldNom.getText().isEmpty() || fldPrenom.getText().isEmpty() || fldCp.getText().isEmpty() || fldRue.getText().isEmpty() || fldVille.getText().isEmpty() || fldEmail.getText().isEmpty() || fldMdp.getText().isEmpty()){
            LblErreur.setText("Case non remplie(s)");
            LblErreur.setVisible(true);
        }else{
            pratiquant = pratiquantRepository.inscription(pratiquant);
            StartApplication.changeScene("/projet/bowling/hello-view","Bowling!!");
            System.out.println(pratiquant.getNom());
        }

    }

}
