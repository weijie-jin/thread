public class Xian02{
	public static void main(String[] args){
		MyThread02 myThread = new MyThread02();//���� MyThread ��ʵ������
		Thread thread = new Thread(myThread);//�����̶߳���
		thread.start();//�����̣߳�ִ���߳��е�run()������
		while(true){
			System.out.println("main()����������");
		}
	}
}