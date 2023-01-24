
package iron.man;

import java.util.Random;

/**
 *
 * @author juanb
 */
public class Radar {
    private final int resistance;
    private final int coordinates;
    private final int hostility;
 
   
    public Radar() {
        Random random = new Random();
        this.resistance = random.nextInt(10);
        this.coordinates = random.nextInt(10);
        this.hostility = random.nextInt(10);
    }
 
    
    public int getResistance() {
        return resistance;
    }
 
    public int getCoordinates() {
        return coordinates;
    }
 
    public int getHostility() {
        return hostility;
    }
}
