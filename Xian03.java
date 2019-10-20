class MaxPriority implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"正在输出："+i);
		}
	}
}
class MinPriority implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"正在输出："+i);
		}
	}
}

public class Xian03{
	public static void main(String[] args) {
		Thread maxPriority = new Thread(new MaxPriority(),"优先级较高的进程");
                                Thread minPriority = new Thread(new MinPriority(),"优先级较低的进程");
                                minPriority.setPriority(Thread.MIN_PRIORITY);
		maxPriority.setPriority(10);   
		maxPriority.start();
                                minPriority.start();
	}
}
