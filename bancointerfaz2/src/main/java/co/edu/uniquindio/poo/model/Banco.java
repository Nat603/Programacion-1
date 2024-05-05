package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Banco {
    private final String nombre;
    private final Collection <CuentaBancaria> listaCuentaBancarias;
    private final Collection <Titular> listaTitulares;

    public Banco (String nombre){
        assert nombre != null: "Error, el nombre no puede seer nulo";
        assert !nombre.isBlank(): "Error, el nombre no puede ser vacio";

        this.nombre= nombre;
        this.listaCuentaBancarias = new LinkedList<>();
        this.listaTitulares = new LinkedList<>();

    }

    public String getNombre(){
        return nombre;
    }
    public void addCuentaBancaria(CuentaBancaria cuenta){

        assert!existeCuentaBancaria(cuenta.getNumeroCuenta());

        listaCuentaBancarias.add(cuenta);
    }

    public boolean existeCuentaBancaria(int numeroCuenta){

            return listaCuentaBancarias.stream()
            .anyMatch(cuenta -> cuenta.getNumeroCuenta()==(numeroCuenta));

    }

    public void addTitular(Titular titular){

        assert!existeTitular(titular.getNombre());

        listaTitulares.add(titular);
    }

    public boolean existeTitular(String nombre){

        return listaTitulares.stream()
        .anyMatch(titular -> titular.getNombre().equals(nombre));
    }

    public void transferirSaldo(int numeroCuentaOrigen, int numeroCuentaDestino, double monto) {
        // Buscar las cuentas por número de cuenta
        CuentaBancaria cuentaOrigen = buscarCuentaPorNumero(numeroCuentaOrigen);
        CuentaBancaria cuentaDestino = buscarCuentaPorNumero(numeroCuentaDestino);

        if (cuentaOrigen == null || cuentaDestino == null) {
            System.out.println("Error: Una o ambas cuentas no existen.");
            return;
        }
        if (!cuentaOrigen.isEstado() || !cuentaDestino.isEstado()) {
            System.out.println("Error: Una o ambas cuentas no están activas.");
            return;
        }

        if (monto < 0) {
            System.out.println("Error: El monto a transferir debe ser mayor o igual a 0.");
            return;
        }

        cuentaOrigen.retirar(monto);
        cuentaDestino.depositar(monto);

        System.out.println("Transferencia exitosa: $" + monto + " transferidos de la cuenta " +
                cuentaOrigen.getNumeroCuenta() + " a la cuenta " + cuentaDestino.getNumeroCuenta());
    }

    private CuentaBancaria buscarCuentaPorNumero(int numeroCuenta) {
        return listaCuentaBancarias.stream()
                .filter(cuenta -> cuenta.getNumeroCuenta() == numeroCuenta)
                .findFirst()
                .orElse(null);
    }
    

}
