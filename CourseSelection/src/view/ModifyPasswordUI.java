package view;

import java.util.Scanner;

import biz.StudentBiz;

public class ModifyPasswordUI {
	public static void show() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学号：");
		String studentNo = scanner.nextLine();
		System.out.println("请输入密码：");
		String oldPassword = scanner.nextLine();
		System.out.println("请输入新密码：");
		String newPassword = scanner.nextLine();
		System.out.println("请确认新密码：");
		String new1Password = scanner.nextLine();
		StudentBiz sc = new StudentBiz();
		sc.modifypassword(studentNo,oldPassword,newPassword, new1Password);
		

	}
}
