package co.edu.uniquindio.poo;

import java.util.Collection;

public class Admismistrador {

    private final String nombre;
    private double tarifaHora;
    private final Collection <Registro> listaRegistros;
    
    
    public Admismistrador(String nombre, double tarifaHora, Collection<Registro> listaRegistros) {
        this.nombre = nombre;
        this.tarifaHora = tarifaHora;
        this.listaRegistros = listaRegistros;
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Registro> getListaRegistros() {
        return listaRegistros;
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
            if (moto.equals(Moto.CLASICA)) {
                tarifaHora = 2000;
            } else if (moto.equals(Moto.HIBRIDA)) {
                tarifaHora = 2000;
            }
        }
        }
    
        public double dineroTotal() {
            double total = 0;
            for (Registro registro : listaRegistros) {
                total += registro.calcularTarifa();
            }
            return total;
        
        }
    

    }

    

    
}