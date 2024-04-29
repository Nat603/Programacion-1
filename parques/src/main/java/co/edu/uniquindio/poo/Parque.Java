package co.edu.uniquindio.poo;

public record Parque(String nombre, String descripcion){

    assert nombres != null && !nombres.isBlank() : "El nombre debe ser diferente de null";
}