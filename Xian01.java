public class Xian01{
	public static void main(String [] args){
		MyThread myThread = new MyThread();
		myThread.start();
		while(true){
			System.out.println("main()ÔÚÔËÐÐ");
		}
	}
}