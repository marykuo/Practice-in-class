package p3;

public class Triangle extends Shape {
	
	private int direction;

	public Triangle() {
		super();
	}
	

	@Override
	public void draw() {
		if(direction==1) {
			if(filled==true) {
				for(int i=1;i<=height;i++) {
					prchar(" ",height-i);
					prchar(ch,2*i-1);
					System.out.println();
				}
			}else {
				for(int i=1;i<=height;i++) {
					prchar(" ",height-i);
					if(i==1)
						prchar(ch,1);
					else if(i==height)
						prchar(ch,height*2-1);
					else{
						prchar(ch,1);
						prchar(" ",2*(i-1)-1);
						prchar(ch,1);
					}
					System.out.println();
				}
			}
		}else {
			if(filled==true) {
				for(int i=1;i<=height;i++) {
					prchar(" ",i-1);
					prchar(ch,(height-i)*2+1);
					System.out.println();
				}
			}else {
				for(int i=1;i<=height;i++) {
					prchar(" ",i-1);
					if(i==height)
						prchar(ch,1);
					else if(i==1)
						prchar(ch,height*2-1);
					else{
						prchar(ch,1);
						prchar(" ",(height-1-i)*2+1);
						prchar(ch,1);
					}
					System.out.println();
				}
			}
		}
		
	}
	
	public int getDirection() {
		return direction;
	}


	public void setDirection(int direction) {
		this.direction = direction;
	}

	public String toString() {
		return "Triangle [direction=" + direction + ", height=" + height + ", ch=" + ch + ", filled=" + filled + "]";
	}

}
