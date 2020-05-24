package painter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rect extends Shape{

	public Rect(int x1, int y1, int x2, int y2, Color color, boolean filled) {
		super(x1, y1, x2, y2, color, filled);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(color);
		if(filled){
			g2d.fillRect(Math.min(x1,x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2));
		}else{
			g2d.drawRect(Math.min(x1,x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2));
		}
		
	}

	@Override
	public String toString() {
		return "Rect [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", filled=" + filled + ", color=" + color
				+ "]";
	}

	
	
}
