package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Drogueria {
    private final String nombre;
    private final Collection <Producto> listaProductos;
    private final Collection <Pedido> listaPedidos;
    private final Collection <Cliente> listaClientes;
    private final Collection <Empleado> listaEmpleados;


    public Drogueria(String nombre){

        assert nombre != null:"Error el nombre no puede ser nulo";
        assert !nombre.isBlank():"Error el nombre no puede ser vacio";

        this.nombre= nombre;
        this.listaClientes = new LinkedList<>();
        this.listaEmpleados = new LinkedList<>();
        this.listaPedidos = new LinkedList<>();
        this.listaProductos = new LinkedList<>();

    }

    public String getNombre(){
        return nombre;
    }

    public void addCliente(Cliente cliente){

        assert!existeCliente(cliente.getNombre());

        listaClientes.add(cliente);
    }


    public void addEmpleado(Empleado empleado){

        assert!existeEmpleado(empleado.getNombre());

        listaEmpleados.add(empleado);
    }


    public void addPedido(Pedido pedido){

        assert!existePedido(pedido.getFecha());

        listaPedidos.add(pedido);
    }

    public void addProducto(Producto producto){

        assert!existeProducto(producto.getNombre());

        listaProductos.add(producto);
    }




    private boolean existeCliente(String nombre){
        return listaClientes.stream()
        .anyMatch(cliente -> cliente.getNombre().equals(nombre));
    }


    private boolean existeEmpleado(String nombre){

        return listaClientes.stream()
        .anyMatch(cliente -> cliente.getNombre().equals(nombre));
    }

    private boolean existePedido(LocalDate fecha){

        return listaPedidos.stream()
        .anyMatch(pedido -> pedido.getFecha().equals(fecha));

    }

    private boolean existeProducto(String nombre){

        return listaProductos.stream()
        .anyMatch(producto-> producto.getCodigoProducto().equals(nombre));
}

public List<Producto> getProductosConStockMayorA100() {
    List<Producto> resultado = new ArrayList<>();
    for (Producto producto : listaProductos) {
        if (producto.getStok() > 100) {
            resultado.add(producto);
        }
    }
    return resultado;
}
}
