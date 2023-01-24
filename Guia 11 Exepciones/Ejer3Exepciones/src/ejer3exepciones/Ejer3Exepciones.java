/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer3exepciones;

import java.util.Scanner;

/**
 *
 * @author juanb
 */
public class Ejer3Exepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        String num1 = scanner.nextLine();
        System.out.println("Ingrese el segundo número: ");
        String num2 = scanner.nextLine();

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        int resultado = n1 / n2;
        System.out.println("El resultado de la división es: " + resultado);
    }
}
