package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Product implements Comparator<Product>{
	private String category;
	private String name;
	private int price;
	private String expireDate;
	
	public Product() {
		
	}

	public Product(String category, String name, int price, String expireDate) {
		super();
		this.category = category;
		this.name = name;
		this.price = price;
		this.expireDate = expireDate;
	}
	
	@Override
	public String toString() {
		return String.format("%s,%s,%d,%s\n", getCategory(), getName(), getPrice(), getExpireDate());
	}
	
	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getCategory().equals(o2.getCategory())) {
			return o1.getName().compareTo(o2.getName());			
		}	else if(String.valueOf(o1.getPrice()).equals(String.valueOf(o2.getPrice()))) {
			return String.valueOf(o1.getPrice()).compareTo(String.valueOf(o2.getPrice()));			
		}	else {
			return o1.getCategory().compareTo(o2.getCategory());
		}
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	
	
}
