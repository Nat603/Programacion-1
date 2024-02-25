package co.edu.uniquindio.poo;

public record Mascota(String nombre, String raza, String especie, byte edad, String sexo, String color, byte peso) {

    public Mascota {

        assert nombre != null;
        assert raza != null;
        assert especie != null;
        assert sexo != null;
        assert color != null;
        assert edad >= (byte) 0;
        assert nombre != "";
        assert raza != "";
        assert especie != "";
        assert sexo != "";
        assert color != "";
    }
    


}
