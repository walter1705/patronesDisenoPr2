package co.edu.uniquindo.patronesDiseno.AbstractFactory.Model;

import co.edu.uniquindo.patronesDiseno.AbstractFactory.Service.IProducto;

public class Televisor implements IProducto {
    private String tamano;
    private String resolucion;

    public Televisor(String tamano, String resolucion) {
        this.tamano = tamano;
        this.resolucion = resolucion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Televisor de tamaño: " + tamano + ", Resolución: " + resolucion);
    }

    @Override
    public void encender() {
        System.out.println("Televisor encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Televisor apagado");
    }
}

