package ejercicio_2.Servicices;

import java.util.Random;
import ejercicio_2.Entidad.Revolver;

public class RevolverServicio {
    public Revolver LenarRevolver(Revolver gun){
        Random r = new Random();
        gun.setPosicionDeAgua(r.nextInt(7));
        gun.setPosicionDeDisparo(r.nextInt(7));
        return gun;
    }
    
    public boolean mojar(Revolver gun){
        return gun.getPosicionDeAgua() == gun.getPosicionDeDisparo();
    }
    
    public void siguienteChorro(Revolver gun){
        gun.setPosicionDeDisparo(gun.getPosicionDeDisparo()+1);
        if(gun.getPosicionDeDisparo() > 6){
            gun.setPosicionDeDisparo(0);
        }
    }
}
