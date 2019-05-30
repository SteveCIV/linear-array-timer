package dslab2;

import java.util.Timer;
/**
 *
 * @author conor
 */
public class StopWatch {
    private int milisecStart;
    private int milisecStop;
    
    // default constructor
    public StopWatch() {
        this.milisecStart = 0;
        this.milisecStop = 0;
    }
    
    // constructor
    public StopWatch(int milisecStart, int milisecStop, Timer t) {
        this.milisecStart = milisecStart;
        this.milisecStop = milisecStop;
    }
    
    // gets current time
    public void start() {
        milisecStart = (int)System.currentTimeMillis();
    }
    
    // gets current time
    public void stop() {
        milisecStop = (int)System.currentTimeMillis();
    }
    
    // gets difference between milisecStart and milisecStop
    public int read() {
        int currentTime = milisecStop - milisecStart;
        return currentTime;
    }
    
    // sets milisecStart and milisecStop to 0
    public void reset() {
        this.milisecStart = 0;
        this.milisecStop = 0;
    }
}
