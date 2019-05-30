package dslab2;

/**
 *
 * @author conor
 */
public class ArrayObject {
    int[] array;
    
    // default constructor
    ArrayObject() {
        this.array = new int[0];
    }
    
    // constructor
    ArrayObject(int length) {
        this.array = new int[length];
    }
    
    // adds object to left
    public void addLeft(int addValue) {
        for(int i = array.length; i > 0; i--) {
            try {
            array[i] = array[i-1];
            } catch(Exception e) {}
        }
        array[0] = addValue;
    }
    
    // adds object to right
    public void addRight(int addValue, int location) {
        array[location] = addValue;
    }
    
    // prints entire array
    @Override
    public String toString() {
        String output = "";
        for(int i = 0; i < array.length; i++) {
            output = output + array[i] + ",";
        }
        return output;
    }
}
