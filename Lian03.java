class MyTeachers implements Runnable{
	private int books = 80;
	public void run(){
		while(true){
			if(books>0){
				Thread th = Thread.currentThread();
				String th_name = th.getName();
				System.out.println(th_name+"���ڷ���"+books--+"����");
			}
		}
	}
}

public class Lian03{
	public static void main(String[] args){
		MyTeachers t = new MyTeachers();
		new Thread (t,"����ʦ").start();
        new Thread (t,"����ʦ").start();
        new Thread (t,"����ʦ").start();		
	}
}