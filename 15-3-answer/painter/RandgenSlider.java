package painter;

import java.awt.BorderLayout;

import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class RandgenSlider {

	private JSlider diameterJSlider; // slider to select diameter
	
	public RandgenSlider(){
		// set up JSlider to control diameter value
	    diameterJSlider = 
	       new JSlider( SwingConstants.HORIZONTAL, 0, 200, 10 );
	    diameterJSlider.setMajorTickSpacing( 10 ); // create tick every 10
	    diameterJSlider.setPaintTicks( true ); // paint ticks on slider

	    // register JSlider event listener
	    diameterJSlider.addChangeListener(

	       new ChangeListener() // anonymous inner class
	       {  
	          // handle change in slider value
	          public void stateChanged( ChangeEvent e )
	          {
	             myPanel.setDiameter( diameterJSlider.getValue() );
	          } // end method stateChanged
	       } // end anonymous inner class
	    ); // end call to addChangeListener

	    add( diameterJSlider, BorderLayout.SOUTH ); // add slider to frame
	    
	}
	
    
}
