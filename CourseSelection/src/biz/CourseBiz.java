package biz;

import java.util.*;


import dao.*;
import entity.*;
import view.*;


public class CourseBiz {
	
	//public HashMap<String, IEntity> course;
	//显示课程信息
	public void show1(){
		CourseDao courseDao = CourseDao.getInstance();
		HashMap course = courseDao.getAllEntities();
		Set keySet = course.keySet();
		Iterator it = keySet.iterator();

		while(it.hasNext()){
			Object key = it.next();
			Object value = course.get(key);
			System.out.println(key + ":"+value);
		}
		

	}

}
