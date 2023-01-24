package ejer3extrarelaciones;

import java.util.Date;

/**
 *
 * @author juanb
 */
public class Ejer3ExtraRelaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de objetos
        Cliente cliente1 = new Cliente("Juan", "Perez", "12345678", "juan@gmail.com", "Calle 123", "12345678");
        Vehiculo vehiculo1 = new Vehiculo("Ford", "Fiesta", 2015, "123456789ABC", "123456789ABC", "Negro", "Sedan");
        Poliza poliza1 = new Poliza("Efectivo", "Total");
        Poliza poliza1 = new Poliza("Poliza1", "Cliente1");
        Cuota cuota1 = new Cuota(1, 100.0, false, "03/09/2020", "Transferencia");

        poliza1.addCuota(cuota1);

        System.out.println("La cuota 1 de la póliza1 es: ");
        System.out.println(poliza1.getCuotas().get(0).toString());
    }
}
