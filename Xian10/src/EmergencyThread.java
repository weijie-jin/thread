
public class EmergencyThread implements Runnable {
	public void run() {
		for(int i=1;i<6;i++) {
			System.out.println(Thread.currentThread().getName()+"���룺"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
