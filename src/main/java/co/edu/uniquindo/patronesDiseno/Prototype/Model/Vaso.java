package co.edu.uniquindo.patronesDiseno.Prototype.Model;

import co.edu.uniquindo.patronesDiseno.Prototype.Service.IVaso;

public class Vaso implements IVaso {
    private String tamano;
    private String color;
    private int capacidad;  // en mililitros
    private String mensaje;

    public Vaso(String mensaje, int capacidad, String color, String tamano) {
        this.mensaje = mensaje;
        this.capacidad = capacidad;
        this.color = color;
        this.tamano = tamano;
    }

    @Override
    public Vaso clone() {
        try {
            return (Vaso) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Vaso [color=" + color + ", capacidadMl=" + capacidad +
                ", logotipo=" + tamano + ", mensaje=" + mensaje + "]";
    }
}
