package p3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JPanel;

public class DrawPanel extends JPanel implements MouseListener, MouseMotionListener{
	
	final int MAX = 100;
	private Shape shapes[];
	private int shapeCount;
	private int x1, y1, x2, y2;
    private Color color=Color.BLUE;
    private Color color2=Color.RED;
    private Color color3=Color.GREEN;
	private boolean filled;
	
	private int shapeType=1;
	
	final int RANDOM_SHAPES = 5;
	final int RECT = 1;
	final int FLAG = 2;
	final int OVAL = 3;
	final int CIRCLE = 4;
	final int CIRCLE3 = 5;
	final int TICTACTOE = 6;
	final int O_SYMBOL = 7;
	final int X_SYMBOL = 8;
	
	private Shape currentShape;
	
	Random rand;
	
	public DrawPanel(){
		super();
		shapes = new Shape[MAX];
		rand = new Random();
		addMouseListener(this);
		addMouseMotionListener(this);
		//randgen(10);
		//randgen(10);
	}

	public void randgen(int n) {
		
		for(int i=0;i<n;i++){
			//System.out.println(n+" "+shapeCount+" "+x1+" "+y1+" "+x2+" "+y2);
			x1 = rand.nextInt(600);
			y1 = rand.nextInt(600);
			x2 = rand.nextInt(600);
			y2 = rand.nextInt(600);
			//color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
			//color2 = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
			filled = rand.nextBoolean();
			shapeType = rand.nextInt(RANDOM_SHAPES)+1;
			switch(shapeType){
			case RECT:
				shapes[shapeCount++] = new Rect(x1,y1,x2,y2,color,color2, filled);
				break;
			case OVAL:
				shapes[shapeCount++] = new Oval(x1,y1,x2,y2,color,color2, filled);
				break;
			case FLAG:
				shapes[shapeCount++] = new Flag(x1,y1,x2,y2,color,color2);
				break;
			}
		}		
	   repaint();
	}

	public void setShape(int shapeType) {
		this.shapeType = shapeType;
	}

	public void setColor(Color color){
		this.color = color;
		System.out.println("setColor: "+color);
	}
	
	public void setColor2(Color color2){
		this.color2 = color2;
		System.out.println("setColor2: "+color2);
	}
	
	public void setColor3(Color color3) {
		this.color3 = color3;
		System.out.println("setColor3: "+color3);
	}
	
	public void clear(){
		System.out.println("DrawPanel: clear()");
		shapeCount=0;
		repaint();
	}
	
	public void undo() {
		shapeCount--;
		repaint();
	}

	public void redo() {
		if(shapes[shapeCount-1] != null){
			shapeCount++;
			repaint();
		}
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i=0;i<shapeCount;i++){
			shapes[i].draw(g);
			shapes[i].toString();
		}
		if(currentShape != null){
			currentShape.draw(g);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
		x2 = x1;
		y2 = y1;
		System.out.println("mousePressed:  "+x1+" "+y1+" "+shapeType);
	    switch(shapeType){
	    case RECT:
	    	currentShape = new Rect(x1,y1,x2,y2,color,color2,filled);
	    	break;
	    case FLAG:
	    	currentShape = new Flag(x1,y1,x2,y2,color,color2);
	    	break;
	    case OVAL:
	    	currentShape = new Oval(x1,y1,x2,y2,color,color2, filled);
	    	break;
	    case CIRCLE:
	    	currentShape = new Circle(x1,y1,x2,y2,color,color2, filled);
	    	break;
	    case CIRCLE3:
	    	currentShape = new Circle3(x1,y1,x2,y2,color, color2, color3);
	    	break;
	    case TICTACTOE:
	    	currentShape = new Board(x1,y1,x2,y2,color, color2, filled,3);
	    	break;	
	    }
	}

	void adjustCurrentY2(){
		int w = Math.abs(currentShape.x1-currentShape.x2);
		int h = Math.abs(currentShape.y1-currentShape.y2);
		int d = w-h;
		if(currentShape.y1 < currentShape.y2)
			currentShape.y2 += d;
		else
			currentShape.y2 -= d;
	}
	
	private void adjustflag() {
		int w = Math.abs(currentShape.x1-currentShape.x2);
		int h = Math.abs(currentShape.y1-currentShape.y2);
		if(currentShape.y1 < currentShape.y2)
			currentShape.y2 = currentShape.y1 + w/12*9;
		else
			currentShape.y2 = currentShape.y1 - w/12*9;
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
		if(shapeType == CIRCLE || shapeType ==TICTACTOE){
			adjustCurrentY2();
			y2 = currentShape.y2;
		}
		if(shapeType == FLAG) {
			adjustflag();
			y2 = currentShape.y2;
		}
		System.out.println("mouseReleased: "+x2+" "+y2);
		switch(shapeType){
		case RECT:
			shapes[shapeCount++] = new Rect(x1,y1,x2,y2,color,color2,filled);
			break;
		case FLAG:
			shapes[shapeCount++] = new Flag(x1,y1,x2,y2,color,color2);
			System.out.println(shapes[shapeCount-1]);
			break;			
		case OVAL:
			shapes[shapeCount++] = new Oval(x1,y1,x2,y2,color,color2, filled);
			break;
		case CIRCLE:
			shapes[shapeCount++] = new Circle(x1,y1,x2,y2,color,color2, filled);
			break;
		case CIRCLE3:
			shapes[shapeCount++] = new Circle3(x1,y1,x2,y2,color, color2, color3);
			break;
		case TICTACTOE:
			shapes[shapeCount++] = new Board(x1,y1,x2,y2,color, color2, filled,3);
			break;	
		}
		currentShape = null;
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		currentShape.x2 = e.getX();
		currentShape.y2 = e.getY();
		if(shapeType == CIRCLE)
		   adjustCurrentY2();
		if(shapeType == FLAG) {
			adjustflag();
			y2 = currentShape.y2;
		}
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	



}
