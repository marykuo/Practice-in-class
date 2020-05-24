public class RECT extends Shape{
	private int width;
	
	public RECT(int h, int w) {
		super(h);
		width=w;
	}
	
	public RECT() {
		super();
	}

	public void draw(){
		for(int i=1;i<=height;i++){
			for(int j=1;j<=width;j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public int getWidth() {
		return width;
	}

	@Override
	public String toString() {
		return "RECT [height=" + height + ", width=" + width + "]";
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
