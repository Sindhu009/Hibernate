package com.xworkz.collegeTester;
import com.xworkz.college.dao.CollegeDAO;

import com.xworkz.college.dao.CollegeDAOImpl;
import com.xworkz.college.dto.CollegeDTO;

public class CollegeTester {
public static void main(String[] args) {
		
		CollegeDTO collegeDTO = new CollegeDTO(2,"saptagiri","chikkabanavara",1700,150,9);
		CollegeDAO collegeDaoImpl =new CollegeDAOImpl();
		collegeDaoImpl.saveCollege(collegeDTO);
		//collegeDaoImpl.fetchCollege(2);
	}

}
