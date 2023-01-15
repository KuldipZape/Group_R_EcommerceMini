package com.ecommerce.main;

import java.util.Scanner;

public class Registeration {
	public static void getRegister() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name =scanner.next();
		System.out.println("Enter your E-mail id");
		String mail = scanner.next();
		System.out.println("Enter your mobile number");
		String mobno = scanner.next();
		System.out.println("Enter your City");
		String city = scanner.next();
		scanner.close();
	}

}
