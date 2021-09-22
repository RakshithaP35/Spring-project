package com.xworkz.spring.apartment.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.apartment.entity.ApartmentEntity;

@Component
public class ApartmentDAOimpl implements ApartmentDAO {

	@Autowired
	private static SessionFactory factory;

	public ApartmentDAOimpl(SessionFactory factory) {

		this.factory = factory;
		System.out.println(this.getClass().getSimpleName() + "bean created");
	}

	@Override
	public void save(ApartmentEntity entity) {
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();

		} catch (HibernateException e) {
			session.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
