package co.edu.uniquindio.poo.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class ControllerCuentaBancaria {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnguardarcb;

    @FXML
    private CheckBox ckActivo;

    @FXML
    private CheckBox ckAhorros;

    @FXML
    private CheckBox ckCorriente;

    @FXML
    private CheckBox ckInactivo;

    @FXML
    private TextField txnumcuenta;

    @FXML
    private TextField txsaldo;

    @FXML
    void addCuentaBancaria(ActionEvent event) {
        System.out.println("Cuenta bancaria agregada exitosamente");

    }

    @FXML
    void initialize() {
        

    }

}

