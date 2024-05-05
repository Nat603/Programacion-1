package co.edu.uniquindio.poo;

public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(int numeroCuenta, double saldo, boolean estado, double tasaInteres) {
        super(numeroCuenta, saldo, estado);
        this.tasaInteres = tasaInteres;
    }

    @Override

    public void retirar(double valor){

        assert valor > 0;
        assert valor <= getSaldo();
        setSaldo(getSaldo() - valor); 

        if (getSaldo()== 0 ){

            setEstado(false);
        }
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    
}
