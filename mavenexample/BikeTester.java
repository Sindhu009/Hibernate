package com.xworkz.mavenexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

import com.mysql.cj.result.Row;
import com.xworkz.mavenexampleDAO.BikeDAO;
import com.xworkz.mavenexampleDAO.BikeDAOImpl;
import com.xworkz.mavenexampleDTO.BikeDTO;


public class BikeTester {
	public static void main(String[] args) throws IOException {
		FileInputStream file =new FileInputStream(new File("C:\\Users\\Hp\\Documents")); 
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0) ;
		Row row;
				for(int i=1;i<=sheet.getLastRowNum();i++) {
			row = (Row)sheet.getRow(i);
			
						
			
			
			

			int BIKE_ID;
				if(row.getCell(0)==null) 
				{
					BIKE_ID =0;
				}
				else  BIKE_ID=row.getCell(0).toString();

			String B_NAME;
			if(row.getCell(1)==null)
			{	
				B_NAME = "null";
			}
			else B_NAME=row.getCell(1).toString();

			int B_COST;
			if(row.getCell(2)==null) { 
				B_COST = 0 ;
				}
			else B_COST=row.getCell(2).toString();

			String  B_COLOR;
			if(row.getCell(3)==null) {B_COLOR="null";}
			else B_COLOR=row.getCell(3).toString();

			boolean IS_CLUCH;
			if(row.getCell(4)==null) {IS_CLUCH=false; } 
			else IS_CLUCH=row.getCell(4).toString();
			
			
			
			
			BikeDTO bikeDTO=new BikeDTO();
			
			//BikeDTO bikeDTO=new BikeDTO();
			bikeDTO.setB_NAME(B_NAME);
			bikeDTO.setB_COST(B_COST);
			bikeDTO.setB_COLOR(B_COLOR);
			bikeDTO.setB_CLUCH(IS_CLUCH);
			BikeDAO daoImpl=new BikeDAOImpl();
			daoImpl.saveBikeDB(bikeDTO);	
				
			

		}
		file.close();

}

}
