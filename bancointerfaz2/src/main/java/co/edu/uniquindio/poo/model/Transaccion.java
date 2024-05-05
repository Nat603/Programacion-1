package co.edu.uniquindio.poo.model;


import java.time.LocalDateTime;

public class Transaccion {
    private final int codigo;
    private final double valor;
    private final LocalDateTime fecha;
    private final boolean estado;
    private final String descripcion;
    private TipoTransaccion tipo;

    public Transaccion(int codigo, double valor, LocalDateTime fecha, boolean estado, String descripcion, TipoTransaccion tipo) {
        this.codigo = codigo;
        this.valor = valor;
        this.fecha = fecha;
        this.estado = estado;
        this.descripcion = descripcion;
        this.tipo=tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public TipoTransaccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransaccion tipo) {
        this.tipo = tipo;
    }
    
    
}

