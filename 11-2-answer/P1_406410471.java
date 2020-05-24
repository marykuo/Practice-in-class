import java.util.Scanner;

public class P1_406410471 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1,n2,ans;
		System.out.println("Teacher:");
		System.out.print("n1: ");
		n1=scan.nextInt();
		System.out.print("n2: ");
		n2=scan.nextInt();
		System.out.println("Student:");
		System.out.print(n1+" + "+n2+" = ?");
		ans=scan.nextInt();
		if(ans==(n1+n2)){
			System.out.println("Correct");
		}else{
			System.out.println("Wrong");
			System.out.println(n1+" + "+n2+" = "+(n1+n2));
		}
	}

}
