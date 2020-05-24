import java.util.Scanner;

public class P4_123456789 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int x,y;
    	Scanner in = new Scanner(System.in);
        System.out.print("Enter two integers:");
        x = in.nextInt();
        y = in.nextInt();
    	A a = new A(x,y);
    	System.out.printf("%d + %d = %d\n", x,y,a.Sum());    	
	}
}

class A {
	int x,y;
	public A(){
		
	}
	public A(int x, int y){
		this.x = x;
		this.y = y;
	}
	
    int Sum(){
    	return x+y;
    }
}
