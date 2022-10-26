package project;

import java.util.Comparator;

public class Product implements Comparator<Product>{
	private String category;
	private String name;
	private int price;
	private int expireDate;
	
	public Product() {
		
	}

	public Product(String category, String name, int price, int expireDate) {
		super();
		this.category = category;
		this.name = name;
		this.price = price;
		this.expireDate = expireDate;
	}
	
	@Override
	public String toString() {
		return String.format("%s,%s,%d,%d\n", getCategory(), getName(), getPrice(), getExpireDate());
	}
	
	@Override
	public int compare(Product o1, Product o2) {
		return o1.getName().compareTo(o2.getName());
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

	public int getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(int expireDate) {
		this.expireDate = expireDate;
	}
	
	
}
