package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class ProductoTest {
    private static final Logger LOG = Logger.getLogger(ProductoTest.class.getName());

    @Test
    public void StokMenor0(){
    LOG.info("Inicio de la prueba stok menor a 0");


    assertThrows(Throwable.class, () -> new Medicamento("12334", "Loratadina", "Producto para las alergias", 1.200, 0, "LAFRANCOL", 2.3));

    LOG.info("Finalizando test stok menor a 0");
}

   @Test
   public void stockMayor100(){

    LOG.info("Inicio de la prueba metodo productos stok mayor a 100");
    var drogueria = new Drogueria("Mi Droguería");
    var listaProductos = new LinkedList<>();

    
    listaProductos.add(new Medicamento("P1", "Producto 1", "Descripción 1", 120.0, 50, "Proveedor A", 3.4));
    listaProductos.add(new Medicamento("P2", "Producto 2", "Descripción 2", 80.0, 200, "Proveedor B", 3.3));
    listaProductos.add(new Medicamento("P3", "Producto 3", "Descripción 3", 150.0, 110, "Proveedor C", 5.2));

    for (Producto producto : listaProductos) {
            drogueria.addProducto(producto);
        }


        List<Producto> resultado = drogueria.getProductosConStockMayorA100();

    
        assertEquals(2, resultado.size());

   }

}