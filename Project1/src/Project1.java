
public class Project1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String  st = new String("184805009 ����ѩ Ů;184805013 ������ Ů;184805029 ��� Ů;184805000 ���� ��");
        
		System.out.println("�ָ����ַ��������е�Ԫ�������ǣ�");
		String[] stArray = st.split(";");
		for(int i=0;i<stArray.length;i++) {
			System.out.println(stArray[i]+",");

		}
		
		System.out.println("�ָ����ַ��������е�Ԫ�������ǣ�");
		String[] stArray1 = st.split(" ");
		for(int i=0;i<stArray1.length;i++) {
			System.out.println(stArray1[i]+",");

		}
		//�ж������Ƿ�������
		for(int i=0;i<stArray1.length;i++) {
			if(stArray1[i].equals("����")) {
				System.out.println("����������");
				break;
			}else if(i == stArray1.length-1) {
				System.out.println("���ֲ�������");
			}
		}
		
		//�ж��Ƿ���1848��ͷ
		System.out.println("�ж��Ƿ���1848��ͷ��");
		for(int i=0;i<stArray.length;i++) {
			if(stArray[i].startsWith("1848")) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		StringBuffer sb = new StringBuffer("184805009 ����ѩ Ů;184805013 ������ Ů;184805029 ��� Ů;184805000 ���� ��");
		
		sb.append(";184805111 ���ζ� ��");
		System.out.println("append��ӽ����"+sb);
		sb.delete(1,17);
		System.out.println("ɾ��ָ��λ�ý����"+sb);
		sb.setCharAt(0, '2');
		System.out.println("�޸�ָ��λ���ַ��Ľ����"+sb);
		
	}

}
