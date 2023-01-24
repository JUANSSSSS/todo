package manos_a_la_obra;

import manos_a_la_obra.Entidad.*;
import java.util.*;

public class Manos_A_La_Obra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String nombre, apellido, caracter;
        long dni;
        System.out.println("-------------------------------------------------");
        //Tambien puedes ingresar todo por teclado cambiando las variables por el Scanner(sc)
        System.out.println("Manos a la obra (Objeto persona con atributo Dni)");
        System.out.println("Ingrese el nombre de la persona:");
        nombre = "Juan Jose";
        System.out.println("Ingrese el apellido de la persona:");
        apellido = "Benaiges";
        System.out.println("Ingrese el caracter de dni:");
        caracter = "M";
        System.out.println("Ingrese el numero de dni:");
        dni = 27519098;
        Dni d = new Dni(caracter, dni);
        Persona p = new Persona(nombre, apellido, d);

        System.out.println(p);

        System.out.println("-------------------------------------------------");
        System.out.println("Ejercicio Jugador");
        System.out.println("Creando equipo...");
        String[] nombres = {"LeBron", "Steph", "Gianis"};
        String[] Apellidos = {"James", "Curry", "Antetokuompo"};
        String[] posicion = {"Small forward", "Point guard", "Power forward"};
        int[] numeros = {3, 30, 34};

        Equipo allstar = new Equipo();
        ArrayList<Jugador> jugadores = new ArrayList();

        for (int i = 0; i < 3; i++) {
            Jugador j1 = new Jugador(nombres[i], Apellidos[i], posicion[i], numeros[i]);
            jugadores.add(j1);
        }

        allstar.setJugadores(jugadores);

        System.out.println(allstar);

        System.out.println("-------------------------------------------------");

    }

}
