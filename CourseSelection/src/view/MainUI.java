package view;

import java.util.Scanner;

public class MainUI {
	public static void show() {
		System.out.println("1-注册；2-修改密码；3-选课；4-登录；5-选课信息；6-退选；0-退出");
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
		}
	}
}
