
public class RectText {

	public static void main(String[] args) {
		RECT rect;
		rect=new RECT(5,10);
		rect.draw();
		
		RECT rect2=new RECT();
		rect2.setHeight(6);
		rect2.setWidth(8);
		rect2.draw();
		System.out.printf("Height=%d; Width=%d\n", rect2.getHeight(), rect2.getWidth());
		System.out.println(rect2);
	}

}
