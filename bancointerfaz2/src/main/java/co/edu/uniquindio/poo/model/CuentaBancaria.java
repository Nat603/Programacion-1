package co.edu.uniquindio.poo.model;


import java.util.Collection;
import java.util.LinkedList;

public abstract class CuentaBancaria {
    private final int numeroCuenta;
    private double saldo;
    private boolean estado;
    private Titular titular;
    private final Collection <Transaccion> listaTransacciones;

    public CuentaBancaria(int numeroCuenta, double saldo, boolean estado, Titular titular) {
        assert numeroCuenta >=0;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.estado = estado;
        this.titular = titular;
        this.listaTransacciones = new LinkedList<>();

    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void depositar (double valor){

        assert valor > 0;
        saldo =saldo + valor;
        estado= true;
    }

    public double consultarSaldo(){
        return saldo;
    }

    public void addTransaccion(Transaccion transaccion){

        assert!existeTransaccion(transaccion.getCodigo());

        listaTransacciones.add(transaccion);
    }

    public boolean existeTransaccion(int codigo) {
        return listaTransacciones.stream()
                .anyMatch(transaccion -> transaccion.getCodigo() == codigo);
    }



    public abstract void retirar(double valor);

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", estado=" + estado + ", titular="
                + titular + ", listaTransacciones=" + listaTransacciones + "]";
    }
  
    
}

