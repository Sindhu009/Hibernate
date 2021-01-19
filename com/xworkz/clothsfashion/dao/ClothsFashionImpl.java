package com.xworkz.clothsfashion.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.clothsfashion.dto.ClothsFashionDTO;
import com.xworkz.sessionfoctory.SingleSessionFactory;

public class ClothsFashionImpl implements ClothsFashionDAO{

	private static final Object ClothsFashionDTO = null;

	@Override
	public void insertCloth(ClothsFashionDTO clothfashionDTO) {
		System.out.println("invoked insert ClothFashion");
		Session session=null;
		try {
			SessionFactory sessionfactory=SingleSessionFactory.getSessionFactory();
			session=sessionfactory.openSession();
			session.beginTransaction();
			session.persist(ClothsFashionDTO);
			session.getTransaction().commit();
			System.out.println("ClothsFashion is saved");
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
