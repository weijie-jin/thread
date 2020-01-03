package entity;

import java.util.*;

public class SC implements IEntity {
	private String studentNo;
	private StringBuffer courseNo;
	private String grade;
	//private Object courseNoGrade;
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public StringBuffer getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(StringBuffer courseNo) {
		this.courseNo = courseNo;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	
	
}
