package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("[실행결과]");
		int number = 0;
		
		while (number != 4) {
			System.out.printf("1.상품등록 2.상품조회 3.상품제거 4.종료\n");
			System.out.println("1부터 4까지 숫자를 입력하세요");
			number = scn.nextInt();
			switch (number) {
			case 1:
				registerProduct();
				break;
			case 2:
				checkProduct();
				break;
			case 3:
				removeProduct();
				break;
			case 4:
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		} // end while

		System.out.println("=======================================================================================");
		System.out.println("프로그램을 종료합니다.");
	}// end main()

	public static void registerProduct() {
		ArrayList<Product> ap = new ArrayList<Product>();
		Scanner scn = new Scanner(System.in);
		boolean chk = false;
		String ct = "null";
		String nm = "null";
		String pr = "null";
		String exDate = "null";
		Calendar cd = Calendar.getInstance();
		String today = String.valueOf(cd.get(Calendar.YEAR)) + String.valueOf(cd.get(Calendar.MONTH) + 1)
				+ String.valueOf(cd.get(Calendar.DATE));

		do {
			move: for (int i = 0;; i++) {
				System.out.println("품목을 입력하세요.");
				System.out.println("예) 과자, 음료, 냉동, 사탕, 껌, 기타 등");
				ct = scn.next();
				for (int j = 0; j < ct.length(); j++) {
					if (ct.charAt(j) >= '0' && ct.charAt(j) <= '9') {
						System.out.println("\n잘못 입력하셨습니다.\n");
						continue move;
					} else
						break;
				}
				break;
			}

			chk: for (int i = 0;; i++) {
				try (Scanner sc = new Scanner(new File("./src/project/product.txt"))) {
					while (sc.hasNextLine()) {
						String[] array = sc.nextLine().split(",");
						ap.add(new Product(array[0], array[1], Integer.parseInt(array[2]), array[3]));
					}
					System.out.println("상품명을 입력하세요.");
					System.out.println("예) 맛있는 라면 -> 맛있는라면");
					nm = scn.next();
					for (int j = 0; j < ap.size(); j++) {
						if (ap.get(j).getName().equals(nm)) {
							System.out.println("이미 같은 상품이 등록되었습니다.\n");
							continue chk;
						}
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			}

			go: for (int i = 0;; i++) {
				System.out.println("가격을 입력하세요.");
				pr = scn.next();
				for (int j = 0; j < pr.length(); j++) {
					if (!(pr.charAt(j) >= '0' && pr.charAt(j) <= '9')) {
						System.out.println("\n잘못 입력하셨습니다.\n");
						continue go;
					} else
						break;
				}
				break;
			}

			for (int i = 0;; i++) {
				try {
					System.out.println("유통기한 마지막날을 입력해주세요.");
					System.out.println("예) 2022년 10월 26일 -> 20221026");
					exDate = scn.next();
					if (Integer.parseInt(exDate) < Integer.parseInt(today)) {
						System.out.println("\n유통기한이 지난 상품은 등록할 수 없습니다.\n");
					} else if (exDate.length() > 8) {
						System.out.println("\n다시 입력해주세요.\n");
					} else
						break;

				} catch (NumberFormatException ex) {
					System.out.println("\n입력단위를 초과하였습니다.\n");
				}
			}

			System.out.println("등록하신 상품정보는");
			System.out.println();
			System.out.printf("품목: %s \t상품명: %s \t가격: %s원 \t유통기한: %s년 %s월 %s일 입니다.\n", ct, nm, pr,
					exDate.substring(0, 4), exDate.substring(4, 6), exDate.substring(6, 8));
			System.out.println();
			System.out.println("등록한 정보가 맞다면 'y', 아니라면 'n'을 입력해주세요.");
			if (scn.next().equals("y"))
				chk = true;
		} while (chk == false);
		ap.add(0, new Product(ct, nm, Integer.parseInt(pr), exDate));
		File path = new File("./src/project/product.txt");

		try (FileWriter fw = new FileWriter(path, true)) {
			fw.write(ap.get(0).toString());
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=======================================================================================");
	}// end registerProduct()

	public static void checkProduct() {
		ArrayList<Product> ap = new ArrayList<Product>();
		System.out.println("[조회결과]");
		try (Scanner scn = new Scanner(new File("./src/project/product.txt"))) {	
			Scanner sc = new Scanner(System.in);
			while(scn.hasNextLine()) {
				String[] array = scn.nextLine().split(",");
				ap.add(new Product(array[0], array[1], Integer.parseInt(array[2]), array[3]));
			}
			
			if(ap.size() == 0)
				System.out.println("입력된 상품이 없습니다.");

			ap.sort(new Product());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Product pd : ap) {
			System.out.printf("품목 : %s \t상품명 : %-10s \t가격 : %d원 \t유통기한 : %s년 %s월 %s일까지\n", pd.getCategory(),
					pd.getName(), pd.getPrice(), pd.getExpireDate().substring(0, 4), pd.getExpireDate().substring(4, 6),
					pd.getExpireDate().substring(6, 8));
		}
		System.out.println("=======================================================================================");
		
	}// end checkProduct()

	public static void removeProduct() {
		ArrayList<Product> ap = new ArrayList<Product>();
		Scanner scn = new Scanner(System.in);
		File path = new File("./src/project/product.txt");

		// ArrayList에 상품 불러오기
		try (Scanner sc = new Scanner(path)) {
			while (sc.hasNextLine()) {
				String[] array = sc.nextLine().split(",");
				ap.add(new Product(array[0], array[1], Integer.parseInt(array[2]), array[3]));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 상품조회
		ap.sort(new Product());
		for (Product pd : ap)
			System.out.printf("품목 : %s \t상품명 : %-10s \t가격 : %d원 \t유통기한 : %s년 %s월 %s일까지\n", pd.getCategory(),
					pd.getName(), pd.getPrice(), pd.getExpireDate().substring(0, 4), pd.getExpireDate().substring(4, 6),
					pd.getExpireDate().substring(6, 8));

		System.out.println();

		// 상품 입력
		System.out.println("목록에서 제거할 상품명을 입력하세요.");
		String nameProduct = scn.next();

		// 입력한 상품 제거 후 File에 입력
		try (FileWriter fw = new FileWriter(path, false)) {
			start: for (int i = 0; i < ap.size(); i++) {
				for (int j = 0; j < ap.size(); j++) {
					if (nameProduct.equals(ap.get(j).getName())) {
						System.out.printf("\n%s을 제거하시겠습니까?.\n", nameProduct);
						System.out.println("맞으면 'y' 틀리면 아무키나 입력해주세요.");
						String chk = scn.next();
						if (chk.charAt(0) == 'y') {
							ap.remove(j);
							for (Product pd : ap) {
								fw.write(pd.toString());
							}
							fw.flush();
							fw.close();
							break start;
						} else {
							for (Product pd : ap) {
								fw.write(pd.toString());
							}
							fw.flush();
							fw.close();
							break start;
						}
					}
				}
				System.out.println("\n일치하는 상품이 없습니다.");
				for (Product pd : ap) {
					fw.write(pd.toString());
				}
				fw.flush();
				fw.close();
				break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=======================================================================================");
	}// end removeProduct()

}
// end class
