import java.util.Scanner;

public class P2_406410471 {

	public static void main(String[] args) {
		int n;
		int sum_in;
		Scanner scan=new Scanner(System.in);
		System.out.print("n: ");
		n=scan.nextInt();
		re(n);
		System.out.print("(n for odd)sum1: ");
		sum_in=scan.nextInt();
		System.out.println("sum1("+sum_in+") = "+sum1(sum_in));
		System.out.println("sum2("+sum_in+") = "+sum2(sum_in));
	}
	
	private static int sum1(int n) {
		if(n==1){
			return 1;
		}else{
			return n+sum1(n-2);
		}
	}

	private static int sum2(int n) {
		if(n==1){
			return 1;
		}else{
			return 2*n-1+sum2(n-1);
		}
	}

	static void re(int n){
		if(n==0){
			return;
		}
		prchar(n);
		System.out.println();
		re(n-1);
	}

	static void prchar(int n){
		if(n==0){
			return;
		}
		System.out.print("*");
		prchar(n-1);
	}
	
}