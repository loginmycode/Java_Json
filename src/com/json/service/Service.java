package com.json.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.json.bean.Constont;
import com.json.bean.EmpBean;

public class Service {

	public void adddetails(EmpBean emp)
	{
		BufferedWriter bw= null;
		FileWriter  fr=null;
		
		String line;
		
		try
		{
			/*
			 * bw= new BufferedWriter(new FileWriter(Constont.PATH+".todo",true));
			 * 
			 * bw.write(emp.getName()+" : "+emp.getAge()+" : "+emp.getEmail()+" : "+emp.
			 * getDob()); bw.newLine();
			 */
			
			System.out.println("Hello whs");
			Gson gson = new Gson();

			 fr= new FileWriter(Constont.PATH+"a.json");

			// 1. Java object to JSON file
			gson.toJson(emp,fr);
			
			

			// 2. Java object to JSON string
			String jsonInString = gson.toJson(emp);
			System.out.println("Success---------jsonInString"+jsonInString);
			
			
			
			  bw= new BufferedWriter(new FileWriter(Constont.PATH+"b.json",true));
			  
			  bw.write(jsonInString);
			  bw.newLine();
			  
			  System.out.println("done");
			 
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			
			if(fr!=null)
			{
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(bw!=null)
			{
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
