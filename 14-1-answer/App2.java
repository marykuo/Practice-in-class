package multithread;

public class App2 {

	public static void main(String[] args) {
		Thread run1 = new Thread(new Runner2());
		run1.start();
		Thread run2 = new Thread(new Runner2());
		run2.start();
	}

}

class Runner2 extends Thread{
	
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("Hello "+i);
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}