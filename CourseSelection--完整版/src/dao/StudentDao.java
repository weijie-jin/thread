package dao;
import entity.IEntity;
import entity.Student;

import java.util.HashMap;

public  class StudentDao implements IDao {

	private static StudentDao instance;
	private HashMap<String, Student> students;
	
	
	private StudentDao() {
		students = new HashMap<String, Student>();
		Student student = new Student();
//		
		student.setStudentNo("184805032");
		student.setStudentName("Ñî°Ä²ı");
		student.setStudentGender("ÄĞ");
		student.setStudentPassword("123456");
		student.setStudentAge(20);
		student.setStudentDepartment("Èí¼şÑ§Ôº");
		students.put(student.getStudentNo(), student);
	}
	public static StudentDao getInstance() {
		if(instance == null) {
			synchronized(StudentDao.class) {
				if(instance == null) {
					instance = new StudentDao();
					return instance;
				}
			}
		}
		return instance;
	}
	@Override
	public void insert(IEntity entity) {
		// TODO Auto-generated method stub
		Student st = (Student)entity;
		students.put(st.getStudentNo(), st);
	}

	public void delete() {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public HashMap<String, IEntity> getAllEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEntity getEntity(String Id) {
		// TODO Auto-generated method stub		
		return students.get(Id);
	}

}
