package renewed_project_by_oracle;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import project.Product;

public class project {

	public static void main(String[] args) {
		ProductController pController = new ProductController();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[실행결과]");
		int number = 0;

		while (number != 4) {
			System.out.printf("1.상품등록 2.상품조회 3.상품제거 4.종료\n");
			System.out.println("1부터 4까지 숫자를 입력하세요");
			number = sc.nextInt();
			switch (number) {
			case 1:
				registerProduct(pController, sc);
				break;
			case 2:
				checkProduct(pController);
				break;
			case 3:
				deleteProduct(pController, sc);
				break;
			case 4:
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		} // end while
		System.out.println("프로그램이 종료되었습니다.");
	}//end main()
	
	public static void registerProduct(ProductController pController, Scanner sc) {
		List<ProductDTO> aList = pController.checkProcess();
		boolean cp = false;
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
				ct = sc.next();
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
				System.out.println("상품명을 입력하세요.");
				System.out.println("예) 맛있는 라면 -> 맛있는라면");
				nm = sc.next();
				for (int j = 0; j < aList.size(); j++) {
					if (aList.get(j).getName().equals(nm)) {
						System.out.println("이미 같은 상품이 등록되었습니다.\n");
						continue chk;
					}
				}
				break;
			}
	
			go: for (int k = 0;; k++) {
				System.out.println("가격을 입력하세요.");
				pr = sc.next();
				for (int j = 0; j < pr.length(); j++) {
					if (!(pr.charAt(j) >= '0' && pr.charAt(j) <= '9')) {
						System.out.println("\n잘못 입력하셨습니다.\n");
						continue go;
					} else
						break;
				}
				break;
			}

			for (int k = 0;; k++) {
				try {
					System.out.println("유통기한 마지막날을 입력해주세요.");
					System.out.println("예) 2022년 10월 26일 -> 20221026");
					exDate = sc.next();
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
			System.out.println("등록한 정보가 맞다면 'y', 아니라면 'n'을, 메뉴는 'm'를 입력해주세요.");
			String ad = sc.next();
			
			if (ad.equals("y"))
				cp = true;
			else if(ad.equals("m"))
				break;
		} while (cp == false);
		ProductDTO dto = new ProductDTO(ct, nm, Integer.parseInt(pr), exDate);
		int chk = pController.registerProcess(dto);
		
		if(chk>0)
			System.out.printf("%s 상품이 등록되었습니다.\n", nm);
		else
			System.out.println("등록이 취소되었습니다.");
		System.out.println("=======================================================================================");
	}// end registerProduct()
	
	public static void checkProduct(ProductController pController) {
		List<ProductDTO> aList = pController.checkProcess();
		if(aList.size()==0)
			System.out.println("등록된 상품이 없습니다.");
		else {
			for(ProductDTO dto : aList) {
				System.out.printf("번호 : %-10d \t품목 : %s \t상품명 : %-10s \t가격 : %d원 \t유통기한 : %s년 %s월 %s일까지\n", dto.getNum(),dto.getCategory(),
						dto.getName(), dto.getPrice(), dto.getExpireDate().substring(0, 4), dto.getExpireDate().substring(4, 6),
						dto.getExpireDate().substring(6, 8));
			}			
		}
		System.out.println("=======================================================================================");
	}//end checkCall()
	
	public static void deleteProduct(ProductController pController, Scanner sc) {
		List<ProductDTO> aList = pController.checkProcess();

		// 상품 입력
		System.out.println("목록에서 제거할 상품명을 입력하세요.");
		String nameProduct = sc.next();
		
		// 입력한 상품 제거 후 File에 입력
		start: for (int i = 0; i < aList.size(); i++) {
			for (int j = 0; j < aList.size(); j++) {
				if (nameProduct.equals(aList.get(j).getName())) {
					System.out.printf("\n%s을 제거하시겠습니까?.\n", nameProduct);
					System.out.println("맞으면 'y' 틀리면 아무키나 입력해주세요.");
					String sh = sc.next();
					if(sh.equals("y")) {					
						int chk = pController.deleteProcess(nameProduct);
						System.out.printf("%s 상품이 삭제되었습니다.\n", nameProduct);
						break start;
					}else {
						System.out.println("상품 삭제가 취소되었습니다.\n메뉴로 이동합니다.");
						break start;
					}
				}
			}
			System.out.println("\n일치하는 상품이 없습니다.");
			break;
		}
		System.out.println("=======================================================================================");	
	}
}//end class
