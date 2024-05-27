package co.edu.uniquindio.poo.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
//Clase de administrador la cual tine lista de registros y metodos para calcular el dinero total en un dia y un mes


public class Administrador {
    private final String nombre;// nombre del admin
    private double tarifaHora;//el administrador es el que elige la terifa dependiendo del tipo de vehiculo
    public double getTarifaHora() {
        return tarifaHora;
    }


    private final Collection <Registro> listaRegistros;// se crea la lista de registros

    public Administrador(String nombre, double tarifaHora, Administrador administrador) {
        this.nombre = nombre;
        this.tarifaHora = tarifaHora;
    
        this.listaRegistros = new LinkedList<>();//construnctor de los atributos anteriores
    
    }
    public void addRrgistro(Registro registro){
        assert!existeRegistro(registro.getHoraIngreso());
        listaRegistros.add(registro);//medoto que agrega registros dependiendo de otro metodo que dice si ya existe por la hora en la que ingresa en carro
        
    }

    public boolean existeRegistro(LocalDateTime horaIngreso){
        
        return listaRegistros.stream()
        .anyMatch(cuenta -> cuenta.getHoraIngreso()==(horaIngreso));//metodo que dice si hay un registro con la misma hora y retorna true o false

    }
    public String getNombre() {
        return nombre;
    }

    public Collection<Registro> getListaRegistros() {
        return listaRegistros;
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
            // metodo que dice cual es la tarifa dependiendo de el tipo de vehiculo
        }
    }

    public List<Registro> obtenerRegistrosPorMes(int mes) {// metodo que obtiene los registros creados durante un mes
        List<Registro> registrosPorMes = new ArrayList<>();

        for (Registro registro : listaRegistros) {
            LocalDate fechaIngreso = registro.getHoraIngreso().toLocalDate();// se utiliza el atributo de horaIngreso
            if (fechaIngreso.getMonthValue() == mes) {//con ese atributo se obtienen los meses con MonthValue y dice si es igual a un mes especifico
                registrosPorMes.add(registro);// todos los registros que esten en ese mes se agregan a esta lista
            }
        }

        return registrosPorMes;
    }

    
    public double calcularIngresosDelMes(List<Registro> registrosPorMes) {//este metodo calcula el dinero total de un mes 

        double totalMesIngresos = 0;

        for (Registro registro : registrosPorMes) {// a partir de la lista que creamos antes
             double valor = registro.calcularTarifa(); // obtenemos todas las tarifas
        

        totalMesIngresos += valor;// los ingresos totales son iguales a la suma de cada tarifa obtenida en cada registro
    }

         return totalMesIngresos ;
    }



    public List<Registro> registrosDelDia(List<Registro> listaRegistros, LocalDateTime horaIngreso, LocalDateTime horaSalida){//metodo que obtiene los registros de un dia

       List<Registro> registrosDelDia = new ArrayList<>();

    for (Registro registro : listaRegistros) {
        if (registro.getHoraIngreso().toLocalDate().equals(horaIngreso.toLocalDate())) {//si el dia de ese registro es el mismo que quiero
            
            registrosDelDia.add(registro);// se añade a la lista
        }
    }

    return registrosDelDia;
    }


    public double calcularIngresosDelDia(List<Registro> registroDelDia) {//metodo que calcula la cantidad de dinero del parqueadero en un dia

        double totaDiaIngresos = 0;

        for (Registro registro : registroDelDia) {//de la lista que creamos del dia
             double valor = registro.calcularTarifa(); // se obtiene cuando costo ese registro
        

        totaDiaIngresos += valor;//suma lo que obtubo cada registro de la lista
    }

         return totaDiaIngresos ;
    }
    
    
    public double dineroTotal() {// metodo que calcula los ingresos totales del parqueadero
     double total = 0;
         for (Registro registro : listaRegistros) {//de la lista de registros
                total += registro.calcularTarifa();//suma cada uno de lo que obtubo cada registro
         }
        return total;
        
     }
    
}
