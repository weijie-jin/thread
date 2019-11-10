import java.util.Random;

public class Storage {
	private int[] cells = new int [10];
	private int inPos,outPos;
	private int count;
	Random wt = new Random();//随机产生一个数
	
	public synchronized void put (int num){
		try {
			while(count == cells.length){
				this.wait();
			}
			cells[inPos] = wt.nextInt(10);
			
			System.out.println("在cells["+inPos+"]中登陆用户"+String.valueOf(cells[inPos]));//随机产生一个数 变成字符串当作用户名
			inPos++;
			if(inPos == cells.length)
				inPos = 0;
			count++;
			this.notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void get(){
			
		try {
			while(count==0){
				this.wait();
			}
			int data = cells[outPos];
			System.out.println("从cells["+outPos+"]中注销用户"+data);
			cells[outPos] = 0;
			outPos++;
			if(outPos == cells.length)
				outPos = 0;
			count--;
			this.notify();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
