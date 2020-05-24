
public abstract class Shape {

	protected int height;
	protected String ch = "*";

	public Shape(int height) {
		this.height = height;
	}

	public Shape(int height, String ch) {
		this.height = height;
		this.ch = ch;
	}

	public Shape() {

	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getCh() {
		return ch;
	}

	public void setCh(String ch) {
		this.ch = ch;
	}

	public abstract void draw();
}
