
public class Parallelogram extends Shape {
	
	private int width;

	public Parallelogram(int height, int width, boolean filled, String ch) {
		super(height,filled,ch);
	    this.width = width;	
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
