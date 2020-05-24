import java.util.Random;
import java.util.Scanner;

public class ShapeTestRect{
   public static void main(String[] args) {
	   final int MAX = 100;
       int shapeCount=0;
       boolean filled, filled2;
       int height, height2;
       int width, width2;
       String ch = "*";
       Shape shapes[] = new Shape[MAX];
       
       // Testing Rect
       Scanner input = new Scanner(System.in);
       System.out.print("Enter height and width: ");
       height = input.nextInt();
       width = input.nextInt();
       System.out.print("Enter filled? ");
       filled = input.nextBoolean();
       System.out.print("Enter ch: ");
       ch = input.next();
       Rect rect1 = new Rect(height,width,filled, ch);
       shapes[shapeCount++] = rect1;
       Rect rect2 = new Rect(height,width,!filled, ch);
       shapes[shapeCount++] = rect2;
       Rect rect3 = new Rect(height,width,filled);
       shapes[shapeCount++] = rect3;
       Rect rect4 = new Rect(height,width,!filled);
       shapes[shapeCount++] = rect4;
       Rect rect5 = new Rect(height,width);
       shapes[shapeCount++] = rect5;
       Rect rect6 = new Rect(height,width);
       shapes[shapeCount++] = rect6;
   
       Random rand = new Random();
       height2 = rand.nextInt(6)+5;  // 5~10
       width2 = rand.nextInt(6)+5;
       filled2 = rand.nextBoolean();
       Rect rect7 = new Rect();
       rect7.setHeight(height2);
       rect7.setWidth(width2);
       rect7.setFilled(filled2);
       rect7.setCh(ch);
       //System.out.println(rect7);
       //System.out.println(" "+height2+" "+width2+" "+filled2+" "+ch);
       shapes[shapeCount++] = rect7;
       
       Rect rect8 = new Rect();
       height2 = rand.nextInt(6)+5;  // 5~10
       width2 = rand.nextInt(6)+5;
       filled2 = rand.nextBoolean();
       rect8.setHeight(height2);
       rect8.setWidth(width2);
       rect8.setFilled(filled2);
       shapes[shapeCount++] = rect8;
       //System.out.println(" "+height2+" "+width2+" "+filled2+" "+ch);
       
       //System.out.println(shapeCount);
       for(int i=0;i<shapeCount;i++){
    	   shapes[i].draw();
    	   System.out.println();
       }
	}
}


/*
   public static void main(String[] args) {
	   final int MAX = 100;
       int shapeCount=0;
       boolean filled;
       Shape shapes[] = new Shape[MAX];
       shapes[shapeCount++] = new Rect(5,10);
       shapes[shapeCount++] = new VertTri(5,3);
       shapes[shapeCount++] = new VertTri(5,4);
       shapes[shapeCount++] = new VertTri(8,3,"$");
       shapes[shapeCount++] = new Parallelogram(5,8,false,"#");
       
       for(int i=0;i<shapeCount;i++){
    	   shapes[i].draw();
    	   System.out.println();
       }
	}

}
 
 */

/*
		Rect rect;
		rect = new Rect(5,10);
		rect.draw();
		
		VertTri vtri1 = new VertTri(5,3);
        vtri1.draw();
        System.out.println();
		VertTri vtri2 = new VertTri(5,4);
        vtri2.draw();
        System.out.println();
        VertTri vtri3 = new VertTri();
        vtri3.setHeight(8);
        vtri3.setType(3);
        vtri3.setCh("$");
        vtri3.draw();
        System.out.printf("Height=%d; Type=%d; Ch=%s\n", vtri3.getHeight(), vtri3.getType(), vtri3.getCh());
        System.out.println(vtri3);

*/