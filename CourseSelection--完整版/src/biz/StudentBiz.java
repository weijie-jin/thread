package biz;

import dao.StudentDao;
import entity.IEntity;
import entity.Student;
import view.MainUI;

public class StudentBiz {
	StudentDao studentDao;
	private Student student;
	//��¼
	public void login(String studentNo, String studentPassword) {

		studentDao = StudentDao.getInstance();
		student = (Student) studentDao.getEntity(studentNo);
		if (student == null) {
			System.out.println("***********************************************************");
			System.out.println("�û������ڣ�");
			return;
		} else if (student.getStudentPassword().equals(studentPassword)) {
			System.out.println("***********************************************************");
			System.out.println("��¼�ɹ���");
			MainUI.show();
		} else {
			System.out.println("***********************************************************");
			System.out.println("���벻��ȷ��");
			MainUI.show();
		}

	}
	//ע�ᣬҵ���߼�ʵ��
	public void register(String studentNo, 
						String studentName, 
						String studentGender, 
						int studentAge, 
						String studentDepartment, 
						String firstPassword, 
						String secondPassword) {
		if(firstPassword.equals(secondPassword)) {
			student = new Student();
			student.setStudentNo(studentNo);
			student.setStudentName(studentName);
			student.setStudentAge(studentAge);
			student.setStudentDepartment(studentDepartment);
			student.setStudentPassword(firstPassword);
			studentDao = StudentDao.getInstance();
			studentDao.insert(student);
			System.out.println("***********************************************************");
			System.out.println("ע��ɹ���");
			MainUI.show();
		}
	}
	
	//�޸�����   
	public void modifypassword(String studentNo,String oldPassword,String newPassword,String new1Passwoord){
		studentDao = StudentDao.getInstance();
		student = (Student) studentDao.getEntity(studentNo);
			 if(newPassword.equals(new1Passwoord)){
				 student.setStudentPassword(newPassword); 
				 System.out.println("***********************************************************");
				 System.out.println("�����޸ĳɹ���");
			     MainUI.show();
		     }else{
		    	 System.out.println("***********************************************************");
			    System.out.println("�����޸�ʧ��!");
			    MainUI.show();
		     }
	    }
		 

}
