public class VertTri extends Shape {

	private int type;

	private final int UpLeft = 1;
	private final int UpRight = 2;
	private final int DownLeft = 3;
	private final int DownRight = 4;

	public VertTri(int height, int type) {
		super(height);
		this.type = type;
	}

	public VertTri(int height, int type, String ch) {
		super(height, ch);
		this.type = type;
	}

	public VertTri() {
		super();
	}

	public void draw() {
		switch (type) {
		case UpLeft:

			break;
		case UpRight:

			break;

		case DownLeft:
			for (int i = 1; i <= height; i++) {
				prchar(ch, height - i + 1);
				System.out.printf("\n");
			}

			break;
		case DownRight:
			for (int i = 1; i <= height; i++) {
				prchar(" ", i - 1);
				prchar(ch, height - i + 1);
				System.out.printf("\n");
			}
			break;
		}
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setType(int type) {
		this.type = type;

	}

	public int getType() {
		return type;
	}

	public String getCh() {
		return ch;
	}

	public void setCh(String ch) {
		this.ch = ch;
	}

	public String toString() {
		return String.format("VertTri: Height=%d, Type=%d, Ch=%s\n", height, type, ch);
	}

}
