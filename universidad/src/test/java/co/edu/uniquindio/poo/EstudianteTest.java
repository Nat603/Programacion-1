/**
 * Clase para probar el funcionamiento de un codigo del proyecto universidad en null
 * @author Área de programación UQ
 * @since 2024-02
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;



public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());


    @Test
    public void datosNull() {
        LOG.info("Iniciado test datos null");

        assertThrows Throwable.class, () -> new Estudiante ( )
        


        LOG.info("Finalizando test datos null");

    }
}

