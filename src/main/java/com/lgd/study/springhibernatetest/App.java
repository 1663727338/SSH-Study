package com.lgd.study.springhibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static SessionFactory sessionFactory;

	public static void main(String[] args) {
		
		//加载bean
		new ClassPathXmlApplicationContext("beans.xml");
		
		//session
		Session session = sessionFactory.openSession();		
		User user = new User();
		user.setName("lgd");
		user.setAge(22);
		session.save(user);
		
		System.out.println("AppMain is done.");
		
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void setSessionFactory(SessionFactory sessionFactory) {
		App.sessionFactory = sessionFactory;
	}
}
