import java.util.*;
import java.util.Random;


public class TelcomUser {
	private String phoneNumber;    //主叫号码
	private String callTo;         //被叫号码
	private ArrayList communicationRecords;
	private HashMap singleRecord;
	
	public TelcomUser(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.communicationRecords = new ArrayList();
		
	}
	//模拟通话记录的生成
	void generateCommunicateRecord() {
		//随机生成通话记录数目
		int recordNum = new Random().nextInt(10);
		for(int i=0;i<=recordNum;i++) {
			//随机生成第i条通话记录
			callTo = getCallToPhoneNumber();
			
			//开始时间
			long timeStart = System.currentTimeMillis()-new Random().nextInt(36000000);
			//结束时间
			long timeEnd = timeStart + 60000 +new Random().nextInt(600000);
			//被叫号码
			getCallToPhoneNumber();
			//插入通话记录
			this.singleRecord = new HashMap();
			this.singleRecord.put("主叫", this.phoneNumber);
			this.singleRecord.put("开始时间", new Date(timeStart));
			this.singleRecord.put("结束时间", new Date(timeEnd));
			this.singleRecord.put("被叫号码", this.callTo);
			this.singleRecord.put("计费",this.accountFee(timeStart, timeEnd));
			this.communicationRecords.add(this.singleRecord);
			
			
		}
		
	}
	
	//随机生成被叫号码（后四位随机）并返回
	private String getCallToPhoneNumber() {
		return "1380372" +String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10));
		
	}
	
	//模拟计费办法，以字符串的形式返回保留4位小数的计费结果
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
		//获取全部通话记录
		Iterator itRecords = this.communicationRecords.iterator();
		//循环分割记录内的每一项并输出
		while(itRecords.hasNext()) {
			//String [] recordField = recordArray[i].split(",");
//			System.out.println("-----------通话记录分割线----------");
//			System.out.println("主叫："+recordField[0]);
//			System.out.println("被叫："+recordField[3]);
//			System.out.println("通话开始时间：" + new Date(Long.parseLong(recordField[1])));
//			System.out.println("通话结束时间：" + new Date(Long.parseLong(recordField[2])));
//			System.out.println("计费：" + accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]) ) + "元");
//			
			System.out.println("-----------通话记录分割线----------");
			this.singleRecord = (HashMap)itRecords.next();   //取出键值对集合
			Set entrySet = this.singleRecord.entrySet();    //取出键的集合
			Iterator itEntry = entrySet.iterator();
			while(itEntry.hasNext()){
				Map.Entry entry =  (Map.Entry)itEntry.next();
				Object key = entry.getKey();
				Object value = entry.getValue();
				System.out.println(key + ":" + value);
			}
			
		}
	}

}