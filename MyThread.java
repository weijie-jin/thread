class MyThread extends Thread{
	public void run(){
		while (true){
			System.out.println("MyThread类的run()方法在运行");
		}
	}
}