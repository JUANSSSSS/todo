
package ejer4exepiones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author juanb
 */
public class Ejer4Exepiones {

    
    public static void main(String[] args) {
    
		try (Scanner entrada = new Scanner(System.in)) {
                    try {
                        System.out.print("Ingrese un número entero: ");
                        int num = entrada.nextInt();
                        
                        System.out.print("Ingrese una cadena de caracteres: ");
                        String cadena = entrada.next();
                        
                        int suma = num + Integer.parseInt(cadena);
                        int resta = num - Integer.parseInt(cadena);
                        int multiplicacion = num * Integer.parseInt(cadena);
                        int division = num / Integer.parseInt(cadena);
                        
                        System.out.println("La suma es: " + suma);
                        System.out.println("La resta es: " + resta);
                        System.out.println("La multiplicación es: " + multiplicacion);
                        System.out.println("La división es: " + division);
                        
                    } catch (InputMismatchException e) {
                        System.out.println("¡Error! Debe ingresar un número entero");
                    } catch (NumberFormatException e) {
                        System.out.println("¡Error! La cadena no se puede convertir a entero");
                    } catch (ArithmeticException e) {
                        System.out.println("¡Error! No se puede dividir por cero");
                    }
                }
    }
}
	
