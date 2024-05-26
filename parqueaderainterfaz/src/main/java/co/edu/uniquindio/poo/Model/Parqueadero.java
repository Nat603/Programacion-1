package co.edu.uniquindio.poo.Model;

public class Parqueadero {
    private final String nombre;
    private int numeroPuestos;
    private Puesto[][] puestos;
  

    public Parqueadero(String nombre, int filas, int columnas, int puestos) {
        this.nombre = nombre;
        this.numeroPuestos = filas * columnas;
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

    public boolean verificarDisponibilidad(int fila, int columna) {
        for (Puesto[] filaPuestos : puestos) {
            for (Puesto puesto : filaPuestos) {
                if ((puesto.getFila() == fila || puesto.getColumna() == columna) && !puesto.estaDisponible()) {
                    return false; // Al menos un puesto está ocupado
                }
            }
        }
        return true; // Todos los puestos en la fila/columna están disponibles
    
    }

      


    public void setPuestos(Puesto[][] puestos) {
        this.puestos = puestos;
    }



    public Puesto[][] getPuesto() {
        return puestos;
    } 

}
