
package ejer2exepciones;

/**
 *
 * @author juanb
 */
class ArrayData {
      private final int[] array;
 
  public ArrayData(int[] array) {
    this.array = array;
  }
 
  public int getElement(int index) {
    try {
      return array[index];
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Índice de arreglo fuera de rango: " + index);
      return -1;
    }
  }
}

