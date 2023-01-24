package manos_a_la_obra.Entidad;

import manos_a_la_obra.Entidad.*;
import java.util.*;

public class Equipo {
    private ArrayList<Jugador> jugadores;

    public Equipo() {
    }

    public Equipo(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return jugadores+"";
    }
    
}
