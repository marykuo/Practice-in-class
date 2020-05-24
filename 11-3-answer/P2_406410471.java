// ID: 406410471,name:郭美郁,class: 1B 
import java.util.Random;
import java.util.Scanner;

public class P2_406410471 {

	public static void main(String[] args) {
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);
		int N,count=0;
		int count_n[];
		count_n=new int[50];
		int first[];
		first=new int[50];
		int first_n=1;
		
		char blank=' ';
		System.out.print("Enter N: ");
		N=scan.nextInt();
		
		for(int i=0;i<N;i++){
			for(int j=0;j<6;j++){
				int rand_n;
				rand_n=rand.nextInt(49)+1;
				count_n[rand_n]++;
				first[first_n]=rand_n;
				first_n++;
				if(count_n[rand_n]>count){
					count=count_n[rand_n];
				}
				if(j!=0){
					System.out.print(blank);
				}
				if(rand_n/10==0){
					System.out.print(blank+rand_n);
				}else{
					System.out.print(rand_n);
				}
				
			}
			System.out.println();
		}
		
		for(int i=1;i<50;i++){
			if(count_n[first[i]]==count){
				System.out.println("Max: ("+first[i]+", "+count+")");
				break;
			}
		}
		
		
	}

}
