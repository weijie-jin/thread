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
			System.out.println("ѡ��ʧ�ܣ��ÿγ��Ѿ�ѡ����");
			
		}else if(flag==0){
			System.out.println("***********************************************************");
			System.out.println("ѡ��ʧ�ܣ�û�иÿγ̣�");
			
		}else {
			
		    sc.getCourseNo().append(",");
		    sc.getCourseNo().append(courseno);
			sc.setCourseNo(sc.getCourseNo());
			System.out.println("***********************************************************");
			System.out.println("ѡ�γɹ���");
		}
		}
		
	}

	public void courseInfor(String studentNo) {
		SCDao scDao = SCDao.getInstance();
		SC sc = (SC)scDao.getEntity(studentNo);
		
		String[] courseNo = sc.getCourseNo().toString().split(",");
		System.out.println("***********************************************************");
		System.out.println("���ã�����ǰ��ѡ�˿γ�Ϊ��");
		for(int i=0;i<courseNo.length;i++) {
			Course course = (Course)CourseDao.getInstance().getEntity(courseNo[i]);
			System.out.println("�γ̺�Ϊ"+course.getCourseNo()
			+",�γ���Ϊ"+course.getCourseName()
			+",�γ�ѧ��Ϊ"+course.getCourseGrade());
		
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
			    System.out.println("��ѡ�ɹ���");
			    break;
			}
			
			
		}
		if(i==aa.length){
			System.out.println("***********************************************************");
			System.out.println("�Բ�����û��ѡ�ÿγ̣��޷���ѡ��");
		}
		MainUI.show();
	}
	

}
