package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class PedidoTest {
    
    private static final Logger LOG = Logger.getLogger(PedidoTest.class.getName());

    @Test
    
    public void calcularValorPedido(){
        LOG.info("Inicio de la prueba metodo productos stok mayor a 100");

        LocalDate fecha = LocalDate.now(); 
        int cantidad = 5; 
        Pedido pedido = new Pedido(fecha, cantidad);
        Producto producto = new Medicamento("P1", "Producto 1", "Descripción 1", 120.0, 50, "Proveedor A", 3.4);
        pedido.setProducto(producto);

        double costoEsperado = 5 * 120.0; // Cantidad * Precio del producto
        assertEquals(costoEsperado, pedido.calcularCostoTotal(), 1e-6); // Tolerancia de error
   

        LOG.info("Fin de la prueba metodo productos stok mayor a 100");
    }
    
}
