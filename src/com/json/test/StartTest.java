package com.json.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.json.bean.EmpBean;
import com.json.service.Service;

public class StartTest {

	public static void main(String[] args) throws ParseException {
		EmpBean emp;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 emp= new EmpBean("Modi", 66, "modi@.co.in",sdf.parse("17/09/1951") );
		 emp= new EmpBean("Modi", 66, "modi@.co.in",sdf.parse("17/09/1951") );
		 emp= new EmpBean("Modi", 66, "modi@.co.in",sdf.parse("17/09/1951") );
		 emp= new EmpBean("Sachin",42,"sachin@com", sdf.parse("24/04/1973"),"Mumbai");
		Service ser= new Service();
		ser.adddetails(emp);
		
		//----------------------------------------------------------------------
		
		
		
		
	
	}
}
