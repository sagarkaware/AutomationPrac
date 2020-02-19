package com.testing.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilitiClass {
	
	public void excelData(){
		
		File file=new File("resource/Book1.xlsx");
		FileInputStream fis = null;
		XSSFWorkbook xcel = null;
		try {
		fis = new FileInputStream(file);
		
		
		xcel= new XSSFWorkbook(fis);
		
		XSSFSheet sht =xcel.getSheet("Sheet1");
		
		
		int noOfColumns = sht.getRow(0).getLastCellNum();
		//int noOfRow =sht.getPhysicalNumberOfRows();
		//int noOfCell = sht.getRow(0).getLastCellNum();
		System.out.println(noOfColumns);
		//System.out.println(noOfRow);
		Map<String, Object> customer=new HashMap<String, Object>();

		
		//System.out.println(sht.getRow(0).getCell(0).getStringCellValue());
		 
		//DataFormatter formatter = new DataFormatter();   
		for(int i=0; i<=0; i++){
			
			for(int j=0; j<noOfColumns; j++){
				
				try{
					System.out.println(i);
					System.out.println(j);
					System.out.println(sht.getRow(i).getCell(j).getCellType());
					
					String header=sht.getRow(i).getCell(j).getStringCellValue();
					if (CellType.STRING.equals(sht.getRow(i+1).getCell(j).getCellType())) {
						
						customer.put(header,sht.getRow(i+1).getCell(j).getStringCellValue());
						
					}
							
					else{
						
						customer.put(header,sht.getRow(i+1).getCell(j).getNumericCellValue());
						
					}
					    //System.out.println(customer[j]=sht.getRow(i).getCell(j).getStringCellValue());
					   
					
				}
				catch(Exception e){
					System.out.println("NUll Data");
					
					
									
				}
				
				
				
				
			}
		}
		
		System.out.println(customer);
		
		
		/*for (int i = 0; i < customer.size(); i++) {
			
			if (!customer.isEmpty()) {
				System.out.println("-----------"+customer.get(i));
			}
			
			
			
		}*/
		
		
		//Integer user=(int) sht.getRow(0).getCell(3).getNumericCellValue();		
		//String lastname= sht.getRow(0).getCell(1).getStringCellValue();

		//System.out.println(user);
		//System.out.println(lastname);
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				xcel.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
