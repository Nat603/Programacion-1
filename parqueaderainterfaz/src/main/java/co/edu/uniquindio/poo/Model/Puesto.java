package co.edu.uniquindio.poo.Model;
// clase Puesto la cual tiene posiciones dice si esta disponible o no y esta relacionada con un vehiculo si esta ocupado

public class Puesto {
    private final String nombre;
    private int[] posicion; 
    public boolean disponibilidad;
    private Vehiculo vehiculo;


    public Puesto(String nombre, int fila, int columna, boolean disponibilidad) {
        this.nombre = nombre;
        this.posicion = new int[] {fila, columna};// la posicion esta dentro de una fila y una columna
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

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {//metodo que dice si esta disponible o no el puesto
        this.disponibilidad = disponibilidad;
        if (!disponibilidad) {
            this.vehiculo = null; // Si no está disponible, no hay vehículo asociado
        }
    }
}
