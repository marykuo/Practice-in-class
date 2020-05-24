package p3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle3 extends Shape {

	private Color color3;
	
	public Circle3(int x1, int y1, int x2, int y2, Color color, Color color2, Color color3) {
		super(x1, y1, x2, y2, color, color2);
		this.color3=color3;
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(10.0f));
		int xd=Math.abs(x1-x2);
		int yd=Math.abs(x1-x2);
		
		g2d.setColor(color);
		g2d.fillOval(Math.min(x1,x2), Math.min(y1, y2), xd, yd);
		
		g2d.setColor(color2);
		g2d.fillOval(Math.min(x1,x2)+xd/6, Math.min(y1, y2)+yd/6, 4*xd/6, 4*yd/6);
		
		g2d.setColor(color3);
		g2d.fillOval(Math.min(x1,x2)+2*xd/6, Math.min(y1, y2)+2*yd/6, 2*xd/6, 2*yd/6);
		

		
		
		

	}

}
