package bank;

import java.util.HashMap;

//模拟银行系统的账户信息，相当于数据库的功能；
public class DBUtil{
	private static DBUtil instance = null;
	private HashMap users = new HashMap();
	
	private DBUtil() {
		//------李现--------
		User u1 = new User();
		u1.setCardId("10001");
		u1.setCardPwd("123456");
		u1.setUserName("李现");
		u1.setCall("13803788940");
		u1.setAccount(10000);
		users.put(u1.getCardId(),u1);
		//-------毛不易------
		User u2 = new User();
		u2.setCardId("10002");
		u2.setCardPwd("000000");
		u2.setUserName("毛不易李现");
		u2.setCall("13460607649");
		u2.setAccount(5000);
		users.put(u2.getCardId(),u2);
		//--------张若昀------
		User u3 = new User();
		u3.setCardId("10003");
		u3.setCardPwd("111111");
		u3.setUserName("张若昀");
		u3.setCall("15518813904");
		u3.setAccount(1000);
		users.put(u3.getCardId(),u3);
	}
	//懒汉式单例模式
	public static DBUtil getInstance() {
		if(instance == null){
			synchronized(DBUtil.class) {
				if(instance == null) {
					instance = new DBUtil();
				}
			}
		}
		return instance;
	}
	//根据银行卡号获取对应单个账号的信息
	public User getUser(String cardId) {
		User user = (User) users.get(cardId);
		return user;
	}
	//获取所有账户的信息
	public HashMap getUsers() {
		return users;
	}

}
