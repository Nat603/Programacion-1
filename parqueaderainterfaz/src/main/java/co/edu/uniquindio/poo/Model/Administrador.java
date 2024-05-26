package co.edu.uniquindio.poo.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Administrador {
    private final String nombre;
    private double tarifaHora;
    private final Collection <Registro> listaRegistros;

    public Administrador(String nombre, double tarifaHora) {
        this.nombre = nombre;
        this.tarifaHora = tarifaHora;
    
        this.listaRegistros = new LinkedList<>();
    
    }
    public void addR(Registro registro){
        assert!existeRegistro(registro.getHoraIngreso());
        listaRegistros.add(registro);
        
    }

    public boolean existeRegistro(LocalDateTime horaIngreso){
        
        return listaRegistros.stream()
        .anyMatch(cuenta -> cuenta.getHoraIngreso()==(horaIngreso));

    }
    public String getNombre() {
        return nombre;
    }

    public Collection<Registro> getListaRegistros() {
        return listaRegistros;
    }
    public void addRegistro(Registro registro){
        listaRegistros.add(registro);
    }
    
    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public void elegirTarifa(Vehiculo vehiculo) {
        if (vehiculo instanceof Carro) {
            tarifaHora = 2000;
        } else if (vehiculo instanceof Moto) {
            Moto moto = (Moto) vehiculo;
            if (moto.getTipoMoto().equals(TipoMoto.CLASICA)) {
                tarifaHora = 2000;
            } else if (moto.getTipoMoto().equals(TipoMoto.HIBRIDA)) {
                tarifaHora = 2000;
            }
            
        }
    }

    public List<Registro> obtenerRegistrosPorMes(int mes) {
        List<Registro> registrosPorMes = new ArrayList<>();

        for (Registro registro : listaRegistros) {
            LocalDate fechaIngreso = registro.getHoraIngreso().toLocalDate();
            if (fechaIngreso.getMonthValue() == mes) {
                registrosPorMes.add(registro);
            }
        }

        return registrosPorMes;
    }

    
    public double calcularIngresosDelMes(List<Registro> registrosPorMes) {

        double totalMesIngresos = 0;

        for (Registro registro : registrosPorMes) {
             double valor = registro.calcularTarifa(); 
        

        totalMesIngresos += valor;
    }

         return totalMesIngresos ;
    }



    public List<Registro> registrosDelDia(List<Registro> listaRegistros, LocalDateTime horaIngreso, LocalDateTime horaSalida){

       List<Registro> registrosDelDia = new ArrayList<>();

    for (Registro registro : listaRegistros) {
        if (registro.getHoraIngreso().toLocalDate().equals(horaIngreso.toLocalDate())) {
            
            registrosDelDia.add(registro);
        }
    }

    return registrosDelDia;
    }


    public double calcularIngresosDelDia(List<Registro> registroDelDia) {

        double totaDiaIngresos = 0;

        for (Registro registro : registroDelDia) {
             double valor = registro.calcularTarifa(); 
        

        totaDiaIngresos += valor;
    }

         return totaDiaIngresos ;
    }
    
    
    public double dineroTotal() {
     double total = 0;
         for (Registro registro : listaRegistros) {
                total += registro.calcularTarifa();
         }
        return total;
        
     }
    
}
