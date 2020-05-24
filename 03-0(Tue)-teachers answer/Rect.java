
public class Rect extends Shape {
	private int width;

	public Rect(int h, int w) {
		super(h);
		width = w;
	}

	public Rect(int h, int w, String ch) {
		super(h, ch);
		width = w;
	}

	public void draw() {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++)
				System.out.print("*");
			System.out.println();
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
		return "Rect [height=" + height + ", width=" + width + ", ch=" + ch + "]";
	}

}
