package dslab2;

import java.util.ArrayList;

/**
 *
 * @author conor
 */
public class ArrayListObject {
    ArrayList<Integer> arrayList;
    
    // constructor
    public ArrayListObject() {
        this.arrayList = new ArrayList();
    }
    
    // adds object to left
    public void addLeft(int addObject) {
        arrayList.add(0, addObject);
    }
    
    // adds object to right
    public void addRight(int addObject) {
        arrayList.add(addObject);
    }
    
    // prints entire arrayList
    @Override
    public String toString() {
        String output = "";
        for(Integer i : arrayList) {
            output = output  + i.toString() + ",";
        }
        return output;
    }
}
