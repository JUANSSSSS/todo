package ejercicio_2;

import ejercicio_2.Servicices.*;
import java.util.*;
import ejercicio_2.Entidad.Revolver;

public class Ejercicio_2 {

    public static void main(String[] args) {
        JuegoServicio juego = new JuegoServicio();
        JugadorServicio jugador = new JugadorServicio();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Revolver r = new Revolver();
        RevolverServicio revolver = new RevolverServicio();
        r = revolver.LenarRevolver(r);
        System.out.println("Ingrese el numero de jugadores (El maximo es 6 jugadores)");
        juego.llenarJuego(jugador.ingresarJugadores(sc.nextInt()), r);
        juego.ronda(jugador);
        
    }

}
