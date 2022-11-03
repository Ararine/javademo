package renewed_project_by_oracle;

public class ProductDTO {
	private int num;
	private String category;
	private String name;
	private int price;
	private String expireDate;
	
	public ProductDTO() {

	}

	public ProductDTO(String category, String name, int price, String expireDate) {
		super();
		this.category = category;
		this.name = name;
		this.price = price;
		this.expireDate = expireDate;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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
