package co.edu.uniquindio.poo.model;


public class Titular {
    private final String nombre;
    private final String apellido;

    public Titular(String nombre, String apellido) {
        assert nombre != null: "Error, el nombre no puede ser nulo";
        assert !nombre.isBlank(): "Error, el nombre no puede estar vacio";
        assert apellido != null: "Error, el apellido no puede ser nulo";
        assert !apellido.isBlank(): "Error, el apellido no puede estar vacio";
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    

    
}
