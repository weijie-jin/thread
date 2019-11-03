
public class Xian12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket12 ticket = new Ticket12();
		new Thread(ticket,"线程一").start();
		new Thread(ticket,"线程二").start();
		new Thread(ticket,"线程三").start();
		new Thread(ticket,"线程四").start();
		

	}

}
