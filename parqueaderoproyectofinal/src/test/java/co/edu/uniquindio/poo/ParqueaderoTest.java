package co.edu.uniquindio.poo;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class ParqueaderoTest {
    private static final Logger LOG = Logger.getLogger(ParqueaderoTest.class.getName());

    @Test
    public void parqueaderoDatosCompletos(){
        LOG.info("Iniciado test parqueadero datos completos");

        Parqueadero parqueadero = new Parqueadero("Mi Parqueadero", 3, 4, 12);
        Puesto puestoOcupado = new Puesto("puesto 1", 1, 1, false);
        Propietario propietario1= new Propietario("Juan", "1866743652");
        Carro carro1 = new Carro("Miata", "312AF", "12", 2000, propietario1, puestoOcupado);
        Registro registro1= new Registro(null, null, carro1, puestoOcupado);
        
        LOG.info("Finalizando test parqueadero datos completos");

    }


    
    
}
