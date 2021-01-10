package com.xworkz.collegeTester;
import com.xworkz.college.dao.CollegeDAO;

import com.xworkz.college.dao.CollegeDAOImpl;
import com.xworkz.college.dto.CollegeDTO;

public class CollegeTester {
public static void main(String[] args) {
		
		CollegeDTO collegeDTO = new CollegeDTO(1,"skit","chikkabanavara",1500,100,6);
		CollegeDAO collegeDaoImpl =new CollegeDAOImpl();
		collegeDaoImpl.saveCollege(collegeDTO);
		//collegeDaoImpl.fetchCollege(2);
	}

}
