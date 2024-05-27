package co.edu.uniquindio.poo.Model;
//Clase moto que hereda de Vehiculo 
public class Moto extends Vehiculo {

    private final String velocidadMaxima;//moto tiene un atributo propio
    private final TipoMoto tipoMoto;//hay varios tipos de motos

    public Moto(String nombre, String placa, String modelo, co.edu.uniquindio.poo.Model.Propietario propietario,
            Puesto puestoPorVehiculo, String velocidadMaxima, TipoMoto tipoMoto) {
        super(nombre, placa, modelo, propietario, puestoPorVehiculo);
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
