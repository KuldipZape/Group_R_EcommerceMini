package com.ecommerce.main;

public class Product {
	String ProductName;
	String ProductId;
	String ProductDescription;
	String ProductPrice;
	
	public Product(String Pname,String Pid,String Pdiscription,String Pprice) {
		this.ProductName = Pname;
		this.ProductId = Pid;
		this.ProductDescription = Pdiscription;
		this.ProductPrice = Pprice;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String productId) {
		ProductId = productId;
	}

	public String getProductDescription() {
		return ProductDescription;
	}

	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}

	public String getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(String productPrice) {
		ProductPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [ProductName=" + ProductName + ", ProductId=" + ProductId + ", ProductDescription="
				+ ProductDescription + ", ProductPrice=" + ProductPrice + "]";
	}
	
	
}

