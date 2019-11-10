
public class Project1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String  st = new String("184805009 郭佳雪 女;184805013 金卫洁 女;184805029 王楠 女;184805000 李现 男");
        
		System.out.println("分割后的字符串数组中的元素依次是：");
		String[] stArray = st.split(";");
		for(int i=0;i<stArray.length;i++) {
			System.out.println(stArray[i]+",");

		}
		
		System.out.println("分割后的字符串数组中的元素依次是：");
		String[] stArray1 = st.split(" ");
		for(int i=0;i<stArray1.length;i++) {
			System.out.println(stArray1[i]+",");

		}
		//判断李现是否在里面
		for(int i=0;i<stArray1.length;i++) {
			if(stArray1[i].equals("李现")) {
				System.out.println("李现在里面");
				break;
			}else if(i == stArray1.length-1) {
				System.out.println("李现不在里面");
			}
		}
		
		//判断是否以1848开头
		System.out.println("判断是否以1848开头：");
		for(int i=0;i<stArray.length;i++) {
			if(stArray[i].startsWith("1848")) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		StringBuffer sb = new StringBuffer("184805009 郭佳雪 女;184805013 金卫洁 女;184805029 王楠 女;184805000 李现 男");
		
		sb.append(";184805111 王嘉尔 男");
		System.out.println("append添加结果："+sb);
		sb.delete(1,17);
		System.out.println("删除指定位置结果："+sb);
		sb.setCharAt(0, '2');
		System.out.println("修改指定位置字符的结果："+sb);
		
	}

}
