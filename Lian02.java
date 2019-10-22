class MyThread2 implements Runnable{
	public void run(){
		for(int i=1;i<=50;i++){
			System.out.println("new"+i);
		}
	}
}

public class Lian02{
	public static void main(String[] args)throws Exception{
		MyThread2 mythread = new MyThread2();
		Thread thread = new Thread(mythread);
		thread.start();
		thread.join();
	
    	for(int i=1;i<=100;i++){
			System.out.println("main"+i);
		}
	}
}