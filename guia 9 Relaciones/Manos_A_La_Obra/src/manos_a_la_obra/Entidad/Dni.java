package manos_a_la_obra.Entidad;

public class Dni {
    private String caracter;
    private long dni;

    public Dni() {
    }

    public Dni(String caracter, long dni) {
        this.caracter = caracter;
        this.dni = dni;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Dni:" + caracter + "-" + dni;
    }
    
    
    
}
