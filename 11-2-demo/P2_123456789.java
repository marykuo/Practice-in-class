import java.util.Scanner;

public class P2_123456789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int n;
    	Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        n = in.nextInt();
        tri(n);
        

        System.out.print("n for oddsum1: ");
        n = in.nextInt();
        System.out.printf("sum1(%d) = %d\n", n, sum1(n));
        System.out.printf("sum2(%d) = %d\n", n, sum2(n));

	}
	
	static void tri(int n){
	  if(n==1){
		  System.out.println("*");
	  }else{
		  rprchar("*", n);System.out.println();
		  tri(n-1);
	  }
	}
	
	static void prchar(String c, int n){
		for(int i=1;i<=n;i++)
			System.out.print(c);
	};
	
	static void rprchar(String c, int n){
		if(n==1){
			System.out.print(c);
		}else{
			rprchar(c, n-1);
			System.out.print(c);
		}
	};
	
	static int sum1(int n){
		if(n==1)
			return 1;
		else
		    return sum1(n-2)+n;
	}
	
	static int sum2(int n){
		if(n==1)
			return 1;
		else
		    return sum1(2*n-3)+(2*n-1);
	}
	
}

