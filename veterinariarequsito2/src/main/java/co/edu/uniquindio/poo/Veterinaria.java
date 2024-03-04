package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Lista que agrupa las mascotas de una veterinaria
 * 
 * @author Área de programación UQ
 * @since 2024-03
 * 
 *        Licencia GNU/GPL V3.0
 *        (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
 

 public class Veterinaria {
    private final String nombre;
    private final Collection<Mascota> mascotas;

    /**
     * Método constructor de la clase Veterinaria
     * 
     * @param nombre Nombre del curso
     */
    public Veterinaria (String nombre) {
        assert nombre != null : "El nombre no puede ser nulo";
        this.nombre = nombre;
        mascotas = new LinkedList<>();
    }

    /**
     * Método para obtener el nombre de la lista de la veterinaria
     * 
     * @return Nombre de la lista de la veterinaria
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para agregar una mascota a veterinaria
     * 
     * @param mascota Mascota que se desea agregar
     */
    public void registrarMascota(Mascota mascota) {
        if (mascota == null){
            throw new NullPointerException("Error, ingrese los datos corectamente");
        }
        mascotas.add(mascota);
    
    }


    /**
     * Método para obtener la colección NO modificable de las macotas de la veterinaria
     * 
     * @return la colección NO modificable de las mascotas de la veterinaria
     */
    public Collection<Mascota> getMascotas() {
        return Collections.unmodifiableCollection(mascotas);
    }

    /*
    *  función filtra las mascotas según su edad y devuelve una lista con aquellas que tienen más de 10 años.
    */
     
   public List <Mascota> obtenerMascotasMayores10(){

    List <Mascota> mascotasMayores10 = new ArrayList<>();
    for (Mascota mascota: mascotas){
        if (mascota.edad() >(byte) 10){
            mascotasMayores10.add(mascota);
        }
    }
    return mascotasMayores10;
   }
}