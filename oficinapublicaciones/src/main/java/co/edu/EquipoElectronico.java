package co.edu;

import java.time.LocalDate;

public abstract class EquipoElectronico {
    private final String codigo;
    private final String nombre;
    private final String marca;
    private final LocalDate fechaAdquisicion;
    
    public EquipoElectronico(String codigo, String nombre, String marca, LocalDate fechaAdquisicion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    
}
