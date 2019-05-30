package dslab2;

/**
 *
 * @author conor
 */
public class DoublyCircularlyLinkedList {
    public Node head;
    private int size;
    
    public DoublyCircularlyLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    // inserts Node in first position
    public void InsertAtStart(double data) {
        Node dl = new Node(data, null, null);
        if(isEmpty()) {
            dl.setNext(dl);
            dl.setPrev(dl);
            head = dl;
        } else {
            dl.setNext(head);
            dl.setPrev(head.getPrev());
            head.getPrev().setNext(dl);
            head.setPrev(dl);
            head = dl;
        }
        size++;
    }
    
    // inserts Node in given position
    
    public void InsertAtLoc(double data, int loc) {
        Node dl = new Node(data, null, null);
        if(loc == 1) {
            InsertAtStart(data);
            return;
        } if(loc > size || loc < 0) {
            System.out.println("Location doesn't exist");
            return;
        } else {
            Node tempHead = head;
            for(int i = 2; i <= size; i++) {
                if(i == loc) {
                    dl.setNext(tempHead.getNext());
                    dl.setPrev(tempHead);
                    tempHead.getNext().setPrev(dl);
                    tempHead.setNext(dl);
                }
                // moves tempStart
                tempHead = tempHead.getNext();
            }
        }
        size++;
    }
    
    // deletes following item in list
    public void DeleteAtLoc(int loc) {
        if(loc == 0) {
            head = head.getNext();
            head.getPrev().setNext(head);
            size--;
            return;
        }
        Node tempHead = head;
        for(int i = 1; i <= loc; i++) {
            
            // deletes item at location i
            if(i == loc) {
                tempHead.setNext(tempHead.getNext().getNext());
                tempHead.getNext().setPrev(tempHead);
            }
            tempHead = tempHead.getNext();
        }
        size--;
    }
    
    // checks if head Node exists
    public boolean isEmpty() {
        return head == null;
    }
    
    // return size of dcll
    public int getSize() {
        return size;
    }
    
    // see first node and size of dcll
    @Override
    public String toString() {
        String output = "Starting Link: (" + head.toString() + "), Size: " + size;
        return output + "\n";
    }
    
    // see enitre dcll w/o pointers
    public String toStringMedium() {
        String output = "";
        Node tempHead = head;
        for(int i = 0; i < size; i++) {
            output = output + Double.toString(tempHead.getData()) + " <-> ";
            tempHead = tempHead.getNext();
        }
        return output + "\n";
    }
    
    // see entire dcll w/ pointers
    public String toStringBig() {
        String output = "";
        Node tempHead = head;
        for(int i = 0; i < size; i++) {
            output = output + tempHead.toString();
            tempHead = tempHead.getNext();
        }
        return output + "\n";
    }
}
