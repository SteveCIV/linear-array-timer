package dslab2;

import java.util.LinkedList;
/**
 *
 * @author conor
 */
public class LinkedListObject {
    LinkedList<Integer> linkedList;
    
    // constructor
    public LinkedListObject() {
        this.linkedList = new LinkedList();
    }
    
    // adds object to left 
    public void addLeft(int addObject) {
        linkedList.addFirst(addObject);
    }
    
    // adds object to right
    public void addRight(int addObject) {
        linkedList.addLast(addObject);
    }
    
    // prints entire linkedList
    @Override
    public String toString() {
        String output = "";
    
        return output;
    }
}
