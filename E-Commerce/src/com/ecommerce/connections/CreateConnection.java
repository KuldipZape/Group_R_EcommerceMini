package com.ecommerce.connections;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {
Connection connection =null;
public Connection getConnectionDetails() {
	
	try {
	Class.forName("com.mysql.jdbc.Driver");
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");
	}catch(Exception e){
		e.printStackTrace();	
	}	
	return connection;
}
}
