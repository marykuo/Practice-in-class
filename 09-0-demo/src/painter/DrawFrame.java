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
	
	private JButton colorbtn;
	private JButton colorbtn2;
    private Icon colorIcon;
    private Color color;
    private Color color2;
	
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
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		randgen.addActionListener(this);
		shapePanel.add(randgen,gbc);
		
		rect = new JButton("Rect");
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;		
		rect.addActionListener(this);
		shapePanel.add(rect,gbc);
		
		square = new JButton("Square");
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		square.addActionListener(this);
		shapePanel.add(square,gbc);
		
		oval = new JButton("Oval");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;

		oval.addActionListener(this);
		shapePanel.add(oval,gbc);
		
		circle = new JButton("Circle");
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;		
		circle.addActionListener(this);
		shapePanel.add(circle,gbc);
		
		vtri = new JButton("VTri");
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;

		vtri.addActionListener(this);
		shapePanel.add(vtri,gbc);
		
		
		colorIcon = new ImageIcon(getClass().getResource("color.png"));
		colorbtn = new JButton("C1", colorIcon);
		gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.gridheight = 2;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
	    shapePanel.add(colorbtn,gbc);
		colorbtn.addActionListener(this);

		colorbtn2 = new JButton("C2", colorIcon);
		gbc.gridx = 4;
		gbc.gridy = 0;
		gbc.gridheight = 2;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		shapePanel.add(colorbtn2,gbc);
		colorbtn2.addActionListener(this);
		
        bottomPanel.add(shapePanel);

        add(bottomPanel, BorderLayout.SOUTH);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==randgen){
			drawPanel.randgen(10);
		}else if(e.getSource()==rect){
			drawPanel.setShape(RECT);
		}else if(e.getSource()==oval){
			drawPanel.setShape(OVAL);
	    }else if(e.getSource()==vtri){
            drawPanel.setShape(VTRI);	    
	    }
	    else if(e.getSource()==colorbtn){
			System.out.println("JColorChooser");
			color=JColorChooser.showDialog(this,"Choose a color",color);
			colorbtn.setBackground(color);
			drawPanel.setColor(color);
		}
	    else if(e.getSource()==clear){
			System.out.println("clear");
			drawPanel.clear();
		}
		
	}


}
