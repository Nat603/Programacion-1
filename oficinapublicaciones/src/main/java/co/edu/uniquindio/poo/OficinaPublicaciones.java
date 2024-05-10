package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class OficinaPublicaciones {

    private final  String nombre;

    private EquipoElectronico[] listaEquiposElectronicos;
    private CentroImpresion centroImpresion;
    private ArrayList<Publicacione> solicitudes;


    public OficinaPublicaciones(String nombre) {
        this.nombre = nombre;
        this.listaEquiposElectronico = new listaEquiposElectronico [5];
        this.centroImpresion = new CentroImpresion("El centro de impresion");
        this.solicitudes = new ArrayList<>();
    }


    public void setListaEquiposElectronicos(equiposElectronico[] listaEquiposElectronicos) {
        this.listaEquiposElectronicos = listaEquiposElectronicos;
    }


    public void setCentroImpresion(CentroImpresion centroImpresion) {
        this.centroImpresion = centroImpresion;
    }


    public void setSolicitudes(ArrayList<Publicacione> solicitudes) {
        this.solicitudes = solicitudes;
    }


    public String getNombre() {
        return nombre;
    }


    public equiposElectronico[] getListaEquiposElectronicos() {
        return listaEquiposElectronicos;
    }


    public CentroImpresion getCentroImpresion() {
        return centroImpresion;
    }


    public ArrayList<Publicacione> getSolicitudes() {
        return solicitudes;
    }


    @Override
    public String toString() {
        return "OficinaPublicaciones [nombre=" + nombre + ", listaEquiposElectronicos="
                + Arrays.toString(listaEquiposElectronicos) + ", centroImpresion=" + centroImpresion + ", solicitudes="
                + solicitudes + "]";
    }

    public void imprimirPublicacion(Publicacion publicacion){

    }
    
}
