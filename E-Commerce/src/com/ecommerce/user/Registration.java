package com.ecommerce.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import com.ecommerce.connections.CreateConnection;
public class Registration {
	// username, passwrd, phoneno
	public void InsertDetails(String username, String passwrd, long phoneno) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			CreateConnection connection = new CreateConnection();
			con = connection.getConnectionDetails();
			ps = con.prepareStatement("insert into customers(username, passwrd, phoneno)values(?,?,?)");
			ps.setString(1, username);
			ps.setString(2, passwrd);
			ps.setLong(3, phoneno);
			int i = ps.executeUpdate();
			System.out.println("Customer Added >> " + i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.print(" Enter User Name => ");
			String userName = scanner.next();
			System.out.print(" Enter User Password => ");
			String userPasswrd = scanner.next();
			System.out.print(" Enter phoneNo => ");
			long phoneNo = scanner.nextLong();
			Registration reg = new Registration();
			reg.InsertDetails(userName, userPasswrd, phoneNo);
		}
	}

}
