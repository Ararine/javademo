package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class project {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.printf("1.물품등록 2.물품조회 3.물품폐기 4.종료\n");
			System.out.println("1부터 4까지 숫자를 입력하세요");
			int number = scn.nextInt();
			switch (number) {
			case 1:
				registerProduct();
				break;
			case 2:
				checkProduct();
				break;
			case 3:
				System.out.println("3.물품폐기");
				break;
			case 4:
				System.out.println("4.종료");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
			if (number >= 1 && number <= 4)
				break;
		} // end while
		System.out.println("프로그램을 종료합니다.");
	}// end main()

	public static void registerProduct() {
		ArrayList<Product> ap = new ArrayList<Product>();
		Scanner scn = new Scanner(System.in);
		boolean chk = false;
		String ct = "null";
		String nm = "null";
		int pr = 0;
		int exDate = 0;
		do {
			System.out.println("품목을 입력하세요.");
			ct = scn.next();
			System.out.println("상품명을 입력하세요.");
			System.out.println("예) 맛있는 라면 -> 맛있는라면");
			nm = scn.next();
			System.out.println("가격을 입력하세요.");
			pr = scn.nextInt();
			System.out.println("유통기한 마지막날을 입력해주세요.");
			System.out.println("예) 2022년 10월 26일 -> 20221026");
			exDate = scn.nextInt();
			System.out.println("등록하신 상품정보는");
			System.out.println();
			System.out.printf("품목: %s\n상품명: %s\n가격: %d\n유통기한: %d 입니다.\n", ct, nm, pr, exDate);
			System.out.println();
			System.out.println("등록한 정보가 맞다면 'y', 아니라면 'n'을 입력해주세요.");
			if(scn.next().equals("y")) chk = true;
		} while (chk == false);
		ap.add(new Product(ct, nm, pr, exDate));
		File path = new File("./src/project/product.txt");

		try (FileWriter fw = new FileWriter(path, true)) {
			fw.write(ap.get(0).toString());
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}//end registerProduct()
	
	public static void checkProduct() {
		ArrayList<Product> ap = new ArrayList<Product>();
		try(Scanner scn = new Scanner(new File("./src/project/product.txt"))) {
			if(scn.hasNextLine() == false) {
				System.out.println("입력된 상품이 없습니다.");
			}else {
				while(scn.hasNextLine()) {
					String[] array = scn.nextLine().split(",");
					ap.add(new Product(array[0], array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3])));
				}
			}
			ap.sort(new Product());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Product pd : ap)
			System.out.printf("품목 : %s, 상품명 : %s, 가격 : %d, 유통기한 : %d\n", pd.getCategory(), pd.getName(), pd.getPrice(), pd.getExpireDate());
	}
}// end class
