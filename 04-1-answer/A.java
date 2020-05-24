package T1;

public class A {
	private static int x;
	private static int y;
	public A() {
		x=0;
		y=0;
	}
	
	public  A(int a, int b) {
		x=a;
		y=b;
	}

	static int Sum() {  // return the summation of x and y
		return x+y;
	}
	
}
