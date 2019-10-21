public class Xian04{
	public static void main(String[] args)throws Exception{
		Thread minPriority = new Thread(new MinPriority(),"优先级较低的线程");
		Thread maxPriority = new Thread(new MaxPriority(),"优先级较高的线程");
		minPriority.setPriority(Thread.MIN_PRIORITY);
		maxPriority.setPriority(10);
		
		maxPriority.start();
		maxPriority.join();
		minPriority.start();
		
		
	}
}