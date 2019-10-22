class Taxi implements Runnable{
	private int people = 100;
	public void run(){
		while(true){
			if(people>0){
				Thread th = Thread.currentThread();
				String th_name = th.getName();
			System.out.println(th_name+"正在送第"+people--+"位客人");
			
			}
		}
	}
}

public class Lian04{
	public static void main(String[] args){
		Taxi t = new Taxi();
		new Thread(t,"出租车一").start();
		new Thread(t,"出租车二").start();
		new Thread(t,"出租车三").start();
		new Thread(t,"出租车四").start();
		new Thread(t,"出租车五").start();
		
	}
}