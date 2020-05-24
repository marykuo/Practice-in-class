package p3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class XPlay extends Shape{

	public XPlay(int x1, int y1, int x2, int y2, Color color) {
		super(x1,y1,x2,y2,color);
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		int width = Math.abs(x1-x2);
		int height = Math.abs(y1-y2);
		g2d.setPaint(color);
		g2d.setStroke(new BasicStroke(8.0f));
		int xmin = Math.min(x1, x2);
		int ymin = Math.min(y1, y2);
		int xmax = Math.max(x1, x2);
		int ymax = Math.max(y1, y2);
		g2d.drawLine(xmin+(int)(width*0.13), ymin+(int)(width*0.13), xmax-(int)(width*0.13), ymax-(int)(width*0.13));		
		g2d.drawLine(xmin+(int)(width*0.13), ymax-(int)(height*0.13), xmax-(int)(width*0.13), ymin+(int)(height*0.13));		
	}

}
