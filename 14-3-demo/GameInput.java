/*
 * From: https://yunlinsong.blogspot.tw/2016/09/java_21.html
 */
package game2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class GameInput extends JFrame implements KeyListener {
	final int SCREEN_WIDTH = 400;
	final int SCREEN_HEIGHT = 400;
	final int RECT_WIDTH = 30;
	final int RECT_HEIGHT = 30;
	final int SPRITES_NUM = 2;

	int xSpeed = 30;
	int ySpeed = 30;

	int xPos = SCREEN_WIDTH / 2;
	int yPos = SCREEN_HEIGHT / 2;
	
	int[] spritePosX = new int[SPRITES_NUM];
	int[] spritePosY = new int[SPRITES_NUM];

	public GameInput() {
        setTitle("¹CÀ¸°òÂ¦-Áä½L±±¨î");
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addKeyListener(this);
        
        for(int i = 0; i < SPRITES_NUM; i++) {
        	spritePosX[i] = xPos;
        	spritePosY[i] = yPos;
        }
        repaint();
	}
   
    public void update(Graphics g) { 
        this.paint(g); 
    } 
 
    public void paint(Graphics g) { 
        super.paint(g);
        g.setColor(Color.GREEN);
        g.fillRect(spritePosX[0], spritePosY[0], RECT_WIDTH, RECT_HEIGHT);
        g.setColor(Color.RED);
        g.fillOval(spritePosX[1], spritePosY[1], RECT_WIDTH, RECT_HEIGHT);
    }


	public static void main(String[] args) {
		new GameInput().setVisible(true);;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		// Move the Square
		if( key == KeyEvent.VK_UP )
			spritePosY[0] -= ySpeed;
		
		if( key == KeyEvent.VK_DOWN )
			spritePosY[0] += ySpeed;
		
		if( key == KeyEvent.VK_LEFT )
			spritePosX[0] -= xSpeed;
		
		if( key == KeyEvent.VK_RIGHT )
			spritePosX[0] += xSpeed;
		
		// Move the Circle
		if( key == KeyEvent.VK_W )
			spritePosY[1] -= ySpeed;
		
		if( key == KeyEvent.VK_X )
			spritePosY[1] += ySpeed;
		
		if( key == KeyEvent.VK_A )
			spritePosX[1] -= xSpeed;
		
		if( key == KeyEvent.VK_D)
			spritePosX[1] += xSpeed;
		
		checkSpritePosRange();
		repaint();
	}

	private void checkSpritePosRange() {
		for(int i = 0; i < SPRITES_NUM; i++) {
			if( spritePosX[i] < 0)	spritePosX[i] = SCREEN_WIDTH;
			if( spritePosY[i] < 0)	spritePosY[i] = SCREEN_HEIGHT;
			if( spritePosX[i] > SCREEN_WIDTH) spritePosX[i] = 0;
			if( spritePosY[i] > SCREEN_HEIGHT) spritePosY[i] = 0;
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}