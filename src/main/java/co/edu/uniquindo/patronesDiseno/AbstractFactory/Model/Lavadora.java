package co.edu.uniquindo.patronesDiseno.AbstractFactory.Model;

import co.edu.uniquindo.patronesDiseno.AbstractFactory.Service.IProducto;

public class Lavadora implements IProducto {
    private int capacidadKg;
    private String color;

    public Lavadora(int capacidadKg, String color) {
        this.capacidadKg = capacidadKg;
        this.color = color;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Lavadora con capacidad de: " + capacidadKg +
                " kg, Color: "+color);
}

    @Override
    public void encender() {
        System.out.println("Lavadora encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("Lavadora apagada.");
    }
}
