package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Registro {

    private final LocalDate horaIngreso;
    private final LocalDate horaSalida; 
    private final Vehiculo vehiculo; 
    private Puesto puesto; 
    private Disponible disponibilidad;

   


    public Registro(LocalDate horaIngreso, LocalDate horaSalida, Vehiculo vehiculo, Puesto puesto) {
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.vehiculo = vehiculo;
        this.puesto = puesto;
    }




    public LocalDate getHoraIngreso() {
        return horaIngreso;
    }

    public LocalDate getHoraSalida() {
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

    public 

    public double calcularTarifa() {
        long horas = ChronoUnit.HOURS.between(horaIngreso, horaSalida); // calcular la cantidad de horas
        return horas * vehiculo.getTarifaHora(); // calcular la tarifa total
    }





}
