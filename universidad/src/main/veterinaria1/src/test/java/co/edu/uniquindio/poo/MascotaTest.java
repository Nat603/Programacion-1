/**
 * Clase para probar el funcionamiento del código de el problema de veterinaria
 * @author Área de programación UQ
 * @since 2024-02
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class MascotaTest {
    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datos completos");
        

        Mascota mascota = new Mascota("Flufy", "Pomerania", "Cara de oso", (byte) 2, "Femenino", "negro", (byte) 3);

        assertEquals("Flufy", mascota.nombre());
        assertEquals("Pomerania", mascota.raza());
        assertEquals("Cara de oso", mascota.especie());
        assertEquals((byte)2, mascota.edad());
        assertEquals("Femenino", mascota.sexo());
        assertEquals("negro", mascota.color());
        assertEquals((byte)3, mascota.peso());


        LOG.info("Finalizando test datos completos");
    }

    
}
