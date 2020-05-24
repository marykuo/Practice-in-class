package p3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Flag extends Rect{

	public Flag() {
		super();
	}
	
	public Flag(int x1, int y1, int x2, int y2, Color color, Color color2) {
		super(x1, y1, x2, y2, color, color2);
	}


	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(Color.WHITE);
		//g2d.setPaint(Color.WHITE);
		g2d.fillRect(Math.min(x1,x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2));
		
		g2d.setColor(color);
		g2d.fillRect(Math.min(x1,x2), Math.min(y1, y2), 7*Math.abs(x1-x2)/25, 7*Math.abs(y1-y2)/18);//left up
		g2d.fillRect(Math.min(x1,x2)+11*Math.abs(x1-x2)/25, Math.min(y1, y2), Math.max(x1,x2)-(Math.min(x1,x2)+11*Math.abs(x1-x2)/25),7*Math.abs(y1-y2)/18);//right up
		g2d.fillRect(Math.min(x1,x2), Math.min(y1, y2)+Math.abs(y1-y2)/18*11, 7*Math.abs(x1-x2)/25, Math.max(y1, y2)-(Math.min(y1, y2)+11*Math.abs(y1-y2)/18));//left down
		g2d.fillRect(Math.min(x1,x2)+11*Math.abs(x1-x2)/25, Math.min(y1, y2)+Math.abs(y1-y2)/18*11, Math.max(x1,x2)-(Math.min(x1,x2)+11*Math.abs(x1-x2)/25), Math.max(y1, y2)-(Math.min(y1, y2)+11*Math.abs(y1-y2)/18));//right down
		
		g2d.setColor(color2);
		g2d.setPaint(color2);
		g2d.fillRect(Math.min(x1,x2)+8*Math.abs(x1-x2)/25, Math.min(y1, y2), 2*Math.abs(x1-x2)/25, Math.abs(y1-y2));
		g2d.fillRect(Math.min(x1,x2), Math.min(y1, y2)+Math.abs(y1-y2)/18*8, Math.abs(x1-x2), Math.abs(y1-y2)/18*2);
		
	}

	@Override
	public String toString() {
		return "Flag: (x1,y1)=("+x1+","+y1+"), (x2,y2)=("+x2+","+y2+"), width/height=1.33";
	}

}

/*(c)	(15%) 加入一個 class Flag (旗標)，此Flag 從 Rect 繼承下來, 點選Flag按鈕後能用滑鼠畫出，
 * 如下圖，寬高比例12:9 (12/9=1.33)，其中藍色是從C1來，紅色是從C2來(線條，垂直在靠左1/3處，水平對中，粗細大致參考圖之比例)，
 * 左上和左下方塊是正方形，白色部分是不會隨著color1, color2而改變，不需漸層。點選 Flag畫出一個圖形時，要用System.out.println() 
 * 印出兩點座標及寬高比，格式如下，假設第一點座標(100,100), 第二點座標為(220,190)
 */
/*
Flag: (x1,y1)=(100,100), (x2,y2)=(220,190), width/height=1.33
*/