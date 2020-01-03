package dao;
import entity.Course;
import entity.IEntity;
import entity.Student;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class CourseDao implements IDao {
	
	private static CourseDao instance;
	private HashMap<String,IEntity> courses;
	private Course course;
	private CourseDao() {
		courses = new HashMap<String,IEntity>();
		
		Course cou1 = new Course();
		cou1.setCourseNo("1003");
		cou1.setCourseName("C语言");
		cou1.setCourseGrade("3.0");
		courses.put(cou1.getCourseNo(), cou1);
		
		Course cou2 = new Course();
		cou2.setCourseNo("1002");
		cou2.setCourseName("大学英语");
		cou2.setCourseGrade("2.0");
		courses.put(cou2.getCourseNo(), cou2);
		
		Course cou3 = new Course();
		cou3.setCourseNo("1001");
		cou3.setCourseName("高数");
		cou3.setCourseGrade("5.0");
		courses.put(cou3.getCourseNo(), cou3);
		
		
	}
	
	public static CourseDao getInstance() {
		if(instance == null) {
			synchronized(CourseDao.class) {
				if(instance == null) {
					instance = new CourseDao();
					return instance;
				}
			}
		}
		return instance;
	}
	
//	private static CourseDao instance;
//	private HashMap<String, Course> courses = new HashMap<String,Course>();//可能需要该
//	//private Course course;
//	
//	private CourseDao(){
//		getCourseFromInputStream("D:\\course.txt");
//	}
//	
//	public void processCourseString(String courseString) {
//		String [] courseFields = courseString.split(",");
//		Course u = new Course();
//		u.setCourseNo(courseFields[0]);
//		u.setCourseName(courseFields[1]);
//		u.setCourseGrade(courseFields[2]);
//		//u.setCall(courseFields[3]);
//		//u.setAccount(Integer.parseInt(courseFields[4]));
//		courses.put(u.getCourseNo(), u);	
//	}
//	
//	//读取文件，以InputStream的形式读数
//	private void getCourseFromInputStream(String isName) {
//		try {
//			FileInputStream fs = new FileInputStream(isName);
//			byte[] content=new byte[1024];
//			int i=0;
//			int conInteger=0;
//			while(true) {
//				try {
//					conInteger=fs.read();
//				} catch(IOException e) {
//					e.printStackTrace();
//				}
//				if(-1==conInteger) {
//					break;
//				}else if('\r'==(char)conInteger||'\n'==(char)conInteger) {
//					try {
//						this.processCourseString(new String(content,"GBK").trim());
//						i=0;
//					} catch(UnsupportedEncodingException e) {
//						e.printStackTrace();
//					}
//					continue;
//				}else {
//					content[i]=(byte)conInteger;
//					i++;
//				}
//			}
//			fs.close();
//		} catch(Exception e) {
//			
//		}
//	}
//	//懒汉式单例模式
//	public static CourseDao getInstance() {
//		if(instance == null) {
//			synchronized(CourseDao.class) {
//				if(instance == null) {
//					instance = new CourseDao();
//					return instance;
//				}
//			}
//		}
//		return instance;
//	}
    
	
	@Override
	public void insert(IEntity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}
//    //存盘操作
//	@Override
//	public void update() {
//		// TODO Auto-generated method stub
//		Set<String> courseSet = courses.keySet();
//		StringBuffer uStringBuffer = new StringBuffer();
//		for(String cardId:courseSet) {
//			Course u = (Course)courses.get(cardId);
//			String uString = u.getCourseNo() + ","+u.getCourseName() + ","
//					        //+ u.getUserName() + "," +u.getcall() + ","
//					        + u.getCourseGrade() + "\r\n";
//			uStringBuffer.append(uString);
//		}
//		putCourseToFile(uStringBuffer.toString(),"D:\\user.txt");
//		
//	}

	@Override
	public HashMap<String, entity.IEntity> getAllEntities() {
		// TODO Auto-generated method stub
		return courses;
	}

	@Override
	public IEntity getEntity(String Id) {
		// TODO Auto-generated method stub
		return courses.get(Id);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
    
//	//写入文件的函数
//	private void putCourseToFile(String uString, String osName) {
//		// TODO Auto-generated method stub
//		
//             try {
//				FileOutputStream fos = new FileOutputStream(osName);
//				try {
//					fos.write(uString.getBytes("GBK"));
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				try {
//					fos.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();				}
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//             
//			
//	}
}