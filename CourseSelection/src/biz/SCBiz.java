package biz;

import dao.CourseDao;
import dao.StudentDao;
import entity.Course;
import entity.Student;

public class SCBiz {
	CourseDao courseDao;
	private Course course;
	public void show1(String courseno) {
		// TODO Auto-generated method stub
		CourseDao courseDao = CourseDao.getInstance();
		Course course = (Course) courseDao.getEntity(courseno);
		if(courseno.isEmpty()){
			System.out.println("选课成功！");
		}
		else{
			System.out.println("选课失败！");
		}
	}
	

}
