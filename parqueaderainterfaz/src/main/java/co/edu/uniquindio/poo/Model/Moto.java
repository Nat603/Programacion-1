package co.edu.uniquindio.poo.Model;

public class Moto extends Vehiculo {

    private final String velocidadMaxima;
    
    private final TipoMoto tipoMoto;
    public Moto(String nombre, String placa, String modelo, double tarifaHora,
            co.edu.uniquindio.poo.Model.Propietario propietario, Puesto puestoPorVehiculo, String velocidadMaxima,
            TipoMoto tipoMoto) {
        super(nombre, placa, modelo, tarifaHora, propietario, puestoPorVehiculo);
        this.velocidadMaxima = velocidadMaxima;
        this.tipoMoto = tipoMoto;
    
    }



    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public TipoMoto getTipoMoto() {
        return tipoMoto;
    }
    
}
