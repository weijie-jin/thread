
public class Xian11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket011 ticket = new Ticket011();
		new Thread(ticket,"线程一").start();
		new Thread(ticket,"线程二").start();
		new Thread(ticket,"线程三").start();
		new Thread(ticket,"线程四").start();


	}

}
