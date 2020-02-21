package com.testing.org;

import java.util.Map;

public class TestExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UtilitiClass ref = new UtilitiClass();
		Map<String, Object> customer = ref.exceldata();
		System.out.println("================"+customer);
		System.out.println("================"+customer.get("Mobile1"));
		//double dnum =(double) customer.get("Mobile1");
		////int  str= (int) dnum;
		
		//System.out.println("================"+str);
		//Double.toString

	}

}
