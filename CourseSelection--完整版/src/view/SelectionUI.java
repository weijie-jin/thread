package view;

import java.util.Scanner;

import biz.CourseBiz;
import biz.SCBiz;

public class SelectionUI {
	public static void show() {
		
		CourseBiz c1 = new CourseBiz();
		SCBiz scb = new SCBiz();
		System.out.println("***********************************************************");
		System.out.println("----------------------��ӭ����ѡ��ϵͳ��--------------------");
		System.out.println("ȫ���γ���Ϣ��");
		c1.show1();
	
		System.out.println("��ѡ�������1--ѡ�Σ�  2--�˳�");
		Scanner scanner = new Scanner(System.in);
		String op = scanner.nextLine();
		while(op.equals("1")){
			System.out.println("������ѧ�ţ�");
			String studentno = scanner.nextLine();
			System.out.println("������γ̺ţ�");
			String courseno = scanner.nextLine();
			
			scb.select(studentno,courseno);
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

