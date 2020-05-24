package p3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Oval{
	
	

	public Circle(int x1, int y1, int x2, int y2, Color color, boolean filled) {
		super(x1, y1, x2, y2, color, filled);
	}

	public Circle(int x1, int y1, int x2, int y2, Color color, Color color2, boolean filled) {
		super(x1, y1, x2, y2, color, color2, filled);
	}
	

	
	public Circle(int x1, int y1, int x2, int y2, Color color) {
		super(x1,y1,x2,y2,color);
		
	}


	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		GradientPaint gpaint = new GradientPaint(55, 80, color, 100,150, color2,true);
		g2d.setPaint(gpaint);
		g2d.setStroke(new BasicStroke(10.0f));
		if(filled){
			g2d.fillOval(Math.min(x1,x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2));
		}else{
			g2d.drawOval(Math.min(x1,x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2));
		}
		
	}

}
