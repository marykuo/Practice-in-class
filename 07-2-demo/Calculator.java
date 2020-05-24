import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator extends JPanel {
	
	//public static final long serialVersionUID = 1L;
    public static final int WIDTH=320;
    public static final int HEIGHT=480;
	
    private GridBagLayout layout;
    private GridBagConstraints gbc;
    
    private JButton[] numButtons;
    private JButton[] opButtons;
    
    private int [][] numConstraints = new int[][]{
    		{0,5,2,1},
    		{0,4,1,1},
    		{1,4,1,1},
    		{2,4,1,1},
    		{0,3,1,1},
    		{1,3,1,1},
    		{2,3,1,1},
    		{0,2,1,1},
    		{1,2,1,1},
    		{2,2,1,1},
    };
    
//    private int [][] opConstraints = new int[][]{
//    		{2,5,1,1},
//    		{3,4,1,2},
//    		{3,3,1,1},
//    		{3,2,1,1},
//    		{3,1,1,1},
//    		{2,1,1,1},
//    		{1,1,1,1},
//    		{0,1,1,1},
//    };
   
    private JTextField field;
    
	private double num1, num2, answer;
	private int op;
	
    public Calculator(){
	   	setPreferredSize(new Dimension(WIDTH,HEIGHT));
	   	layout = new GridBagLayout();
	   	layout.columnWidths = new int[] {80,80,80,80};
	   	layout.rowHeights = new int[]{80,80,80,80,80,80};
	   	setLayout(layout);
	   	
	   	numButtons = new JButton[10];
	   	gbc = new GridBagConstraints();
	   	
	   	for(int i=0;i<numButtons.length;i++){
	   		numButtons[i] = new JButton(""+i);
	   		//numButtons[i].addActionListener(this);
	   		gbc.gridx = numConstraints[i][0];
	   		gbc.gridy = numConstraints[i][1];
	   		gbc.gridwidth = numConstraints[i][2];
	   		gbc.gridheight = numConstraints[i][3];
	   		gbc.fill = GridBagConstraints.BOTH;
	   		gbc.insets = new Insets(2,2,2,2);
	   		add(numButtons[i],gbc);	
	   	}
	   	
	   	opButtons = new JButton[8];
	   	opButtons[0] = new JButton(".");
	   	opButtons[1] = new JButton("=");
	   	opButtons[2] = new JButton("+");
	   	opButtons[3] = new JButton("-");
	   	opButtons[4] = new JButton("*");
	   	opButtons[5] = new JButton("/");
	   	opButtons[6] = new JButton("+/-");
	   	opButtons[7] = new JButton("C");
	   	
//	   	for(int i=0;i<opButtons.length;i++){
//	   		gbc.gridx = opConstraints[i][0];
//	   		gbc.gridy = opConstraints[i][1];
//	   		gbc.gridwidth = opConstraints[i][2];
//	   		gbc.gridheight = opConstraints[i][3];
//	   		gbc.fill = GridBagConstraints.BOTH;
//	   		gbc.insets = new Insets(2,2,2,2);
//	   		add(opButtons[i],gbc);
//	   		//opButtons[i].addActionListener(this);
//	   		
//	   	}
	   	
	   	field = new JTextField();
	   	field.setEditable(false);
	   	field.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	   	field.setFont(new Font("Arial", Font.PLAIN, 24));
	   	field.setHorizontalAlignment(JTextField.RIGHT);
   		gbc.gridx = 0;
   		gbc.gridy = 0;
   		gbc.gridwidth = 4;
   		gbc.gridheight = 1;
   		gbc.fill = GridBagConstraints.BOTH;
   		gbc.insets = new Insets(2,2,2,2);
   		add(field,gbc);	
	   	
	}

	public static void main(String[] args) {
       JFrame app = new JFrame("Calculator");
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       app.setResizable(false);
       app.setLayout(new BorderLayout());
       app.add(new Calculator(), BorderLayout.CENTER);
       app.pack();
       app.setLocationRelativeTo(null);
       app.setVisible(true);
       
	}

}
