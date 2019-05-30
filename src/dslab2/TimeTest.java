package dslab2;

/**
 *
 * @author conor
 */
public class TimeTest {
    public static final int N = 5;

    public static void main(String[] args) {
        
        // stopWatch for entire program
        StopWatch st = new StopWatch();
        st.start();
        
        // tells user what will be printed
        FormatMetadata();
        
        //System.out.printf();
        for(int i = 1; i <= N; i++) {
            
            // makes list lengths powers of 10
            int length = (int)Math.pow(10, i);
            
            // calls array and arrayList for left and right
            int doublyCircularLinkedListStartTime = DoublyCircularLinkedListL(length);
            int doublyCircularLinkedListEndTime = DoublyCircularLinkedListR(length);
            int linkedListStartTime = LinkedListL(length);
            int linkedListEndTime = LinkedListR(length);
            int arrayListStartTime = ArrayListL(length);
            int arrayListEndTime = ArrayListR(length);
            int arrayStartTime = ArrayL(length);
            int arrayEndTime = ArrayR(length);
            
            // output formatting for all timed values for N
            ValueNOutput(length, linkedListStartTime, linkedListEndTime, arrayListStartTime, arrayListEndTime, arrayStartTime, arrayEndTime, doublyCircularLinkedListStartTime, doublyCircularLinkedListEndTime);
        }
        
        // gives total runtime of program
        st.stop();
        System.out.println("Total runtime of program is " + (st.read() / 1000.0) + " seconds");
        
        // ends program
        System.exit(0);
    }
    
    // times how long it takes to add n objects to an doublyCircularLinkedList at the start
    public static int DoublyCircularLinkedListL(int length) {
        // initiates and starts a Stop Watch 
        StopWatch st = new StopWatch();
        st.start();
        DoublyCircularlyLinkedList linkedListL = new DoublyCircularlyLinkedList();
        
        // adds each object to the left
        for (int j = 0; j < length; j++) {
            linkedListL.InsertAtStart(j);
        }
        st.stop();
        return st.read(); 
    }
    
    // times how long it takes to add n objects to an doublyCircularLinkedList at the end
    public static int DoublyCircularLinkedListR(int length) {
        // initiates and starts a Stop Watch 
        StopWatch st = new StopWatch();
        st.start();
        DoublyCircularlyLinkedList DcLinkedListL = new DoublyCircularlyLinkedList();

        // adds each object to the left
        for (int j = 0; j < length; j++) {
            DcLinkedListL.InsertAtLoc(j, DcLinkedListL.getSize());
        }
        st.stop();
        return st.read();
    }
    
    // times how long it takes to add n objects to an linkedList at the start
    public static int LinkedListL(int length) {
        // initiates and starts a Stop Watch 
        StopWatch st = new StopWatch();
        st.start();
        LinkedListObject linkedListL = new LinkedListObject();
        
        // adds each object to the left
        for (int j = 0; j < length; j++) {
            linkedListL.addLeft(j);
        }
        //System.out.println("LinkedList Left Completed");
        //System.out.println("" + linkedListL.toString() + "\n");
        st.stop();
        return st.read();
    }
    
    // times how long it takes to add n objects to an linkedList at the end
    public static int LinkedListR(int length) {
    
        // initiates and starts a Stop Watch 
        StopWatch st = new StopWatch();
        st.start();
        LinkedListObject linkedListR = new LinkedListObject();
        
        // adds each object to the left
        for (int j = 0; j < length; j++) {
            linkedListR.addLeft(j);
        }
        //System.out.println("LinkedList Right Completed");
        //System.out.println("" + linkedListR.toString() + "\n");
        st.stop();
        return st.read();
    }  
    
    // times how long it takes to add n objects to an arrayList at the start
    public static int ArrayListL(int length) {
        
        // initiates and starts a Stop Watch 
        StopWatch st = new StopWatch();
        st.start();
        ArrayListObject arrayListL = new ArrayListObject();
        
        // adds each object to the left
        for (int j = 0; j < length; j++) {
            arrayListL.addLeft(j);
        }
        //System.out.println("ArrayList Left Completed");
        //System.out.println("" + arrayListL.toString() + "\n");
        st.stop();
        return st.read();
    }
    
    // times how long it takes to add n objects to an arrayList at the end
    public static int ArrayListR(int length) {
        
        // initiates and starts a Stop Watch 
        StopWatch st = new StopWatch();
        st.start();
        ArrayListObject arrayListR = new ArrayListObject();
        
        // adds each object to the right
        for (int j = 0; j < length; j++) {
            arrayListR.addRight(j);
        }
        //System.out.println("ArrayList Right Completed");
        //System.out.println("" + arrayListR.toString() + "\n");
        st.stop();
        return st.read();
    }
    
    // times how long it takes to add n objects to an array at the start
    public static int ArrayL(int length) {
        
        // initiates and starts a Stop Watch 
        StopWatch st = new StopWatch();
        st.start();
        ArrayObject arrayL = new ArrayObject(length);
        
        // adds each object to the left
        for (int j = 0; j < length; j++) {
            arrayL.addLeft(j);
        }
        //System.out.println("Array Left Completed");
        //System.out.println("" + arrayL.toString() + "\n");
        st.stop();
        return st.read();
    }
    
    // times how long it takes to add n objects to an array at the end
    public static int ArrayR(int length) {
        
        // initiates and starts a Stop Watch 
        StopWatch st = new StopWatch();
        st.start();
        
        // adds each object to the right
        ArrayObject arrayR = new ArrayObject(length);
        for (int j = 0; j < length; j++) {
            arrayR.addRight(j, j);
        }
        //System.out.println("Array Right Completed");
        //System.out.println("" + arrayR.toString() + "\n");
        st.stop();
        return st.read();
    }
    
    // tells user of data types and time magnitude
    public static void FormatMetadata() {
        System.out.printf("Timings for filling a structure with n items (integers from 1 to n)\n");
        System.out.printf("(all timings are in milliseconds):\n");
        System.out.printf("\n");
        System.out.printf("%20s \n", "Linear Structure Type");
        System.out.printf("%25s %25s %20s %30s\n", "Array", "ArrayList", "LinkedList", "DoublyCircularLinkedList");
        System.out.printf("%20s %10s %10s %10s %10s %10s %10s %10s\n", "Start", "End", "Start", "End", "Start", "End", "Start", "End");
        System.out.printf("\n");
        System.out.printf("Value of N\n");
    }
    
    // formats output of all linear structures for N
    public static void ValueNOutput(int n, int aL, int aR, int alL, int alR, int llL, int llR, int dcllL, int dcllR) {
        System.out.printf("%8d %10d %10d %10d %10d %10d %10d %10d %10d\n", n, aL, aR, alL, alR, llL, llR, dcllL, dcllR);
    }
}
