
public class Xian04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread (new SleepThread()).start();
		
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println("主线程正在输出："+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
      
	}

}
