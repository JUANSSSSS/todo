package ejercicio_2.Servicices;

import java.util.*;
import ejercicio_2.Entidad.*;

public class JuegoServicio {
    Juego j1 = new Juego();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public void llenarJuego(ArrayList<Jugador> js,Revolver r){
        j1.setJugadores(js);
        j1.setGun(r);
    }
    
    public void ronda(JugadorServicio jugador){
        int cont=0;
        String op = "s";
        while(jugador.disparo(j1.getGun(), j1.getJugadores().get(cont)) && op.equalsIgnoreCase("s")){
            cont++;
            System.out.println("Pasar al siguiente jugador? (S/N)");
            op = sc.next();
            if (cont >= j1.getJugadores().size()) {
                cont = 0;
            }
        }
    }
}
