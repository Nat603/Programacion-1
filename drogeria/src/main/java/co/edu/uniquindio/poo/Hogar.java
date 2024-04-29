package co.edu.uniquindio.poo;

public class Hogar extends Producto{
    private final String indicaciones;

    public Hogar (String codigoProducto, String nombre, String descripcion, double precio, int stock,String proovedor, String indicaciones){
        super(codigoProducto, nombre, descripcion, precio, stock, proovedor);
        this.indicaciones= indicaciones;

    }

    public String getIndicaciones() {
        return indicaciones;
    }

}
