package ejercicio_2.Servicices;

import java.util.*;
import ejercicio_2.Entidad.*;

public class JugadorServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Jugador> jugadores = new ArrayList();
    RevolverServicio gun = new RevolverServicio();

    public ArrayList<Jugador> ingresarJugadores(int nj) {
        if (nj > 6) {
            nj = 6;
        }
        for (int i = 0; i < nj; i++) {
            Jugador J1 = new Jugador();
            System.out.println("Ingresando Jugador #" + (i + 1));
            J1.setID(i + 1);
            System.out.print("Ingrese el Nombre del jugador: ");
            J1.setNombre(sc.next());
            J1.setMojado(true);
            jugadores.add(J1);
        }
        return jugadores;
    }

    public boolean disparo(Revolver r, Jugador j1) {
        System.out.println("-------------------------------------");
        System.out.println("Apuntando a jugador " + j1.getNombre());
        System.out.println("Disparas!");
        if (gun.mojar(r)) {
            System.out.println("! Se mojo el Jugador !");
            j1.setMojado(false);
        } else {
            System.out.println("Se salvo el jugador");
            j1.setMojado(true);
        }
        System.out.println("Jugador " + j1.getNombre());
        System.out.println("-------------------------------------");
        if(j1.isMojado() == false){
            System.out.println("Se acaba el juego " +j1.getNombre() + " Pierde!");
        }
        gun.siguienteChorro(r);
        return j1.isMojado();
    }

}
