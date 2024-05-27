package co.edu.uniquindio.poo.Model;
// clase abstracta Vehiculo la cual tiene varios atributos que hereda
public abstract class Vehiculo {
    private final String nombre;
    private final String placa;
    private final String modelo;
    private Propietario Propietario;
    private Puesto puestoPorVehiculo;// el puesto que esta asociado al vehiculo


    public Vehiculo(String nombre, String placa, String modelo,Propietario propietario, Puesto puestoPorVehiculo) {
        this.nombre = nombre;
        this.placa = placa;
        this.modelo = modelo;
        Propietario = propietario;
        this.puestoPorVehiculo = puestoPorVehiculo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPlaca() {
        return placa;
    }
    public String getModelo() {
        return modelo;
    }
    
    public Propietario getPropietario() {
        return Propietario;
    }
    public void setPropietario(Propietario propietario) {
        Propietario = propietario;
    }
    public Puesto getPuestoPorVehiculo() {
        return puestoPorVehiculo;
    }
    public void setPuestoPorVehiculo(Puesto puestoPorVehiculo) {
        this.puestoPorVehiculo = puestoPorVehiculo;
    }
   
}
