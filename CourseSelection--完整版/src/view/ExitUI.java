package view;

import java.util.Scanner;

import biz.SCBiz;

public class ExitUI {
	public static void show(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("***********************************************************");
		System.out.println("������ѧ��");
		String studentNo = scanner.nextLine();
		System.out.println("***********************************************************");
		System.out.println("����������Ҫ��ѡ�Ŀγ̺ţ�");
		String courseNo = scanner.nextLine();
		SCBiz us = new SCBiz();
		us.exit(studentNo,courseNo);
	}

}
