package painter;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawFrame extends JFrame implements ActionListener{
	
	private DrawPanel drawPanel;
	private JPanel bottomPanel;
	
	private JPanel actionPanel;
	private JButton clear;
	private JButton undo;
	private JButton redo;
	
	private JPanel shapePanel;
	private JButton randgen;
	private JButton rect;
	private JButton oval;
	
	public DrawFrame (){
		super();
		drawPanel = new DrawPanel();
		add(drawPanel, BorderLayout.CENTER);
		bottomPanel=new JPanel();
		
		actionPanel=new JPanel();
		clear=new JButton("Clear");
		clear.addActionListener(this);
		actionPanel.add(clear);
		
		undo=new JButton("Undo");
		undo.addActionListener(this);
		actionPanel.add(undo);
		
		redo=new JButton("Redo");
		redo.addActionListener(this);
		actionPanel.add(redo);
		
		bottomPanel.add(actionPanel);
		
		shapePanel=new JPanel();
		
		randgen=new JButton("Randgen");
		randgen.addActionListener(this);
		shapePanel.add(randgen);
		
		rect=new JButton("Rect");
		rect.addActionListener(this);
		shapePanel.add(rect);
		
		oval=new JButton("Oval");
		oval.addActionListener(this);
		shapePanel.add(oval);

		bottomPanel.add(shapePanel);
		
		add(bottomPanel, BorderLayout.SOUTH);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==randgen){
			drawPanel.randgen(10);
		}
		/*if(e.getSource()==oval){
			drawPanel.oval(10);
		}*/
		
		
	}
}