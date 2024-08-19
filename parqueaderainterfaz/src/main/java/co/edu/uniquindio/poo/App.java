
package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("viewParqueadero.fxml"));
        Parent root = fxmlLoader.load(); // Carga el archivo FXML
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Sistema de Parqueadero"); // es el título de la ventana
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
