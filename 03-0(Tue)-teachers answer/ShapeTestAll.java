
public class ShapeTest {

	
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