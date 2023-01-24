package ejercicio_2.Entidad;

import java.util.*;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver gun;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver gun) {
        this.jugadores = jugadores;
        this.gun = gun;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getGun() {
        return gun;
    }

    public void setGun(Revolver gun) {
        this.gun = gun;
    }
    
    
}
