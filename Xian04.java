public class Xian04{
	public static void main(String[] args)throws Exception{
		Thread minPriority = new Thread(new MinPriority(),"���ȼ��ϵ͵��߳�");
		Thread maxPriority = new Thread(new MaxPriority(),"���ȼ��ϸߵ��߳�");
		minPriority.setPriority(Thread.MIN_PRIORITY);
		maxPriority.setPriority(10);
		
		maxPriority.start();
		maxPriority.join();
		minPriority.start();
		
		
	}
}