import java.util.*;
import java.util.Random;


public class TelcomUser {
	private String phoneNumber;    //���к���
	private String callTo;         //���к���
	private StringBuffer communicationRecords;
	
	
	public TelcomUser(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.communicationRecords = new StringBuffer();
		
	}
	//ģ��ͨ����¼������
	void generateCommunicateRecord() {
		//�������ͨ����¼��Ŀ
		int recordNum = new Random().nextInt(10);
		for(int i=0;i<=recordNum;i++) {
			//������ɵ�i��ͨ����¼
			callTo = getCallToPhoneNumber();
			
			//��ʼʱ��
			long timeStart = System.currentTimeMillis()-new Random().nextInt(36000000);
			//����ʱ��
			long timeEnd = timeStart + 60000 +new Random().nextInt(600000);
			//���к���
			getCallToPhoneNumber();
			//����ͨ����¼
			this.communicationRecords.append(this.phoneNumber + "," + timeStart + "," + 
			                                 timeEnd + "," + this.callTo + ";");
			
		}
		
	}
	
	//������ɱ��к��루����λ�����������
	private String getCallToPhoneNumber() {
		return "1380372" +String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10));
		
	}
	
	//ģ��ƷѰ취�����ַ�������ʽ���ر���4λС���ļƷѽ��
	private String accountFee(long timeStart,long timeEnd) {
		//ÿ�����շ�0.2Ԫ
		double feePerMinute = 0.2;
		//ͨ��ÿ�������������������
		int minutes = Math.round((timeEnd - timeStart)/60000);
		double  feeTotal = feePerMinute*minutes;
		return String.format("%.4f", feeTotal);
		
		
	}
	
	//��ӡͨ����¼
	void printDetails() {
		//��ȡȫ��ͨ����¼
		String allRecords = this.communicationRecords.toString();
		//�ָ�ͨ����¼
		String [] recordArray = allRecords.split(";");
		//ѭ���ָ��¼�ڵ�ÿһ����
		for(int i=0;i<recordArray.length;i++) {
			String [] recordField = recordArray[i].split(",");
			System.out.println("-----------ͨ����¼�ָ���----------");
			System.out.println("���У�"+recordField[0]);
			System.out.println("���У�"+recordField[3]);
			System.out.println("ͨ����ʼʱ�䣺" + new Date(Long.parseLong(recordField[1])));
			System.out.println("ͨ������ʱ�䣺" + new Date(Long.parseLong(recordField[2])));
			System.out.println("�Ʒѣ�" + accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]) ) + "Ԫ");
			
			
			
			
		}
	}

}