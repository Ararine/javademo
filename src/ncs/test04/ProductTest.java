package ncs.test04;

public class ProductTest {

	public static void main(String[] args) {
		Product prod = new Product("갤럭시 s7", 563500, 3);
		System.out.println(prod.information());
		System.out.printf("총 구매 가격 : %d 원\n", prod.getPrice() * prod.getQuantity());
	}
}
