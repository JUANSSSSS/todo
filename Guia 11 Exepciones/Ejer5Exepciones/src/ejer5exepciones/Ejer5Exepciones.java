package ejer5exepciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juanb
 */
public class Ejer5Exepciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int intentos = 0;
        int numeroAdivinar = rand.nextInt(500) + 1;
        System.out.println("Bienvenido al juego. Intentemos adivinar un número entre 1 y 500. ¿Cuál crees que es?");
        while (true) {
            try {
                int adivina = sc.nextInt();
                intentos++;
                if (adivina == numeroAdivinar) {
                    System.out.println("¡Correcto! Has adivinado el número en " + intentos + " intentos. ¡Felicidades!");
                    break;
                } else {
                    if (adivina < numeroAdivinar) {
                        System.out.println("No, el número que hay que adivinar es mayor.");
                    } else {
                        System.out.println("No, el número que hay que adivinar es menor.");
                    }
                }
            } catch (Exception e) {
                sc.next();
                System.out.println("Por favor, introduce un número entero.");
                intentos++;
            }
        }
    }
}
