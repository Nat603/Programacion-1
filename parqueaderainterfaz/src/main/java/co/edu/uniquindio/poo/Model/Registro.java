package co.edu.uniquindio.poo.Model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Registro {
    private final LocalDateTime horaIngreso;
    private final LocalDateTime horaSalida; 
    private final Vehiculo vehiculo; 
    private Puesto puesto;


    public Registro(LocalDateTime horaIngreso, LocalDateTime horaSalida, Vehiculo vehiculo, Puesto puesto) {
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.vehiculo = vehiculo;
        if (puesto.estaDisponible()) {
            // El puesto está disponible
            this.puesto = puesto;
            puesto.setDisponibilidad(false);
        } else {
            System.out.println("El puesto está ocupado, por favor inténtelo de nuevo e ingrese otro puesto");
        }
        
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


    public double calcularTarifa() {
        
        long horas = ChronoUnit.HOURS.between(horaIngreso, horaSalida); // calcular la cantidad de horas
        double valor = horas * vehiculo.getTarifaHora(); // calcular la tarifa total
        return valor; 
    }

 
}
