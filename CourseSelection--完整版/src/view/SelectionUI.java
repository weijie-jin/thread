package view;

import java.util.Scanner;

import biz.CourseBiz;
import biz.SCBiz;

public class SelectionUI {
	public static void show() {
		
		CourseBiz c1 = new CourseBiz();
		SCBiz scb = new SCBiz();
		System.out.println("***********************************************************");
		System.out.println("----------------------欢迎进入选课系统！--------------------");
		System.out.println("全部课程信息：");
		c1.show1();
	
		System.out.println("请选择操作：1--选课，  2--退出");
		Scanner scanner = new Scanner(System.in);
		String op = scanner.nextLine();
		while(op.equals("1")){
			System.out.println("请输入学号：");
			String studentno = scanner.nextLine();
			System.out.println("请输入课程号：");
			String courseno = scanner.nextLine();
			
			scb.select(studentno,courseno);
			System.out.println("请输入下一步操作：1--选课，  2--退出");
			//Scanner scanner = new Scanner(System.in);
			op = scanner.nextLine();
			
		}
		MainUI.show();

//		System.out.println("请输入课程号：");
//		Scanner str = new Scanner(System.in);
//		String courseno = str.nextLine();
//		SCBiz co1 = new SCBiz();
//		co1.show1(courseno);
//		
		
		
		
	}
}

