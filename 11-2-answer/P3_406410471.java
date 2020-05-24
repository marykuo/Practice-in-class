import java.util.Scanner;

public class P3_406410471 {

	public static void main(String[] args) {
		int count=0;
		float sum=0;
		int largest,smallest;
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a series of integers (enter-999 to break):");
		n=scan.nextInt();
		largest=n;
		smallest=n;
		while(n!=-999){
			if(largest<n){
				largest=n;
			}
			if(smallest>n){
				smallest=n;
			}
			sum+=n;
			count++;
			n=scan.nextInt();
		}
		sum=sum/count;
		System.out.println("Numbers Entered: "+count);
		System.out.println("Largest number: "+largest);
		System.out.println("Smallest number: "+smallest);
		System.out.println("Average: "+sum);
	}

}
