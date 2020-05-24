
public class ShapeTest {

	public static void main(String[] args) {
		final int MAX = 100;
		int ShapeCount=0;
		boolean filled;
		Shape shapes[]=new Shape[MAX];
		shapes[ShapeCount++]=new RECT(5,10);
		shapes[ShapeCount++]=new VerTri(5,3);
		shapes[ShapeCount++]=new VerTri(5,4);
		shapes[ShapeCount++]=new VerTri(8,3,"$");
		shapes[ShapeCount++]=new Parallelogram(5,8,false,"#");
		
		for(int i=0;i<ShapeCount;i++){
			shapes[i].draw();
			System.out.println();
		}
		
		
	}

}
