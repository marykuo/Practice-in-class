package painter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class VertTri extends Shape{

	public VertTri(int x1, int y1, int x2, int y2, Color color, boolean filled) {
		super(x1, y1, x2, y2, color, filled);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(color);
		int[] xValues={x1, x2, x1};
		int[] yValues={y1, y1, y2};
		if(filled){
			g2d.fillPolygon(xValues,yValues,3);
		}else{
			g2d.drawPolygon(xValues,yValues,3);
		}
	}
	
	

}
