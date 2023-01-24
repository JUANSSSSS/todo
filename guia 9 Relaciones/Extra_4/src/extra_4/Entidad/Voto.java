package extra_4.Entidad;

import java.util.*;

public class Voto {
    private Alumno alumno;
    private ArrayList<Alumno> alumnos;

    public Voto() {
    }

    public Voto(Alumno alumno, ArrayList<Alumno> alumnos) {
        this.alumno = alumno;
        this.alumnos = alumnos;
    }
    
    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

}
