package view;

import java.util.Scanner;

import biz.StudentBiz;

public class ModifyPasswordUI {
	public static void show() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ�ţ�");
		String studentNo = scanner.nextLine();
		System.out.println("���������룺");
		String oldPassword = scanner.nextLine();
		System.out.println("�����������룺");
		String newPassword = scanner.nextLine();
		System.out.println("��ȷ�������룺");
		String new1Password = scanner.nextLine();
		StudentBiz sc = new StudentBiz();
		sc.modifypassword(studentNo,oldPassword,newPassword, new1Password);
		

	}
}
