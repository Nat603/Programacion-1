package co.edu.uniquindio.poo.Model;

public class Propietario {
    private final String nombre;
    private final String id;

    
    public Propietario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public String getId() {
        return id;
    }

}
