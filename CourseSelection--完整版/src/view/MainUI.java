package view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import dao.CourseDao;

public class MainUI {
	public static Object user;

	public static void show(){
		System.out.println("***********************************************************");
		System.out.println("1-ע�᣻2-�޸����룻3-ѡ�Σ�4-��¼��5-ѡ����Ϣ��6-��ѡ��0-�˳�");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		switch (option) {
		case "1":
			RegisterUI.show();
			break;
		case "2":
			ModifyPasswordUI.show();
			break;
		case "3":
			SelectionUI.show();
			break;
		case "4":
			LoginUI.show();
			break;
		case "5":
			CourseInforUI.show();
			break;
		case "6":
			ExitUI.show();
			break;
		case "0":
			System.out.println("***********************************************************");
			System.out.println("�����˳�����ӭ�´ε�¼��");
			break;
		}
	}
}
