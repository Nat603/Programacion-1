package co.edu.uniquindio.poo;


public abstract class Vehiculo {
    private final String nombre;
    private final String placa;
    private final String modelo;
    private final double tarifaHora;
    private Propietario Propietario;
    private Puesto puestoPorVehiculo;


    public Vehiculo(String nombre, String placa, String modelo, double tarifaHora,
            co.edu.uniquindio.poo.Propietario propietario, Puesto puestoPorVehiculo) {
        this.nombre = nombre;
        this.placa = placa;
        this.modelo = modelo;
        this.tarifaHora = tarifaHora;
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
    public double getTarifaHora() {
        return tarifaHora;
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

