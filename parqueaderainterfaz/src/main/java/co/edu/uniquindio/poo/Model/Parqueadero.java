package co.edu.uniquindio.poo.Model;
//Clase parqueadero la cual tiene un matriz de puestos y un metodo que dice si es puesto esta o no disponible
public class Parqueadero {
    private final String nombre;
    private int numeroPuestos;
    private Puesto[][] puestos;//matriz de puestos
  

    public Parqueadero(String nombre, int filas, int columnas, int puestos) {
        this.nombre = nombre;
        this.numeroPuestos = filas * columnas;
        this.puestos = new Puesto[filas][columnas];// la matriz se coompone de filas y columnas
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

    public boolean verificarDisponibilidad(int fila, int columna) {//metodo que dice si un puesto esta disponible o no
        for (Puesto[] filaPuestos : puestos) {
            for (Puesto puesto : filaPuestos) {
                if ((puesto.getFila() == fila || puesto.getColumna() == columna) && !puesto.estaDisponible()) {// si de una misma columna y fila no esta disponible retorna falso
                    return false;
                }
            }
        }
        return true; // Si esta disponible retorna true
    
    }

      


    public void setPuestos(Puesto[][] puestos) {
        this.puestos = puestos;
    }



    public Puesto[][] getPuesto() {
        return puestos;
    } 

}
