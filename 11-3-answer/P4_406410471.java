// ID: 406410471,name:郭美郁,class: 1B 
import java.util.Scanner;

public class P4_406410471 {
	
	public static void main(String[] args) {
		int w,x,y,z;
		Scanner scan=new Scanner(System.in);
		A objA=new A();
		System.out.print("Enter w, x, y, z: ");
		w=scan.nextInt();
		x=scan.nextInt();
		y=scan.nextInt();
		z=scan.nextInt();
		objA.A(w, x, y, z);
		System.out.println("max = "+objA.max());
		System.out.println("min = "+objA.min());
		System.out.println("sum = "+objA.sum());
		System.out.println("average = "+objA.average());
	}
}
class A{
	int w,x,y,z;
	public void A(){
		
	}
	public void A(int w, int x, int y, int z) {
		this.w=w;
		this.x=x;
		this.y=y;
		this.z=z;
	}
	int max(){
		int max=w;
		if(x>max) max=x;
		if(y>max) max=y;
		if(z>max) max=z;
		return max;
	}
	int min(){
		int min=w;
		if(x<min) min=x;
		if(y<min) min=y;
		if(z<min) min=z;
		return min;
	}
	int sum(){
		return w+x+y+z;
	}
	float average(){
		float ans;
		float x,y;
		ans=(float)sum()/4;
		x=ans*10;
		y=ans*100;
		y-=(int)x*10;
		if(y>=5){
			ans=(float) (0.1*(x+1)-0.01*y);
		}else{
			ans=(float) (0.1*x-0.01*y);
		}
		return ans;
	}
}