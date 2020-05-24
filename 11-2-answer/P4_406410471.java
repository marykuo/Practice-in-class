import java.util.Scanner;

public class P4_406410471 {

	public static void main(String[] args) {
		int a, b, sum;
		A objA;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter two integers: ");
		a=scan.nextInt();
		b=scan.nextInt();
		objA = new A(a, b);
		System.out.print(a+" + "+b+" = "+objA.Sum(a, b));
	}

}
class A{
	int x;
	int y;
	A(){
		this.x=0;
		this.y=0;
	}
	A(int a, int b){
		this.x=a;
		this.y=b;
	}
	int Sum(int x, int y){
		return x+y;
	}
}