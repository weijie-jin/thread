import java.util.*;
import java.text.*;

public class TelcomUserBasedOnCollection {
	private String phoneNumber;    //主叫号码
	private String callTo;         //被叫号码
	private Vector communicationRecords;
	private ArrayList callToNumbers;
	private  TreeSet callToNUmbersHashSet;
	
	public TelcomUserBasedOnCollection(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.communicationRecords = new Vector();
		this.callToNumbers = new ArrayList();
		this.callToNUmbersHashSet = new TreeSet();
	}
	//模拟通话记录的生成
	void generateCommunicateRecord() {
		//随机生成通话记录数目
		int recordNum = new Random().nextInt(10);
		
		//HashSet communicationRecords = new HashSet();
		for(int i=0;i<=recordNum;i++) {
			//随机生成第i条通话记录
			
			//开始时间
			long timeStart = System.currentTimeMillis()-new Random().nextInt(36000000);
			//结束时间
			long timeEnd = timeStart + 60000 +new Random().nextInt(600000);
			//被叫号码
			this.callTo = getCallToPhoneNumber();
			this.callToNumbers.add(this.callTo);
			this.callToNUmbersHashSet.add(this.callTo);
			//插入通话记录
			this.communicationRecords.add(this.phoneNumber + "," + timeStart + "," + 
			                                 timeEnd + "," + this.callTo + ";");
			
		}
		
	}
	
		//随机生成被叫号码（后一位随机）并返回
		private String getCallToPhoneNumber() {
			return "1380372000" +String.valueOf(new Random().nextInt(10));
			
		}
		
		private String accountFee(long timeStart,long timeEnd) {
			//每分钟收费0.2元
			double feePerMinute = 0.2;
			//通话每分钟数按四舍五入计算
			int minutes = Math.round((timeEnd - timeStart)/60000);
			double  feeTotal = feePerMinute*minutes;
			return String.format("%.4f", feeTotal);
			
			
		}
		
		//打印通话记录
		void printDetails() {
			
			
			for(Object aRecord:this.communicationRecords){
				String [] recordField = ((String)aRecord).split(",");
				SimpleDateFormat date1 = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 点 mm 分 ss 秒");
				
				DateFormat mediumFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
				System.out.println("-----------通话记录分割线----------");
				System.out.println("主叫："+recordField[0]);
			    System.out.println("被叫："+recordField[3]);
				System.out.println("通话开始时间：" +date1.format(Long.parseLong(recordField[1])));
				System.out.println("通话结束时间：" +date1.format(Long.parseLong(recordField[2])));
				System.out.println("计费：" + accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]) ) + "元");
				
				
			}
		}
		
		//打印被叫号码（无重复）
		void printcallToNumbers() {
			for(Object callTo:this.callToNumbers) {
				System.out.println((String)callTo);
			}
			System.out.println("------List/TreeSet分割线----");
			for(Object callTo:this.callToNUmbersHashSet) {
				System.out.println((String)callTo);
			}
		}

}
