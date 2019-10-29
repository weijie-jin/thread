
public class Xian10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = new Thread(new EmergencyThread(),"线程一");
		t.start();
		for(int i=1;i<6;i++) {
			System.out.println(Thread.currentThread().getName()+"输入："+i);
			if(i==2) {
				try {
					t.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
