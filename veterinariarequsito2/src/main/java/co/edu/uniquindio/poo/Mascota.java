package co.edu.uniquindio.poo;

/**
 * Registro que agrupa los datos de una mascota
 * 
 * @author Área de programación UQ
 * @since 2024-03
 * 
 *        Licencia GNU/GPL V3.0
 *        (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */

public record Mascota(String identificacion, String nombre, String raza, String especie, byte edad, String sexo, String color, byte peso) {

    public Mascota {

        assert identificacion != null && !identificacion.isBlank();
        assert nombre != null && !nombre.isBlank();
        assert raza != null && !raza.isBlank();
        assert especie != null && !especie.isBlank();
        assert sexo != null && !sexo.isBlank();
        assert color != null && !color.isBlank();
        assert edad >= (byte) 0;
    }

}
