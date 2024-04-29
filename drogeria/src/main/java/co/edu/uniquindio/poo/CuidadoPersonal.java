package co.edu.uniquindio.poo;

public class CuidadoPersonal extends Producto {
    private final String ingredientes;

    public CuidadoPersonal(String codigoProducto, String nombre, String descripcion, double precio, int stock,
            String proovedor, String ingredientes) {
        super(codigoProducto, nombre, descripcion, precio, stock, proovedor);
        this.ingredientes = ingredientes;
    }

    public String getIngredientes() {
        return ingredientes;
    }

}
