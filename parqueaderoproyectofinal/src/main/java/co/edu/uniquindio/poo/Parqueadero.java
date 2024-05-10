package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Parqueadero {

    private final String nombre;
    private int numeroPuestos;
    private final Collection <Registro> listaRegistros;
    private Puesto[][] puestos;


    public Parqueadero(String nombre, int filas, int columnas, Collection<Registro> listaRegistros) {
        this.nombre = nombre;
        this.numeroPuestos = filas * columnas;

        this.listaRegistros = new LinkedList<>();
        this.puestos = new Puesto[filas][columnas]; 
    }


    public String getNombre() {
        return nombre;
    }


    public int getNumeroPuestos() {
        return numeroPuestos;
    }


    public void setNumeroPuestos(int numeroPuestos) {
        this.numeroPuestos = numeroPuestos;
    }


    public Collection<Registro> getListaRegistros() {
        return listaRegistros;
    }

    public void agregarRegistro(Registro registro) {
        listaRegistros.add(registro);
    }





    public boolean verificarDisponibilidad(int fila, int columna) {
        for (Puesto[] filaPuestos : puestos) {
            for (Puesto puesto : filaPuestos) {
                if ((puesto.getFila() == fila || puesto.getColumna() == columna) && !puesto.estaDisponible()) {
                    return false;
                }
            }
        }
        return true; 
    }
    

    public double dineroTotal() {
        double total = 0;
        for (Registro registro : listaRegistros) {
            total += registro.calcularTarifa();
        }
        return total;
    }


}
