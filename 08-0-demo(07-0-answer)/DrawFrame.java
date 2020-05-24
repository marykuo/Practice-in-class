package painter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
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
	
	final int SHAPES = 3;
	final int RECT = 1;
	final int OVAL = 2;
	final int VTRI = 3;
	
	
	private JButton colorbtn;
    private Icon colorIcon;
    private Color color;
	
	public DrawFrame(){
		super();
		drawPanel = new DrawPanel();
		add(drawPanel, BorderLayout.CENTER);
		bottomPanel = new JPanel();
		
		actionPanel = new JPanel();
		clear = new JButton("Clear");
		clear.addActionListener(this);
		actionPanel.add(clear);
		
		undo = new JButton("Undo");
		undo.addActionListener(this);
		actionPanel.add(undo);
		
		redo = new JButton("Redo");
		redo.addActionListener(this);
		actionPanel.add(redo);
		
		bottomPanel.add(actionPanel);
		
		shapePanel = new JPanel();
		
		
		randgen = new JButton("Randgen");
		randgen.addActionListener(this);
		shapePanel.add(randgen);
		
		rect = new JButton("Rect");
		rect.addActionListener(this);
		shapePanel.add(rect);
		
		oval = new JButton("Oval");
		oval.addActionListener(this);
		shapePanel.add(oval);
		
		colorIcon = new ImageIcon(getClass().getResource("color.png"));
		colorbtn = new JButton("C1", colorIcon);
		colorbtn.addActionListener(this);
		
		bottomPanel.add(shapePanel);
		bottomPanel.add(colorbtn);
		
		add(bottomPanel, BorderLayout.SOUTH);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==randgen){
			drawPanel.randgen(10);
		}else if(e.getSource()==rect){
			drawPanel.addShape(RECT);
		}else if(e.getSource()==colorbtn){
			System.out.println("JColorChooser");
			color=JColorChooser.showDialog(this,"Choose a color",color);
			colorbtn.setBackground(color);
			drawPanel.setColor(color);
		}else if(e.getSource()==clear){
			System.out.println("clear");
			drawPanel.clear();
		}
		
	}


}
