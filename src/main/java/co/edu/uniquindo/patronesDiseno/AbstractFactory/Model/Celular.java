package co.edu.uniquindo.patronesDiseno.AbstractFactory.Model;

import co.edu.uniquindo.patronesDiseno.AbstractFactory.Service.IProducto;

public class Celular implements IProducto {
    private String procesador;
    private int numeroCamaras;

    public Celular(String procesador, int numeroCamaras) {
        this.procesador = procesador;
        this.numeroCamaras = numeroCamaras;
        }
    @Override
    public void mostrarInformacion() {
        System.out.println("Celular con procesador: " + procesador + ", Número de cámaras: "
                + numeroCamaras);
    }

    @Override
    public void encender() {
        System.out.println("Celular encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("Celular apagado.");
    }
}
