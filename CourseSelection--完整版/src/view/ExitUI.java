package view;

import java.util.Scanner;

import biz.SCBiz;

public class ExitUI {
	public static void show(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("***********************************************************");
		System.out.println("请输入学号");
		String studentNo = scanner.nextLine();
		System.out.println("***********************************************************");
		System.out.println("请输入你所要退选的课程号：");
		String courseNo = scanner.nextLine();
		SCBiz us = new SCBiz();
		us.exit(studentNo,courseNo);
	}

}
