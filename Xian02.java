public class Xian02{
	public static void main(String[] args){
		MyThread02 myThread = new MyThread02();//创建 MyThread 的实例对象
		Thread thread = new Thread(myThread);//创建线程对象
		thread.start();//开启线程，执行线程中的run()方法；
		while(true){
			System.out.println("main()方法在运行");
		}
	}
}