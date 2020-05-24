package painter;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	final int MAX = 100;
	private Shape shapes[];
	private int shapeCount;
	private int x1, y1, x2, y2;
	private Color color;
	private boolean filled;
	
	private int shapeType=1;
	
	final int SHAPES = 3;
	final int RECT = 1;
	final int OVAL = 2;
	final int VTRI = 3;
	
	Random rand;
	
	public DrawPanel(){
		super();
		shapes = new Shape[MAX];
		rand = new Random();
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
			color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
			filled = rand.nextBoolean();
			shapeType = rand.nextInt(SHAPES)+1;
			switch(shapeType){
			case RECT:
				shapes[shapeCount++] = new Rect(x1,y1,x2,y2,color,filled);
				break;
			case OVAL:
				shapes[shapeCount++] = new Oval(x1,y1,x2,y2,color,filled);
				break;
			case VTRI:
				shapes[shapeCount++] = new VTriangle(x1,y1,x2,y2,color,filled);
				break;
			}
		}		
	   repaint();
	}

	public void addShape(int shapeType) {
		//System.out.println(n+" "+shapeCount+" "+x1+" "+y1+" "+x2+" "+y2);
		x1 = rand.nextInt(600);
		y1 = rand.nextInt(600);
		x2 = rand.nextInt(600);
		y2 = rand.nextInt(600);
		//color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
		filled = rand.nextBoolean();
		//shapeType = rand.nextInt(SHAPES)+1;
		switch(shapeType){
		case RECT:
			shapes[shapeCount++] = new Rect(x1,y1,x2,y2,color,filled);
			break;
		case OVAL:
			shapes[shapeCount++] = new Oval(x1,y1,x2,y2,color,filled);
			break;
		case VTRI:
			shapes[shapeCount++] = new VTriangle(x1,y1,x2,y2,color,filled);
			break;
		}
		repaint();
	}

	public void setColor(Color color){
		this.color = color;
	}
	
	public void clear(){
		System.out.println("DrawPanel: clear()");
		shapeCount=0;
		repaint();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i=0;i<shapeCount;i++){
			shapes[i].draw(g);
	
		}
	}


}
