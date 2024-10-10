package co.edu.uniquindo.patronesDiseno.FactoryMethod;
import co.edu.uniquindo.patronesDiseno.FactoryMethod.Factory.TelevisorLedFactory;
import co.edu.uniquindo.patronesDiseno.FactoryMethod.Factory.TelevisorOLedFactory;
import co.edu.uniquindo.patronesDiseno.FactoryMethod.Factory.TelevisorQLedFactory;
import co.edu.uniquindo.patronesDiseno.FactoryMethod.Service.ITelevisor;
import co.edu.uniquindo.patronesDiseno.FactoryMethod.Service.ITelevisorFactory;

public class MainFactoryMethod {
    public static void main(String[] args) {
        // Creamos una fábrica de Televisores LED
        ITelevisorFactory televisorLedFactory = new TelevisorLedFactory(55, "4K");
        ITelevisor televisorLed = televisorLedFactory.crearTelevisor();
        televisorLed.mostrarDetalles();

        // Creamos una fábrica de Televisores OLED
        ITelevisorFactory televisorOLedFactory = new TelevisorOLedFactory(65, true);
        ITelevisor televisorOLed = televisorOLedFactory.crearTelevisor();
        televisorOLed.mostrarDetalles();

        // Creamos una fábrica de Televisores QLED
        ITelevisorFactory televisorQLedFactory = new TelevisorQLedFactory(75, "8K", true);
        ITelevisor televisorQLed = televisorQLedFactory.crearTelevisor();
        televisorQLed.mostrarDetalles();
    }
}