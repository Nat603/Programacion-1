package co.edu.uniquindio.poo;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * 
 *
 */
public class Proyecto {
   private final String nombre;
   private final Collection<Parque> parques;


public Proyecto(String nombre) {
    assert nombre != null : "El nombre no puede ser nulo";
    this.nombre = nombre;
    parques = new LinkedList<>();
}


    public String getNombre() {
        return nombre;
}

public void agregarParque(Parque parques) {

    parques.add(parque);
}
}