package ejercicio_1.Entidad;

public class Perro {

    private String nombre, size, raza;
    private int edad;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String size) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.size = size;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return size;
    }

    public void setTamaño(String size) {
        this.size = size;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro: " + nombre + "," + size + ", raza: " + raza + ", edad: " + edad + " años";
    }
    
    
}
