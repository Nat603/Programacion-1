/**
 * Clase para probar el funcionamiento del código de el problema de veterinaria
 * @author Área de programación UQ
 * @since 2024-02
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for veterinaria
 */
public class MascotaTest {
    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());

    /**
     * 4 test para comprobar
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


    @Test
    public void datosNulos() {
        LOG.info("Iniciado test datos nulos");


        assertThrows(Throwable.class, ()-> new Mascota (null,null,null, (byte) 0, null,null, (byte) 3));


        LOG.info("Finalizando test datos nulos");
    }


    @Test
    public void edadNegativa() {
        LOG.info("Iniciado test edad negativa");

        assertThrows(Throwable.class, ()-> new Mascota ("Flufy", "Pomerania", "Cara de oso", (byte) -2, "Femenino", "negro", (byte) 3));

        LOG.info("Finalizando test edad negativa");
    }


    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datos vacios");

        assertThrows(Throwable.class, ()-> new Mascota ("Flufy","Pomerania","", (byte) 2, "Femenino","", (byte) 3));

        LOG.info("Finalizando test datos vacios");
    }
}





