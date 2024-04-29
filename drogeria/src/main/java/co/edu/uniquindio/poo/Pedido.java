package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Pedido {
    private final LocalDate fecha;
    private final int cantidad;
    Cliente cliente;
    Producto producto;

    public Pedido(LocalDate fecha, int cantidad) {
        this.fecha = fecha;
        this.cantidad = cantidad;
    }


    public LocalDate getFecha() {
        return fecha;
    }
    public int getCantidad() {
        return cantidad;
    }

    public double calcularCostoTotal() {
        if (producto != null) {
            return cantidad * producto.getPrecio();
        } else {
            throw new IllegalStateException("No se ha asignado un producto al pedido.");}
        }

    public void setProducto(Producto producto2) {
    
        this.producto= producto2;
    }
    
}
