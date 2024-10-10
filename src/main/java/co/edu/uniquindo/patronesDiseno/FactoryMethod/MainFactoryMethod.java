package co.edu.uniquindio.proyecto;
import co.edu.uniquindio.proyecto.methodFactory.*;

public class Main {
    public static void main(String[] args) {
        // Creamos una fábrica de Televisores LED
        TelevisorFactory televisorLedFactory = new TelevisorLedFactory(55, "4K");
        Televisor televisorLed = televisorLedFactory.crearTelevisor();
        televisorLed.mostrarDetalles();

        // Creamos una fábrica de Televisores OLED
        TelevisorFactory televisorOLedFactory = new TelevisorOLedFactory(65, true);
        Televisor televisorOLed = televisorOLedFactory.crearTelevisor();
        televisorOLed.mostrarDetalles();

        // Creamos una fábrica de Televisores QLED
        TelevisorFactory televisorQLedFactory = new TelevisorQLedFactory(75, "8K", true);
        Televisor televisorQLed = televisorQLedFactory.crearTelevisor();
        televisorQLed.mostrarDetalles();
    }
}