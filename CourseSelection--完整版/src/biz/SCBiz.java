package biz;


import java.util.Iterator;
import java.util.Set;

import dao.*;

import entity.*;
import view.MainUI;

public class SCBiz {
	public void select(String studentno,String courseno) {
		SCDao sc1 = SCDao.getInstance();		
		SC sc = (SC)sc1.getEntity(studentno);
		CourseDao courseDao = (CourseDao)CourseDao.getInstance();
		Set keySet = (courseDao.getAllEntities()).keySet();
		Iterator it = keySet.iterator();
		int flag=0;
		if(sc==null) {
			SC oo = new SC();
			oo.setStudentNo(studentno);
			StringBuffer s = new StringBuffer();
			s.append(courseno);
			oo.setCourseNo(s);
			oo.setGrade(courseno);
			sc1.insert(oo);
		}
		else {
			while(it.hasNext()) {
			if(it.next().equals(courseno)) flag=1;
			if(flag==1) {
				SCDao scDao = (SCDao)SCDao.getInstance();
				sc  = (SC)scDao.getEntity(studentno);
				String[] scc = (sc.getCourseNo()).toString().split(",");
				for(int i =0;i<scc.length;i++) {
					if(scc[i].equals(courseno))
						flag = 2;
				}
			}
		}
		if(flag==2){
			System.out.println("***********************************************************");
			System.out.println("选课失败，该课程已经选过！");
			
		}else if(flag==0){
			System.out.println("***********************************************************");
			System.out.println("选课失败，没有该课程！");
			
		}else {
			
		    sc.getCourseNo().append(",");
		    sc.getCourseNo().append(courseno);
			sc.setCourseNo(sc.getCourseNo());
			System.out.println("***********************************************************");
			System.out.println("选课成功！");
		}
		}
		
	}

	public void courseInfor(String studentNo) {
		SCDao scDao = SCDao.getInstance();
		SC sc = (SC)scDao.getEntity(studentNo);
		
		String[] courseNo = sc.getCourseNo().toString().split(",");
		System.out.println("***********************************************************");
		System.out.println("您好，您当前已选了课程为：");
		for(int i=0;i<courseNo.length;i++) {
			Course course = (Course)CourseDao.getInstance().getEntity(courseNo[i]);
			System.out.println("课程号为"+course.getCourseNo()
			+",课程名为"+course.getCourseName()
			+",课程学分为"+course.getCourseGrade());
		
		}
		MainUI.show();
	 }

	public void exit(String studentNo, String courseNo) {
		SCDao scDao = SCDao.getInstance();
		SC sc = (SC)scDao.getEntity(studentNo);
		
	    StringBuffer s = new StringBuffer();
		String[] aa = sc.getCourseNo().toString().split(",");
		int i = 0;
		
		for( i=0;i<aa.length;i++){
			if(aa[i].equals(courseNo)){
          		for(int j=0;j<aa.length;j++) {
          			if(aa[j].equals(courseNo)) continue;
          			s.append(aa[j]);
          		}
			    
			    sc.setCourseNo(s);
			    System.out.println("***********************************************************");
			    System.out.println("退选成功！");
			    break;
			}
			
			
		}
		if(i==aa.length){
			System.out.println("***********************************************************");
			System.out.println("对不起，你没有选该课程，无法退选！");
		}
		MainUI.show();
	}
	

}
