package com.xworkz.collegeTester;
import com.xworkz.college.dao.CollegeDAO;

import com.xworkz.college.dao.CollegeDAOImpl;
import com.xworkz.college.dto.CollegeDTO;

public class CollegeTester {
public static void main(String[] args) {
		
		
		CollegeDTO collegeDTO = new CollegeDTO();
		
		CollegeDAO collegeDaoImpl =new CollegeDAOImpl();
		
		collegeDaoImpl.fetchAllCollege();		//collegeDaoImpl.fetchCollege(2);
	}

}
