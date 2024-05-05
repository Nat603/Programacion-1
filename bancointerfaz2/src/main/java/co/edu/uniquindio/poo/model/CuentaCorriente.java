package co.edu.uniquindio.poo.model;

public class CuentaCorriente extends CuentaBancaria{
    private double sobregiro;

    public CuentaCorriente(int numeroCuenta, double saldo, boolean estado, Titular titular, double sobregiro) {
        super(numeroCuenta, saldo, estado, titular);
        assert sobregiro >= 0: "Error, el sobregiro no debe ser menor a 0";
        this.sobregiro = sobregiro;
    }

    public double getSobregiro() {
        return sobregiro;
    }
    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public void retirar(double valor) {
        if (valor > getSaldo() + sobregiro) {
            System.out.println("Error no tienes saldo suficiente");
            return;
        }
            setSaldo(sobregiro + getSaldo() - valor);

        if(valor> getSaldo()) {   
            setSobregiro(getSobregiro() -(valor - getSaldo()));
            return;
        }
    }
    
}
