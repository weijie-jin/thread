class MyTeachers implements Runnable{
	private int books = 80;
	public void run(){
		while(true){
			if(books>0){
				Thread th = Thread.currentThread();
				String th_name = th.getName();
				System.out.println(th_name+"正在发第"+books--+"本书");
			}
		}
	}
}

public class Lian03{
	public static void main(String[] args){
		MyTeachers t = new MyTeachers();
		new Thread (t,"王老师").start();
        new Thread (t,"郭老师").start();
        new Thread (t,"张老师").start();		
	}
}