package co.edu.uniquindio.poo;

public abstract class Producto {
    private final String codigoProducto;
    private final String nombre;
    private final String descripcion;
    private final double precio;
    private final int stok;
    private final String proovedor;

    public Producto(String codigoProducto, String nombre, String descripcion, double precio, int stock,String proovedor){

        assert stock >0;
        this.codigoProducto= codigoProducto;
        this.nombre= nombre;
        this.descripcion= descripcion;
        this.stok= stock;
        this.precio= precio;
        this.proovedor= proovedor;
    }
    

    public String getCodigoProducto(){
        return codigoProducto;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public double getPrecio(){
        return precio;
    }

    public int getStok(){
        return stok;
    }

    public String getProovedor(){
        return proovedor;
    }


}
