package ballbouncing;

import javax.swing.JFrame;
/**
 * Main Program for running the bouncing ball as a standalone application.
 */
public class Main {
    // Entry main program
    public static void main(String[] args) {
        // Run UI in the Event Dispatcher Thread (EDT), instead of Main thread
	     ballframe frame = new ballframe();
    }
}