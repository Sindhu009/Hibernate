package com.xworkz.userdao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.sessionfoctory.SingleSessionFactory;
import com.xworkz.userdto.Userdto;

public class UserImpldao{
	private static final Object ClothsFashionDTO = null;

	//@Override
	public void insertuser(Userdto Userdto) {
		System.out.println("invoked insert userdao");
		Session session=null;
		try {
			SessionFactory sessionfactory=SingleSessionFactory.getSessionFactory();
			session=sessionfactory.openSession();
			session.beginTransaction();
			session.persist(Userdto);
			session.getTransaction().commit();
			System.out.println("user is saved");
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			if(session!=null) {
				session.close();
				System.out.println("session is closed");
				
			}else {
				System.out.println("session is  not closed");

				
			}
		}
		
	}


}
