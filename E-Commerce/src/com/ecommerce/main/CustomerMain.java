package com.ecommerce.main;

import java.util.ArrayList;


public class CustomerMain {
	private static final String mobNo = null;

	public static void main(String[] args) {
	System.out.println("Welcome To E-Mart");
		
		// registration method
		System.out.println("Please Register Your UserId");
		if(mobNo != null) {
			System.out.println("User is Already Registered");
		}
		else {
			Registeration.getRegister();
			
		}
		
		//showing the Product list
	ArrayList<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product("ElectronicsItems","101","HeadPhone-Boat","650"));
		productList.add(new Product("ClothingSet","102","KidsWear-DenimJackets","1000"));
		productList.add(new Product("Kithchenwere","103","CutlerySet","850"));
		productList.add(new Product("Cosmetics","104","LipSticks-Sugar","450"));
		productList.add(new Product("Furniture","105","SofaSet","12000"));
		productList.add(new Product("BabyCare","106","BabycareKit","950"));
		productList.add(new Product("BabyToys","107","RemoteCars","5000"));
		productList.add(new Product("Footwear","108","Heels-Bata","750"));
		productList.add(new Product("Books","109","Rich Dad Poor Dad","1000"));
		productList.add(new Product("Jwellery","110","Stylish-Earings","250"));
		
		System.out.println("Please Select the Product from the given product list" );
		
		for(Product pod : productList) {
			System.out.println("product list is" +pod);
		}
		
	}

	
	


}
