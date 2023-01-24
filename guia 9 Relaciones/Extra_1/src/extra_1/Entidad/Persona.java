package extra_1.Entidad;

public class Persona {
    private String nombre,apellido;
    private int edad;
    private long DNI;
    private Perro dogo;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, long DNI, Perro dogo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.dogo = dogo;
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

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public Perro getDogo() {
        return dogo;
    }

    public void setDogo(Perro dogo) {
        this.dogo = dogo;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " DNI: " + DNI + " Tiene: " + edad + " años y su perro es: " + verPerro();
    }
    
    private String verPerro(){
        if (dogo == null) {
            return " No tiene perro";
        }else{
            return dogo.toString();
        }
    }
}
