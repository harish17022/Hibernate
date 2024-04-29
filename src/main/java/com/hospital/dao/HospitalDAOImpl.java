package com.hospital.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hospital.entity.HospitalEntity;

public class HospitalDAOImpl implements HospitalDAO{
	int id;
	String name;
	int age;
	String disease;
	int bill;
	SessionFactory sessionFactory = null;
	Session session = null;
	
	public void getAll() {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(HospitalEntity.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from HospitalEntity");
		List list = query.getResultList();
		for(Object e : list) {
			System.out.println(e);
		}
		
		
	}
	
	@Override
	public void deleteByID(int id) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(HospitalEntity.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		HospitalEntity e = session.get(HospitalEntity.class, id);
		System.out.println(e);
		session.delete(e);
		session.getTransaction().commit();
		
		
	}
	@Override
	public void save(HospitalEntity entity) {
		try {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			config.addAnnotatedClass(HospitalEntity.class);
			sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
		}
		finally {
			if(sessionFactory != null) {
				sessionFactory.close();
			}
			if(session != null) {
				session.close();
			}
		}
		
	}
	@Override
	public void updateByIDDiseaseName(int id, String Diseasename) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(HospitalEntity.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		HospitalEntity e = session.get(HospitalEntity.class, id);
		e.setPatientDisease(Diseasename);
		session.update(e);
		session.getTransaction().commit();
		
	}
	@Override
	public void updateByIDBill(int id, int Bill) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(HospitalEntity.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		HospitalEntity e = session.get(HospitalEntity.class, id);
		e.setPatientBill(Bill);
		session.update(e);
		session.getTransaction().commit();
		
	}
	@Override
	public void updateByIDage(int id, int age) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(HospitalEntity.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		HospitalEntity e = session.get(HospitalEntity.class, id);
		e.setPatientAge(age);
		session.update(e);
		session.getTransaction().commit();
		
	}
	@Override
	public void updateByIDName(int id, String name) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(HospitalEntity.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		HospitalEntity e = session.get(HospitalEntity.class, id);
		e.setPatientName(name);
		session.update(e);
		session.getTransaction().commit();
		
	}
	@Override
	public void getData(int id) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(HospitalEntity.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		HospitalEntity entity = session.get(HospitalEntity.class, id);
		System.out.println(entity);
	}
}
