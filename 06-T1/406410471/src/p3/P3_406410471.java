package p3;

import java.util.Random;
import java.util.Scanner;
		
public class P3_406410471 {
	public static void main(String[] args) {
		final int MAX = 100;
		final int UP = 1;
		final int DOWN = 2;
		int direction=1;
	    int shapeCount=0;
	    boolean filled=true;
	    int height=5;
	    String[] array_s=new String[5];//
	    String ch="*";
	    Random rand = new Random();       
	    Shape shapes[] = new Shape[MAX];
	    
	    array_s[0]="*";
	    array_s[1]="#";
	    array_s[2]="$";
	    array_s[3]="@";
	    array_s[4]="%";
	    
		for(int i=0;i<5;i++) {
			shapes[0] = new Triangle();
			shapes[0].setHeight(rand.nextInt(5)+4);
			((Triangle) shapes[0]).setDirection(rand.nextInt(2)+1);
			shapes[0].setFilled(rand.nextBoolean());
			shapes[0].setCh(array_s[rand.nextInt(5)]);
			shapes[0].draw();
			System.out.println(shapes[0]);
	    }
       /*
       shapes[shapeCount++] = new Rect(5,10);
       shapes[shapeCount++] = new VertTri(5,3);
       shapes[shapeCount++] = new VertTri(5,4);
       shapes[shapeCount++] = new VertTri(8,3,"$");
       shapes[shapeCount++] = new Parallelogram(5,8,false,"#");
       */
       for(int i=0;i<shapeCount;i++){
    	   shapes[i].draw();
    	   System.out.println(shapes[i]);
       }
	}
}
/*亂數範圍如下:
height: 4~8 (高度)
direction: UP, DOWN  (三角形尖角方向)
filled: true, false (填滿與否)有
ch: *, #, $, @, % 有五種字元可以選擇，先存在陣列中，用亂數取出
*/