package co.edu.uniquindio.poo.Model;
//Clase propiestario la cual esta enlazada con un vehiculo desde la clase vehiculo

public class Propietario {
    private final String nombre;// atributos del propietario
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
