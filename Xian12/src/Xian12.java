
public class Xian12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket12 ticket = new Ticket12();
		new Thread(ticket,"�߳�һ").start();
		new Thread(ticket,"�̶߳�").start();
		new Thread(ticket,"�߳���").start();
		new Thread(ticket,"�߳���").start();
		

	}

}
