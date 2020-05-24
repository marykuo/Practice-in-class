package T1;
import java.util.Scanner;
public class T1_406410471 {

	public static void main(String[] args) {
		int a,b,sum;
		System.out.printf("Enter two integers: ");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		A test1=new A();  // set zero to x and y
		A test2=new A(a, b);  // set a to x and set b to y
		System.out.printf("%d + %d = %d", a, b, test2.Sum());
	}

}

/*
class A
{
  int x;
  int y;
  A();  // set zero to x and y
  A(int a, int b);  // set a to x and set b to y
  int Sum();  // return the summation of x and y
};
*/