package p1;

import java.util.Scanner;

public class Comp {
	
	private static int x=0,y=0,z=0;
	
	public void Comp(){
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextInt();
		y=scanner.nextInt();
		z=scanner.nextInt();
		
		Comp.Comp(x,y,z);
	}
	
	private static void Comp(int x, int y, int z) {
		System.out.printf("sum(%d,%d,%d) = %d\n",x,y,z,Comp.sum());
		System.out.printf("max(%d,%d,%d) = %d\n",x,y,z,Comp.max());
		System.out.printf("min(%d,%d,%d) = %d\n",x,y,z,Comp.min());
	}

	public static int sum() {
		return x+y+z;
	}

	public static int max() {
		int max=x;
		if(y>max)
			max=y;
		if(z>max)
			max=z;
		return max;
	}

	public static int min() {
		int min=x;
		if(y<min)
			min=y;
		if(z<min)
			min=z;
		return min;
	}

}
