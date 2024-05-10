package co.edu.uniquindio.poo;


public class Puesto {

    private final String nombre;
    private int[] posicion; // posicion[0] es la fila, posicion[1] es la columna
    private boolean disponibilidad;
    private Vehiculo vehiculo;


    public Puesto(String nombre, int fila, int columna, boolean disponibilidad) {
        this.nombre = nombre;
        this.posicion = new int[] {fila, columna};
        this.disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getPosicion() {
        return posicion;
    }

    public void setPosicion(int[] posicion) {
        this.posicion = posicion;
    }


    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getFila() {
        return posicion[0];
    }

    public int getColumna() {
        return posicion[1];
    }
    public boolean estaDisponible() {
        return disponibilidad;
    }


}
