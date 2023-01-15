package com.ecommerce.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.ecommerce.connections.CreateConnection;

public class UserInput {
	PreparedStatement ps = null;
	Connection con = null;
	
	public void insertProductDetails(String pName,String pDisc,int pQnty,int pPrice) {
		try {
		CreateConnection connection = new CreateConnection();
		 con=connection.getConnectionDetails();
		ps=con.prepareStatement("insert into products(pName,pDisc,pQnty,pPrice)values(?,?,?,?)");
		ps.setString(1, pName);
		ps.setString(2, pDisc);
		ps.setInt(3, pQnty);
		ps.setInt(4, pPrice);
		int i=ps.executeUpdate();
		System.out.println("Product is inserted successfully.." + i);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
		public static void main(String[] args) throws SQLException { 
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < 10; i++) { 
			System.out.println("Enter Product Name >>"); 
			String pName = sc.next(); 
			System.out.println("Enter Product Discription >>"); 
			String pDisc = sc.next();
			System.out.println("Enter Product Quantity >>"); 
			int pQnty = sc.nextInt();
			System.out.println("Enter Product Price >>"); 
			int pPrice = sc.nextInt();
			 
			
			UserInput userInput = new UserInput();
			userInput.insertProductDetails(pName, pDisc, pQnty, pPrice);
			}
			sc.close();
			}
			}

