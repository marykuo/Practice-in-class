package painter;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class DrawFrame extends JFrame{
	
	private DrawPanel drawPanel;
	public DrawFrame(){
		super();
		drawPanel = new DrawPanel();
		add(drawPanel, BorderLayout.CENTER);
	}

}
