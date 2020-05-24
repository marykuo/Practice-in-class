package p3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class VTriangle extends Shape{
	
	protected int type=1;
	
	protected final int UP_LEFT = 1;
	protected final int UP_RIGHT = 2;
	protected final int DOWN_LEFT = 3;
	protected final int DOWN_RIGHT = 4;


	public VTriangle(){
		super();
	}
	
	public VTriangle(int x1, int y1, int x2, int y2, Color color, int type){
		super(x1,y1,x2,y2,color);
		this.type = type;
	}

	public VTriangle(int x1, int y1, int x2, int y2, Color color, boolean filled, int type){
		super(x1,y1,x2,y2,color,filled);
		this.type = type;
	}

	
	public VTriangle(int x1, int y1, int x2, int y2, Color color, boolean filled) {
		super(x1,y1,x2,y2,color,filled);
	}

	public VTriangle(int x1, int y1, int x2, int y2, Color color, Color color2, boolean filled) {
		super(x1,y1,x2,y2,color,color2,filled);
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		Polygon poly = null;
		//g.setColor(color);
		//g2d.setPaint(color);
		GradientPaint gpaint = new GradientPaint(55, 80, color, 100,150, color2,true);
		g2d.setPaint(gpaint);
		g2d.setStroke(new BasicStroke(10.0f));
		
		switch(type){
		case UP_LEFT:
			poly = new Polygon(
	                new int[]{x1, x1, x2},
	                new int[]{y1, y2, y2},
	                3);
			break;
		case UP_RIGHT:
			poly = new Polygon(
	                new int[]{x1, x1, x2},
	                new int[]{y1, y2, y2},
	                3);
			break;
			
		case DOWN_LEFT:
			poly = new Polygon(
	                new int[]{x1, x2, x2},
	                new int[]{y1, y1, y2},
	                3);
			break;
			
		case DOWN_RIGHT:
			poly = new Polygon(
	                new int[]{x1, x2, x2},
	                new int[]{y1, y1, y2},
	                3);
			break;
		}	
		if(filled){
			g2d.fill(poly);
		}else{
			g2d.draw(poly);			
		}
		
	}

	@Override
	public String toString() {
		return "VTriangle [type=" + type + ", UP_LEFT=" + UP_LEFT + ", UP_RIGHT=" + UP_RIGHT + ", DOWN_LEFT="
				+ DOWN_LEFT + ", DOWN_RIGHT=" + DOWN_RIGHT + "]";
	}

	
}
