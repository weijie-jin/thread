package bank;

import java.util.HashMap;

//ģ������ϵͳ���˻���Ϣ���൱�����ݿ�Ĺ��ܣ�
public class DBUtil{
	private static DBUtil instance = null;
	private HashMap users = new HashMap();
	
	private DBUtil() {
		//------����--------
		User u1 = new User();
		u1.setCardId("10001");
		u1.setCardPwd("123456");
		u1.setUserName("����");
		u1.setCall("13803788940");
		u1.setAccount(10000);
		users.put(u1.getCardId(),u1);
		//-------ë����------
		User u2 = new User();
		u2.setCardId("10002");
		u2.setCardPwd("000000");
		u2.setUserName("ë��������");
		u2.setCall("13460607649");
		u2.setAccount(5000);
		users.put(u2.getCardId(),u2);
		//--------������------
		User u3 = new User();
		u3.setCardId("10003");
		u3.setCardPwd("111111");
		u3.setUserName("������");
		u3.setCall("15518813904");
		u3.setAccount(1000);
		users.put(u3.getCardId(),u3);
	}
	//����ʽ����ģʽ
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
	//�������п��Ż�ȡ��Ӧ�����˺ŵ���Ϣ
	public User getUser(String cardId) {
		User user = (User) users.get(cardId);
		return user;
	}
	//��ȡ�����˻�����Ϣ
	public HashMap getUsers() {
		return users;
	}

}
