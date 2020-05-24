package painter;

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

/*(c)	(15%) �[�J�@�� class Flag (�X��)�A��Flag �q Rect �~�ӤU��, �I��Flag���s���ηƹ��e�X�A
 * �p�U�ϡA�e�����12:9 (12/9=1.33)�A�䤤�Ŧ�O�qC1�ӡA����O�qC2��(�u���A�����b�a��1/3�B�A�����襤�A�ʲӤj�P�ѦҹϤ����)�A
 * ���W�M���U����O����ΡA�զⳡ���O���|�H��color1, color2�ӧ��ܡA���ݺ��h�C�I�� Flag�e�X�@�ӹϧήɡA�n��System.out.println() 
 * �L�X���I�y�Фμe����A�榡�p�U�A���]�Ĥ@�I�y��(100,100), �ĤG�I�y�Ь�(220,190)
 */
/*
Flag: (x1,y1)=(100,100), (x2,y2)=(220,190), width/height=1.33
*/