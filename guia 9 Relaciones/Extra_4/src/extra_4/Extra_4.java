package extra_4;

import java.util.*;
import extra_4.Entidad.*;

public class Extra_4 {

    public static void main(String[] args) {
        Simulador sim = new Simulador();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese cuantos alumnos quiere crear: ");
        int len = sc.nextInt();
        ArrayList<String> nombres = sim.crearAlumnos(len);
        System.out.println("--------------------------------------");
        ArrayList<Long> dnis = sim.crearDNI(len);
        System.out.println("Alumnos creados correctamente");
        ArrayList<Alumno> alumnos = sim.asignarAlumnos(nombres, dnis, len);
        sim.mostrarAl(alumnos);
        sim.votar(alumnos);
        System.out.println("--------------------------------------");
        sim.mostrarAl(alumnos);
        System.out.println("-------:::Mostrando votacion:::-------");
        sim.mostrarVotos(alumnos);
        sim.recuentoVotos(alumnos);
        System.out.println("--------------------------------------");
        sim.facilitadores(alumnos);
    }

}
