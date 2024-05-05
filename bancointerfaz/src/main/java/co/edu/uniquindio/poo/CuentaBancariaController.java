package co.edu.uniquindio.poo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class CuentaBancariaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAddCuentaBancaria;

    @FXML
    private CheckBox checkEstadoActivo;

    @FXML
    private CheckBox checkEstadoInactivo;

    @FXML
    private CheckBox ckCuentaAhorros;

    @FXML
    private CheckBox ckCuentaCorriente;

    @FXML
    private TextField txNumeroCuenta;

    @FXML
    private TextField txSaldo;

    @FXML
    void addCuentaBancaria(ActionEvent event) {
        System.out.println("Cuenta bancaria creada");

    }

    @FXML
    void initialize() {
        
    }

}

