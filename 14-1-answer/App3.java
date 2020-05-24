package multithread;

public class App3 {

	public static void main(String[] args) {
		Thread runner = new Thread(new Runnable(){
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
		});
		runner.start();
		
	}

}
