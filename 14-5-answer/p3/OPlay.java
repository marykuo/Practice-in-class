package p3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class OPlay extends Circle{
	public OPlay(int x1, int y1, int x2, int y2, Color color) {
		super(x1,y1,x2,y2,color);
		
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(color);
		g2d.fillOval(Math.min(x1,x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2));		
	}
}
