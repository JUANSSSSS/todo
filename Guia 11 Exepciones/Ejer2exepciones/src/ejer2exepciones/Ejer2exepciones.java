
package ejer2exepciones;

/**
 *
 * @author juanb
 */
public class Ejer2exepciones {

   
    public static void main(String[] args) {
          int[] array = {1, 2, 3, 4, 5};
    ArrayData arrayData = new ArrayData(array);
 
    System.out.println("Elemento 0: " + arrayData.getElement(0));
    System.out.println("Elemento 1: " + arrayData.getElement(1));
    System.out.println("Elemento 5: " + arrayData.getElement(5));
  }
} 
    
    

