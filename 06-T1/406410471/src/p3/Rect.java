package p3;

public class Rect extends Shape {
	private int width;

	public Rect() {
		super();
	}

	public Rect(int height, int width) {
		super(height);
		this.width = width;
	}

	public Rect(int h, int w, String ch) {
		super(h, ch);
		width = w;
	}

	public Rect(int h, int w, boolean filled, String ch) {
		super(h, filled, ch);
		width = w;
	}

	
	public Rect(int height, int width, boolean filled) {
		super(height,filled);
		this.width = width;
	}

	public void draw() {
		if(filled){
			for (int i = 1; i <= height; i++) {
				for (int j = 1; j <= width; j++)
					System.out.print(ch);
				System.out.println();
			}
		}else{
			for (int i = 1; i <= height; i++) {
				for (int j = 1; j <= width; j++)
					if(i==1 || j==1 || i==height || j==width)
						System.out.print(ch);
					else
						System.out.print(" ");
				System.out.println();
			}
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rect [width=" + width + ", height=" + height + ", ch=" + ch + ", filled=" + filled + ", getWidth()="
				+ getWidth() + ", getHeight()=" + getHeight() + "]";
	}
}
