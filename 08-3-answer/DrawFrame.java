package painter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
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
	private JButton square;
	private JButton oval;
	private JButton circle;
	private JButton vtri;
	
	final int SHAPES = 3;
	final int RECT = 1;
	final int OVAL = 2;
	final int VTRI = 3;
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	private JButton colorbtn1;
	private JButton colorbtn2;
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
		
		add(actionPanel, BorderLayout.NORTH);
		
		shapePanel = new JPanel(new GridBagLayout());
		
		randgen = new JButton("Randgen");
		setgbc(0,0,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		randgen.addActionListener(this);
		shapePanel.add(randgen, gbc);
		
		rect = new JButton("Rect");
		setgbc(1,0,1,1);
		rect.addActionListener(this);
		shapePanel.add(rect, gbc);
		
		square = new JButton("Square");
		setgbc(2,0,1,1);
		square.addActionListener(this);
		shapePanel.add(square, gbc);
		
		oval = new JButton("Oval");
		setgbc(0,1,1,1);
		oval.addActionListener(this);
		shapePanel.add(oval, gbc);
		
		circle = new JButton("Circle");
		setgbc(1,1,1,1);
		circle.addActionListener(this);
		shapePanel.add(circle, gbc);
		
		vtri = new JButton("VTri");
		setgbc(2,1,1,1);
		vtri.addActionListener(this);
		shapePanel.add(vtri, gbc);
		
		colorIcon = new ImageIcon(getClass().getResource("color.png"));
		colorbtn1 = new JButton("C1", colorIcon);
		setgbc(3,0,2,1);
		shapePanel.add(colorbtn1, gbc);
		colorbtn1.addActionListener(this);
		
		colorbtn2 = new JButton("C2", colorIcon);
		setgbc(4,0,2,1);
		shapePanel.add(colorbtn2, gbc);
		colorbtn2.addActionListener(this);
		
		
		bottomPanel.add(shapePanel);
		
		add(bottomPanel, BorderLayout.SOUTH);
		
	}

	private void setgbc(int x, int y, int height, int width) {
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridheight=height;
		gbc.gridwidth=width;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==randgen){
			drawPanel.randgen(10);
		}else if(e.getSource()==rect){
			drawPanel.setShapeType(RECT);
		}else if(e.getSource()==oval){
			drawPanel.setShapeType(OVAL);
		}else if(e.getSource()==vtri){
			drawPanel.setShapeType(VTRI);
		}
		else if(e.getSource()==colorbtn1){
			System.out.println("JColorChooser");
			color=JColorChooser.showDialog(this,"Choose a color",color);
			colorbtn1.setBackground(color);
			drawPanel.setColor(color);
		}else if(e.getSource()==colorbtn2){
			System.out.println("JColorChooser");
			color=JColorChooser.showDialog(this,"Choose a color",color);
			colorbtn2.setBackground(color);
			drawPanel.setColor(color);
		}else if(e.getSource()==clear){
			System.out.println("clear");
			drawPanel.clear();
		}
	}


}
