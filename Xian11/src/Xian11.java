
public class Xian11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket011 ticket = new Ticket011();
		new Thread(ticket,"�߳�һ").start();
		new Thread(ticket,"�̶߳�").start();
		new Thread(ticket,"�߳���").start();
		new Thread(ticket,"�߳���").start();


	}

}
