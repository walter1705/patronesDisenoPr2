package co.edu.uniquindo.patronesDiseno.AbstractFactory.Model;

import co.edu.uniquindo.patronesDiseno.AbstractFactory.Service.IProducto;

public class EquipoSonido implements IProducto {
    private String color;
    private String tamano;

    public EquipoSonido(String color, String tamano) {
        this.color = color;
        this.tamano = tamano;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Equipo de sonido de color: " + color + ", Tamaño: " + tamano);
    }

    @Override
    public void encender() {
        System.out.println("EquipoSonido encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("EquipoSonido apagado.");
    }


}
