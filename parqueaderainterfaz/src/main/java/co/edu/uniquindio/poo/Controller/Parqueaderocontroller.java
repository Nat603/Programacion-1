package co.edu.uniquindio.poo.Controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Parqueaderocontroller {

    @FXML
    private ComboBox<String> opVehiculo;

    @FXML
    private TextField txNumPuestos;

    @FXML
    private TextField txProrietario;

    @FXML
    private TextField txadmin;

    @FXML
    private TextField txregistro;

    @FXML
    void initialize() {
        // Configura el ComboBox con opciones
        opVehiculo.setItems(FXCollections.observableArrayList(
                "Carro", "Moto", "Moto hibrida", "Moto clasica"
            
        ));

    }
}
