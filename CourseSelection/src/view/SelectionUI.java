package view;

import java.util.Scanner;

import biz.CourseBiz;
import biz.SCBiz;

public class SelectionUI {
	public static void show() {
		
		CourseBiz c1 = new CourseBiz();
		System.out.println("--------��ӭ����ѡ�ν��棡-------");
		System.out.println("�γ��б�");
		c1.show1();
	
		System.out.println("��ѡ�������1--ѡ�Σ�  2--�˳�");
		Scanner scanner = new Scanner(System.in);
		String op = scanner.nextLine();
		while(op.equals("1")){
			System.out.println("������γ̺ţ�");
			String oo = scanner.nextLine();
			System.out.println("��������һ��������1--ѡ�Σ�  2--�˳�");
			//Scanner scanner = new Scanner(System.in);
			op = scanner.nextLine();
			
		}
		MainUI.show();

//		System.out.println("������γ̺ţ�");
//		Scanner str = new Scanner(System.in);
//		String courseno = str.nextLine();
//		SCBiz co1 = new SCBiz();
//		co1.show1(courseno);
//		
		
		
		
	}
}

