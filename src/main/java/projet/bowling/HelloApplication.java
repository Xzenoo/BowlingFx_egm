package projet.bowling;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class HelloApplication extends Application {

    private static Stage stage;

    @Override
    public void start(Stage firstStage) throws IOException {
        stage = firstStage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/projet/bowling/helloController.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Bowling!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();

    }

    public static void changeScene(String fichierFxml,String titre , Object controller){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fichierFxml+".fxml"));
        Scene scene = null;
        try {
            fxmlLoader.setController(controller);
            scene = new Scene(fxmlLoader.load());
            stage.setTitle(titre);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void changeScene(String fichierFxml, String titre){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fichierFxml+".fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
            stage.setTitle(titre);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Optional<ButtonType> validationDialog(String titre, String texte){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"titre alert");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(stage);
        alert.getDialogPane().setContentText(texte);
        alert.getDialogPane().setHeaderText(titre);
        return alert.showAndWait();
    }
}