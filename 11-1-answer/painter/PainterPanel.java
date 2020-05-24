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

public class PainterPanel extends JPanel implements ActionListener{
	
	private DrawPanel drawPanel;
	private JPanel topPanel;
    private JPanel bottomPanel;
    
	private JPanel actionPanel;
	private JButton clear;
	private JButton undo;
	private JButton redo;
	
	private JPanel tttPanel;
	private JButton tictactoe;
	private JButton O_btn;
	private JButton X_btn;
	
	private JPanel shapePanel;
	private JButton randgen;
	private JButton rect;
	private JButton flag;
	private JButton oval;
	private JButton circle;
	private JButton circle3;
	
	final int RANDOM_SHAPES = 5;
	final int RECT = 1;
	final int FLAG = 2;
	final int OVAL = 3;
	final int CIRCLE = 4;
	final int CIRCLE3 = 5;
	final int TICTACTOE = 6;
	final int O_SYMBOL = 7;
	final int X_SYMBOL = 8;
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	private JButton colorbtn;
	private JButton colorbtn2;
	private JButton colorbtn3;
    private Icon colorIcon;
    private Color color=Color.BLUE;
    private Color color2=Color.RED;
    private Color color3=Color.GREEN;
	
	public PainterPanel(){
		super();
		this.setLayout(new BorderLayout());
		drawPanel = new DrawPanel();
		add(drawPanel, BorderLayout.CENTER);
		
		topPanel = new JPanel();
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
		
		topPanel.add(actionPanel);
		
		tttPanel = new JPanel();
		tictactoe = new JButton("TicTacToe");
		tictactoe.addActionListener(this);
		tttPanel.add(tictactoe);
		
		O_btn = new JButton(" O ");
		O_btn.addActionListener(this);
		tttPanel.add(O_btn);
		
		X_btn = new JButton(" X ");
		X_btn.addActionListener(this);
		tttPanel.add(X_btn);
		
		topPanel.add(tttPanel);
		
		add(topPanel, BorderLayout.SOUTH);
		///////////////////////////////////////////////////////////////////////////////////
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
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;		
		rect.addActionListener(this);
		shapePanel.add(rect,gbc);
		
		flag = new JButton("Flag");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		flag.addActionListener(this);
		shapePanel.add(flag,gbc);
		
		oval = new JButton("Oval");
		gbc.gridx = 1;
		gbc.gridy = 0;
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
		
		circle3 = new JButton("Circle3");
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		circle3.addActionListener(this);
		shapePanel.add(circle3,gbc);
		
		
		colorIcon = new ImageIcon(getClass().getResource("color.png"));
		colorbtn = new JButton("C1", colorIcon);
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
	    shapePanel.add(colorbtn,gbc);
		colorbtn.addActionListener(this);

		colorbtn2 = new JButton("C2", colorIcon);
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		shapePanel.add(colorbtn2,gbc);
		colorbtn2.addActionListener(this);
		
		colorbtn3 = new JButton("C3", colorIcon);
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		shapePanel.add(colorbtn3,gbc);
		colorbtn3.addActionListener(this);

        bottomPanel.add(shapePanel);
        
        add(bottomPanel, BorderLayout.WEST);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==randgen){
			drawPanel.randgen(10);
		}else if(e.getSource()==rect){
			drawPanel.setShape(RECT);
		}else if(e.getSource()==flag){
			drawPanel.setShape(FLAG);
	    }else if(e.getSource()==oval){
			drawPanel.setShape(OVAL);
	    }else if(e.getSource()==circle){
			drawPanel.setShape(CIRCLE);
	    }else if(e.getSource()==circle3){
            drawPanel.setShape(CIRCLE3);	    
	    }
	    else if(e.getSource()==tictactoe){
            drawPanel.setShape(TICTACTOE);
	    }else if(e.getSource()==O_btn){
	    	drawPanel.setShape(O_SYMBOL);
	    }else if(e.getSource()==X_btn){
	    	drawPanel.setShape(X_SYMBOL);
	    }
	    else if(e.getSource()==colorbtn){
			System.out.println("JColorChooser");
			color=JColorChooser.showDialog(this,"Choose a color",color);
			colorbtn.setBackground(color);
			drawPanel.setColor(color);
		}else if(e.getSource()==colorbtn2){
			System.out.println("JColorChooser");
			color2=JColorChooser.showDialog(this,"Choose a color",color2);
			colorbtn2.setBackground(color2);
			drawPanel.setColor2(color2);
		}else if(e.getSource()==colorbtn3){
			System.out.println("JColorChooser");
			color3=JColorChooser.showDialog(this,"Choose a color",color3);
			colorbtn3.setBackground(color3);
			drawPanel.setColor3(color3);
		}
		else if(e.getSource()==clear){
			System.out.println("clear");
			drawPanel.clear();
		}else if(e.getSource()==undo){
			System.out.println("undo");
			drawPanel.undo();
		}else if(e.getSource()==redo){
			System.out.println("redo");
			drawPanel.redo();
		}
		
	}

	

}
