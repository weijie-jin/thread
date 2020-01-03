package view;

import java.util.Scanner;

import biz.SCBiz;

public class CourseInforUI {
	public static void show(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("***********************************************************");
		System.out.println("«Î ‰»Î—ß∫≈");
		String studentNo = scanner.nextLine();
		
		SCBiz us = new SCBiz();
		us.courseInfor(studentNo);
	}

}
