package co.edu.uniquindio.poo;
import java.util.Collection;
import java.util.LinkedList;

public abstract class CuentaBancaria {
    private final int numeroCuenta;
    private double saldo;
    private boolean estado;
    private final Collection <Transaccion> listaTransacciones;

    public CuentaBancaria(int numeroCuenta, double saldo, boolean estado) {
        assert numeroCuenta >=0;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.estado = estado;
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

    public boolean existeTransaccion(int codigo){

        return listaTransacciones.stream()
        .anyMatch(transaccion -> transaccion.getCodigo()==(codigo));

}

    public abstract void retirar(double valor);
}
