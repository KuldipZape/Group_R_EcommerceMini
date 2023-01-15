package com.ecommerce.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.ecommerce.connections.CreateConnection;

public class Bill {
	
	public void BillDetails(String pName,int price, int quantity) throws SQLException{
		Connection con=null;
		PreparedStatement ps=null;
		try {
			CreateConnection connection = new CreateConnection();
			con=connection.getConnectionDetails();
			ps=con.prepareStatement("insert into bill(pName,price, quantity)values(?,?,?)");
			ps.setString(1, pName);
			ps.setInt(2, price);
			ps.setInt(3, quantity);
			int i= ps.executeUpdate();
			System.out.println("Products Added to Cart >> "+i);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SQLException {

	    Scanner sc=new Scanner(System.in);
	   	    System.out.println("Enter Name : ");
	        String pName=sc.next();
	        System.out.println("Enter price : ");
	        int price=sc.nextInt();
	        System.out.println("Enter quantity: ");
	        int quantity=sc.nextInt();
	        int totalcost=quantity*price;
	        int discount= (totalcost/100)*10;
	        int netamount=totalcost-discount;
  
        System.out.println("Price of one Item= "+price);
	    System.out.println("Price of "+quantity+" Items= "+totalcost);
	    System.out.println("10% discont on "+totalcost+" = "+discount);
	    System.out.println("Net amount to be paid= "+totalcost+" - "+discount+" = "+netamount);

	    Bill bill = new Bill();
	    bill.BillDetails(pName,price, quantity);		
                      
	}                   
}
