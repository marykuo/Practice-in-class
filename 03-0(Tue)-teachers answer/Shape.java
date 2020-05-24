
public abstract class Shape {

	protected int height;
	protected String ch = "*";
	protected boolean filled= true;

	public Shape(int height) {
		this.height = height;
	}

	public Shape(int height, String ch) {
		this.height = height;
		this.ch = ch;
	}

	public Shape(int height, boolean filled, String ch) {
       this.height = height;
       this.filled = filled;
       this.ch = ch;
	}

	public Shape() {
		// TODO Auto-generated constructor stub
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

	void prchar(String c, int n) {
		for (int i = 1; i <= n; i++)
			System.out.printf("%s", c);
	}

	public abstract void draw();
}
