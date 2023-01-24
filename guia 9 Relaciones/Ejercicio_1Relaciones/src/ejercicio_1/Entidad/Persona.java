package ejercicio_1.Entidad;

public class Persona {
    private String nombre,apellido;
    private int edad;
    private Perro dogo;
    private long documento;

    public Persona(String nombre, String apellido, int edad, Perro dogo, long documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dogo = dogo;
        this.documento = documento;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Perro getDogo() {
        return dogo;
    }

    public void setDogo(Perro dogo) {
        this.dogo = dogo;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", edad: " + edad + ", Perro: " + dogo + ", DNI:" + documento;
    }
    
    
}
