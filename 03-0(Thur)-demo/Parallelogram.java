
public class Parallelogram extends Shape {
	
	private int width;
	private int type;

	public Parallelogram() {
		super();
	}
	
	public Parallelogram(int height, int width) {
		super(height);
	    this.width = width;	
	}
	
	
	public Parallelogram(int height, int width, boolean filled) {
		super(height,filled);
	    this.width = width;	
	}

	
	public Parallelogram(int height, int width, boolean filled, int type) {
		super(height,filled);
	    this.width = width;
	    this.type = type;
	}

	public Parallelogram(int height, int width, boolean filled, String ch) {
		super(height,filled,ch);
	    this.width = width;	
	}
	
	public Parallelogram(int height, int width, boolean filled, int type, String ch) {
		super(height,filled,ch);
	    this.width = width;	
	    this.type = type;
	}

	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	
	@Override
	public String toString() {
		return "Parallelogram [width=" + width + ", type=" + type + ", height=" + height + ", ch=" + ch + ", filled="
				+ filled + ", getWidth()=" + getWidth() + ", getType()=" + getType() + "]";
	}

	@Override
	public void draw() {
		if(filled){
			for(int i=1;i<=height;i++){
				prchar(" ", height-1);
				prchar(ch,width);
				System.out.println();
			}
		}else{
			for(int i=1;i<=height;i++){
				prchar(" ", height-i);
				if(i==1 || i==height){
					prchar(ch,width);	
				}else{
					System.out.print(ch);
					prchar(" ",width-2);
					System.out.print(ch);
				}
				
				System.out.println();
			}
			
		}

	}

}
