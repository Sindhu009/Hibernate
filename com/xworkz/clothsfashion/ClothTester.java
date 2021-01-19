package com.xworkz.clothsfashion;
import com.xworkz.clothsfashion.dao.ClothsFashionDAO;
import com.xworkz.clothsfashion.dao.ClothsFashionImpl;
import com.xworkz.clothsfashion.dto.ClothsFashionDTO;


public class ClothTester {
	public static void main(String args[]) {
		ClothsFashionDTO clothsfashionDTO=new ClothsFashionDTO("cotton","black",false, 789.99,'S');
		ClothsFashionDAO daoImpl =new ClothsFashionImpl();
		daoImpl.insertCloth(clothsfashionDTO);
	}

}
