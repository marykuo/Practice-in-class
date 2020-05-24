
public class Parallelogram extends Shape {
	
	private int width;
	
	public Parallelogram(int height, int width, boolean filled, String ch) {
		super(height,filled,ch);
		this.width=width;
		
	}

	@Override
	public void draw() {
		for(int i=1;i<=height;i++){
			prchar(" ",height-i);
			if(filled){
				prchar(ch,width);
			}else{
				prchar(ch,1);
				if(i==1||i==height)
					prchar(ch,width-2);
				else{
					prchar(" ",width-2);
				}
				prchar(ch,1);
			}
			System.out.println();
		}
	}
	void prchar(String c, int n){
	    for(int i=1;i<=n;i++)
	        System.out.printf("%s", c);
	}
}
