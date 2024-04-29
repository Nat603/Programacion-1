package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empleado {

    private List<Producto> listaProductos; 

    public Gerente(String nombre, String apellidos, String dni, String direccion, String telefono,double sueldo){
        super(nombre, apellidos, dni, direccion, telefono, sueldo);
    this.listaProductos = new ArrayList<>(); 
}

    public void agregarProducto(Producto agregarProducto){
        if (listaProductos.contains(agregarProducto)) {
            listaProductos.remove(agregarProducto);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Producto no encontrado en la lista.");
        }
    }
    


    public void eliminarProducto(Producto eliminaProducto){
        if (listaProductos.contains(eliminaProducto)) {
            listaProductos.remove(eliminaProducto);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Producto no encontrado en la lista.");
        }
    }
}