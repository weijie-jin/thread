class Taxi implements Runnable{
	private int people = 100;
	public void run(){
		while(true){
			if(people>0){
				Thread th = Thread.currentThread();
				String th_name = th.getName();
			System.out.println(th_name+"�����͵�"+people--+"λ����");
			
			}
		}
	}
}

public class Lian04{
	public static void main(String[] args){
		Taxi t = new Taxi();
		new Thread(t,"���⳵һ").start();
		new Thread(t,"���⳵��").start();
		new Thread(t,"���⳵��").start();
		new Thread(t,"���⳵��").start();
		new Thread(t,"���⳵��").start();
		
	}
}