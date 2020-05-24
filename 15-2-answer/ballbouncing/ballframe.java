package ballbouncing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ballbouncing.BallWorld.DrawCanvas;

public class ballframe {

	private static final int UPDATE_RATE = 30;  // Frames per second (fps)
    
    private Ball ball;         // A single bouncing Ball's instance
    private Ball ball2;
    private ContainerBox box;  // The container rectangular box
    
    private DrawCanvas canvas; // Custom canvas for drawing the box/ball
    private int canvasWidth;
    private int canvasHeight;
    
    private JButton suspend;
    private JButton resume;
    private JPanel bottomPanel;
	
    
	public ballframe(){
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	        	JFrame frame = new JFrame("A World of Balls");
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            frame.setContentPane(new BallWorld(640, 480)); // BallWorld is a JPanel
	            frame.pack();            // Preferred size of BallWorld
	            frame.setVisible(true);  // Show it
	        }
		});
	}
	
	
    
	
	
}
