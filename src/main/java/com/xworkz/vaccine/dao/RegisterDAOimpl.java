package com.xworkz.vaccine.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class RegisterDAOimpl implements RegisterDAO{


	@Autowired
	private SessionFactory sessionFactory;
	
	public RegisterDAOimpl() {
		super();
		System.out.println(this.getClass().getSimpleName()+"Bean Created");
	}
	
	public boolean saveregisterDTO(Object entity) {
		Session session=null;
		
		try {
			session=  sessionFactory.openSession();
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
			System.out.println("entity saved");
			return true;
		}catch(HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			if(session!=null) {
				session.close();
				System.out.println("session closed");
			}else {
				System.out.println("session not closed");
			}
		}
		return false;
	}

}
