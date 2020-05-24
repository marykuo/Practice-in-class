package p3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Board extends Square{

	private int rank;
	private int cellwidth;
	private int cellheight;
	
	public Board(int x1, int y1, int x2, int y2, Color color, boolean filled, int rank) {
		super(x1, y1, x2, y2, color, filled);
		// TODO Auto-generated constructor stub
	}

	public Board(int x1, int y1, int x2, int y2, Color color, Color color2, boolean filled, int rank) {
		super(x1, y1, x2, y2, color, color2, filled);
		this.rank = rank;
		compute();
	}
	
	void compute(){
		cellwidth =  Math.abs(x1-x2)/3;
		cellheight = Math.abs(y1-y2)/3;
	}
	
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		//g2d.setPaint(new Color(176,176,85));		
		//g2d.fillRect(Math.min(x1,x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2));
		//g2d.drawRect(Math.min(x1,x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2));
		compute();
        int x0 = Math.min(x1,x2);
        int y0 = Math.min(y1, y2);
        g2d.setStroke(new BasicStroke(5.0f));
        g2d.setPaint(new Color(100,65,40));	
		for(int i=1;i<rank;i++){
		   	g2d.drawLine(x0+cellwidth*i, y0, x0+cellwidth*i, Math.max(y1, y2));
		   	g2d.drawLine(x0, y0+cellheight*i, Math.max(x1, x2), y0+cellheight*i);
		}
				
	}
}
