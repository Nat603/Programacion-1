package co.edu.uniquindio.poo;

public abstract class Empleado extends Persona {
    private final double sueldo;

    public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono,double sueldo){
        super(nombre, apellidos, dni, direccion, telefono);
        this.sueldo= sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    
}
