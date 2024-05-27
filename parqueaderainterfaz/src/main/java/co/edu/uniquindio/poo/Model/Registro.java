package co.edu.uniquindio.poo.Model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
// clase registro que tiene la fecha de ungreso y salida del vehiculo, el vehiculo y el puesto asociado ael vehiculo
public class Registro {
    private final LocalDateTime horaIngreso;
    private final LocalDateTime horaSalida; 
    private final Vehiculo vehiculo; 
    private Puesto puesto;
    private final Administrador administrador;


    public Registro(LocalDateTime horaIngreso, LocalDateTime horaSalida, Vehiculo vehiculo, Puesto puesto, Administrador administrador) {
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.vehiculo = vehiculo;
        this.administrador= administrador;
        if (puesto.estaDisponible()) {
            // si el  puesto está disponible
            this.puesto = puesto;// entonces al puesto
            puesto.setDisponibilidad(false);// se le cambia la disponibilidad porque ahora esta ocupado
        } else {
            System.out.println("El puesto está ocupado, por favor inténtelo de nuevo e ingrese otro puesto");//de lo contario le manda al sistema un mensaje para ingrese otro puesto
        }
        
    }
    public Administrador getAdministrador() {
        return administrador;
    }

    public LocalDateTime getHoraIngreso() {
        return horaIngreso;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }


    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }


    public double calcularTarifa() {//metodo que calcula el total di dinero dependiendo del tipo de carro y la cantidad de tiempo que estuvo en el parqueadero 
        long horas = ChronoUnit.HOURS.between(horaIngreso, horaSalida);// de las horas que han pasado entre las dos variables 
        double valor = horas * administrador.getTarifaHora(); // Se obtiene la tarifa del administrador y se multiplica por la cantidad de horas calculadas antes
        return valor;
    }
 
}
