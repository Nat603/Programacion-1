package co.edu.uniquindio.poo;

public record Mascota(String nombre, String raza, String especie, byte edad, String sexo, String color, byte peso) {

    public Mascota {

        assert nombre != null && !nombreis.Blanck;
        assert raza != null && !razais.Blanck;
        assert especie != null && !especieis.Blanck;
        assert sexo != null && !sexois.Blanck;
        assert color != null && !coloris.Blanck;
        assert edad >= (byte) 0;
    }

}
