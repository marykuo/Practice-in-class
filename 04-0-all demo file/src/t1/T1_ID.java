package t1;
import java.util.Scanner;

public class T1_ID {

	public static void main(String[] args) {
		int x,y;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two integers: ");
		x=input.nextInt();
		y=input.nextInt();
		A a = new A(x,y);
		System.out.printf("%d + %d = %d\n", x,y,a.Sum());
	}
}

class A {
  int x;
  int y;
  public A(){
	  
  };  // set zero to x and y
  public A(int a, int b){
	  x = a;
	  y = b;
  };  // set a to x and set b to y
  public int Sum(){
	  return x+y;
  };  // return the summation of x and y
};