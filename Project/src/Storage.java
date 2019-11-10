import java.util.Random;

public class Storage {
	private int[] cells = new int [10];
	private int inPos,outPos;
	private int count;
	Random wt = new Random();//�������һ����
	
	public synchronized void put (int num){
		try {
			while(count == cells.length){
				this.wait();
			}
			cells[inPos] = wt.nextInt(10);
			
			System.out.println("��cells["+inPos+"]�е�½�û�"+String.valueOf(cells[inPos]));//�������һ���� ����ַ��������û���
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
			System.out.println("��cells["+outPos+"]��ע���û�"+data);
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
