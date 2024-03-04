/**
 * Clase para probar el funcionamiento del código veterinaria
 * @author Área de programación UQ
 * @since 2024-03
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {

        LOG.info("Iniciado test de datos completos");


        Veterinaria veterinaria = new Veterinaria("Perros");

        

        Mascota mascota = new Mascota("306412", "Flufy", "Pomerania", "Cara de oso", (byte) 3, "Hembra", "Negro", (byte) 2);

        assertEquals("Perros", veterinaria.getNombre());
        assertEquals("306412", mascota.identificacion());
        assertEquals("Flufy", mascota.nombre());
        assertEquals("Pomerania", mascota.raza());
        assertEquals("Cara de oso", mascota.especie());
        assertEquals((byte)2, mascota.edad());
        assertEquals("Femenino", mascota.sexo());
        assertEquals("negro", mascota.color());
        assertEquals((byte)3, mascota.peso());
        LOG.info("Finalizando test de datos completos");
        System.out.println("Datos completos");
    }

    @Test
    public void agregarMascota(){
        LOG.info("Iniciado test agregar una mascota");

        Veterinaria veterinaria = new Veterinaria("Perros");

        Mascota mascota = new Mascota("306412", "Flufy", "Pomerania", "Cara de oso", (byte) 2, "Hembra", "negro", (byte) 3);
        

        veterinaria.registrarMascota(mascota);
          assertEquals(1, veterinaria.getMascotas().size());
          System.out.println("Mascota registrada correctamente.");

        LOG.info("Finalizando test agregar una mascota");
    }


    @Test
    public void veterinariaNula(){
        LOG.info("Iniciado test agregar una veterinaria nula");


        assertThrows(Throwable.class, ()-> new Veterinaria (null));
        System.out.println("Error: No hay datos para la creacion de la lista");

        LOG.info("Finalizando test agregar una veterinaria nula");
    }


    @Test

    public void estudianteRepetido() {
        LOG.info("Inicio test agregar mascota repetida");

        Veterinaria veterinaria = new Veterinaria("Perros");

        Mascota mascota1 = new Mascota("306412", "Flufy", "Pomerania", "Cara de oso", (byte) 2, "Hembra", "negro", (byte) 3);

        Mascota mascota2 = new Mascota("306412", "Layla", "Pincher","Miniatura", (byte) 5, "Macho", "Marron", (byte) 2);

        veterinaria.registrarMascota(mascota1);
        System.out.println("Mascota uno registrada correctamente.");
        
        veterinaria.registrarMascota(mascota2); {
            if (mascota2.identificacion() .equals (mascota1.identificacion())) {

                System.out.println("Error: La mascota con esta identificación  ya está registrada.");
            } 
            else {
                veterinaria.registrarMascota(mascota2);
                // Aquí puedes agregar el código para registrar la mascota en otros lugares si es necesario
                System.out.println("Mascota dos registrada correctamente.");
            }
        }
    
        
        }
    

    
    }






