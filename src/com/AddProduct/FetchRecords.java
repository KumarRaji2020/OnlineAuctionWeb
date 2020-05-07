package com.AddProduct;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class FetchRecords  {

		ArrayList<AddProductAction> list=new ArrayList<AddProductAction>();  
	  
	public ArrayList<AddProductAction> getList() {  
	    return list;  
	}  
	public void setList(ArrayList<AddProductAction> list) {  
	    this.list = list;  
	}  
	
	public String execute()
	{	
		
		try{  
		  Class.forName("com.mysql.jdbc.Driver");  
		  Connection con=DriverManager.getConnection(  
		    "jdbc:mysql://localhost:3306/webapp", "root", "admin");  
		              
		//  PreparedStatement ps=con.prepareStatement("select * from product1");  
		  PreparedStatement ps=con.prepareStatement("select * from products");  
		 // PreparedStatement ps=con.prepareStatement("select * from product1");  
		  ResultSet rs=ps.executeQuery();  
		  
		 // int count = rs.getInt(1);
	     // System.out.println("Number of records in the cricketers_data table: "+count);
	      
		  while(rs.next()){  
			  AddProductAction items =new AddProductAction();  
		   items.setProduct_name(rs.getString(1));  
		   items.setProduct_model(rs.getString(2)); 
		   //items.setItem_display(rs.getString(3)); 
		   // items.setAmount(rs.getInt(3)); 
		   list.add(items);  
		  }  
		  
		  con.close();  
		 }catch(Exception e){e.printStackTrace();} 
		          
		 return "success";  
//		} 
		} 
	}