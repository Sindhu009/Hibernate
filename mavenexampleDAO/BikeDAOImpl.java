package com.xworkz.mavenexampleDAO;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.mavenexampleDTO.BikeDTO;
import com.xworkz.sessionfoctory.SingleSessionFactory;

public abstract class BikeDAOImpl implements BikeDAO{

	public void BikeDB(BikeDTO bikeDTO) {
		System.out.println("invoking the savebikedata");
		Session session=null;
		try {
			SessionFactory singleFactory = SingleSessionFactory.getSessionFactory();
			session = singleFactory.openSession();
			session.beginTransaction();
			session.save(bikeDTO);
			session.getTransaction().commit();
			System.out.println("saved BikeDTO");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
		}
	}

	

}
