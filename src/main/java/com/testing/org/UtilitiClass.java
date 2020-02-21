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
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilitiClass {

	public   Map<String, Object> exceldata(){

		File file=new File("resource/Book1.xlsx");
		FileInputStream fis = null;
		XSSFWorkbook xcel = null;
		Map<String, Object> customer = null;
		try {
			fis = new FileInputStream(file);


			xcel= new XSSFWorkbook(fis);

			XSSFSheet sht =xcel.getSheet("Sheet1");


			int noOfColumns = sht.getRow(0).getLastCellNum();
			//int noOfRow =sht.getPhysicalNumberOfRows();
			//int noOfCell = sht.getRow(0).getLastCellNum();
			//System.out.println(noOfColumns);
			//System.out.println(noOfRow);
			customer=new HashMap<String, Object>();
			System.out.println(sht.getPhysicalNumberOfRows());

			//System.out.println(sht.getRow(0).getCell(0).getStringCellValue());

			//DataFormatter formatter = new DataFormatter();   
			for(int i=0; i<sht.getPhysicalNumberOfRows()-1; i++){

				for(int j=0; j<noOfColumns; j++){

					try{
						//System.out.println(i);
						//System.out.println(j);
						//System.out.println(sht.getRow(i).getCell(j).getCellType());

						String header=sht.getRow(i).getCell(j).getStringCellValue();
						/*if (CellType.STRING.equals(sht.getRow(i+1).getCell(j).getCellType())) {

							customer.put(header,sht.getRow(i+1).getCell(j).getStringCellValue());

						}

						else{
							
							//new DataFormatter().formatCellValue(sht.getRow(i+1).getCell(j)).getNumericCellValue());
							System.out.println(new DataFormatter().formatCellValue(sht.getRow(i+1).getCell(j)));
							customer.put(header,sht.getRow(i+1).getCell(j).getNumericCellValue());
							//Integer.parseInt(customer.get(header));

						}*/
						//System.out.println(customer[j]=sht.getRow(i).getCell(j).getStringCellValue());
						customer.put(header,new DataFormatter().formatCellValue(sht.getRow(i+1).getCell(j)));

					}
					catch(Exception e){
						System.out.println("NUll Data");



					}




				}
			}

			//System.out.println(customer);




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
		return customer;
		
		//return customer;
	}

}
