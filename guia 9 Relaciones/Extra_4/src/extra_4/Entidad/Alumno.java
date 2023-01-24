package extra_4.Entidad;

import java.util.Comparator;

public class Alumno {
    private int puntos;
    private long DNI;
    private String nombreComp;
    private Voto voto;

    public Alumno() {
    }

    public Alumno(int puntos, long DNI, String nombreComp) {
        this.puntos = puntos;
        this.DNI = DNI;
        this.nombreComp = nombreComp;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getNombreComp() {
        return nombreComp;
    }

    public void setNombreComp(String nombreComp) {
        this.nombreComp = nombreComp;
    }
    
    public Voto getVoto() {
        return voto;
    }

    public void setVoto(Voto voto) {
        this.voto = voto;
    }
    @Override
    public String toString() {
        return nombreComp + " tiene: " + puntos + " pulsos DNI: " + DNI;
    }
    
    public static Comparator<Alumno> compararCantVotos = new Comparator<Alumno>(){
        @Override
        public int compare(Alumno a2, Alumno a1){
            return a1.getPuntos() - a2.getPuntos();
        }
    };
}
