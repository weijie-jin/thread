class MyThread1 extends Thread{
	public void run(){
		Thread th = Thread.currentThread();
		//String th_name = th.getName();
		System.out.println(th.getName());
		
	}
}


public class Lian01{
	public static void main(String[] args){
		MyThread1 t = new MyThread1();
		new Thread (t,"T1").start();
		new Thread (t,"T2").start();
		
		
	}
}