package co.edu.uniquindio.poo;

public abstract class Persona {
    private final String nombre;
    private final String apellidos;
    private final String dni;
    private final String direccion;
    private final String telefono;

    
    public Persona(String nombre, String apellidos, String dni, String direccion, String telefono) {
 
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;

    }


    public String getNombre() {
        return nombre;
    }


    public String getApellidos() {
        return apellidos;
    }


    public String getDni() {
        return dni;
    }


    public String getDireccion() {
        return direccion;
    }


    public String getTelefono() {
        return telefono;
    }

    
}
