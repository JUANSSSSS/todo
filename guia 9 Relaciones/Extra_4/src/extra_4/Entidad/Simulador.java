package extra_4.Entidad;

import java.util.*;

public class Simulador {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Random r = new Random();

    public ArrayList<String> crearAlumnos(int len) {
        ArrayList<String> nombresCom = new ArrayList();
        String[] nombres = {"Paco", "Antonio", "Raul", "Miriam", "Sergio", "Eric"};
        String[] apellidos = {"Gonzalez", "Jimenez", "Lopez", "Palacino", "Velasco", "Benaiges"};
        for (int i = 0; i < len; i++) {
            nombresCom.add(nombres[r.nextInt(6)] + " " + apellidos[r.nextInt(6)]);
        }
        return nombresCom;
    }

    public ArrayList<Long> crearDNI(int len) {
        HashSet<Long> nums = new HashSet();
        do {
            nums.clear();
            for (int i = 0; i < len; i++) {
                long dni = r.nextInt( 99999999);
                nums.add(dni);
            }
        } while (nums.size() < len);
        ArrayList<Long> DNIS = new ArrayList();
        DNIS.addAll(nums);
        return DNIS;
    }

    public ArrayList<Alumno> asignarAlumnos(ArrayList<String> nombres, ArrayList<Long> DNIS, int len) {
        ArrayList<Alumno> alumnos = new ArrayList();
        ArrayList<String> nombresCom = crearAlumnos(len);
        ArrayList<Long> Dnis = crearDNI(len);
        for (int i = 0; i < len; i++) {
            Alumno al = new Alumno();
            al.setNombreComp(nombresCom.get(i));
            al.setDNI(Dnis.get(i));
            al.setPuntos(0);
            alumnos.add(al);
        }
        return alumnos;
    }

    public void mostrarAl(ArrayList<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public void votar(ArrayList<Alumno> alumnos) { //ARREGLAR 
        for (int i = 0; i < alumnos.size(); i++) {
            Voto voto = new Voto();
            voto.setAlumno(alumnos.get(i));
            voto.setAlumnos(tresVotos(alumnos, alumnos.get(i)));
            alumnos.get(i).setVoto(voto);
        }
        for (Alumno a : alumnos) {
            for (Alumno b : alumnos) {
                if (b.getVoto().getAlumnos().contains(a)) {
                    a.setPuntos(a.getPuntos() + 1);
                }
            }
        }

    }

    public ArrayList<Alumno> tresVotos(ArrayList<Alumno> alumnos, Alumno votante) {
        ArrayList<Alumno> aux = new ArrayList(alumnos);
        aux.remove(votante);
        Collections.shuffle(aux);
        ArrayList<Alumno> retorno = new ArrayList();
        for (int i = 0; i < 3; i++) {
            retorno.add(aux.get(i));
        }
        return retorno;
    }

    public void mostrarVotos(ArrayList<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombreComp() + " Voto a: ");
            for (Alumno votados : alumno.getVoto().getAlumnos()) {
                System.out.println(votados.getNombreComp());
            }
        }
    }

    public void recuentoVotos(ArrayList<Alumno> alumnos) {
        System.out.println("----::-:Mostrando votos totales:::----");
        int votos = 0;
        for (Alumno alumno : alumnos) {
            for (Alumno votados : alumno.getVoto().getAlumnos()) {
                votos++;
            }
        }
        System.out.println("En total son: " + votos + " votos");
    }

    public void facilitadores(ArrayList<Alumno> alumnos) {
        alumnos.sort(Alumno.compararCantVotos);
        ArrayList<Alumno> facili = new ArrayList();
        ArrayList<Alumno> subFacili = new ArrayList();
        if (alumnos.size() > 10) {
            for (int i = 0; i < 5; i++) {
                facili.add(alumnos.get(i));
            }
            for (int i = 5; i < 10; i++) {
                subFacili.add(alumnos.get(i));
            }
            System.out.println("Mostrando facilitadores");
            for (Alumno alumno : facili) {
                System.out.println(alumno.getNombreComp() + " con: " + alumno.getPuntos() + " Pulzos");
            }
            
            System.out.println("Mostrando sub facilitadores");
            for (Alumno alumno : subFacili) {
                System.out.println(alumno.getNombreComp() + " con: " + alumno.getPuntos() + " Pulzos");
            }
        }else{
            System.out.println("Tu lista de alumnos es demaciado corta para asignar facilitadores");
        }
    }
}
