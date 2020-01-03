package dao;

import entity.IEntity;
import entity.SC;
import entity.Student;

import java.util.HashMap;

public class SCDao implements IDao {
	private static SCDao instance;
	private HashMap<String,IEntity> scs=new HashMap<String,IEntity>();
	private SC sc= new SC();
	
    
	
	public static SCDao getInstance() {
		if(instance == null) {
			synchronized(SCDao.class) {
				if(instance == null) {
					instance = new SCDao();
					return instance;
				}
			}
		}
		return instance;
	}

	@Override
	public void insert(IEntity entity) {
		SC sc = (SC)entity;
		scs.put(sc.getStudentNo(), sc);

	}

	@Override
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
		return scs;
	}

	@Override
	public IEntity getEntity(String Id) {
		// TODO Auto-generated method stub
		return scs.get(Id);
	}


	

}
