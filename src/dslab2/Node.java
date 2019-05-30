package dslab2;

/**
 *
 * @author conor
 */
public class Node {
    private Node next, prev;
    private Double data;
    
    public Node() {
        this.data = 0.0;
        this.next = null;
        this.prev = null;
    }
    
    public Node(Double data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    
    public Node getNext() {
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
    
    public Node getPrev() {
        return prev;
    }
    
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    
    public double getData() {
        return data;
    }
    
    public void setData(Double data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        String output = "";
        try {
            output = "<-" + prev.getData() + " | " + data.toString() + " | " + next.getData() + "-> ";
        } catch(NullPointerException e) {} 
        return output;
    }
}
