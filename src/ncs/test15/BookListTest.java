package ncs.test15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookListTest {

	public static void main(String[] args) {
		BookListTest test5 = new BookListTest(); 
		ArrayList<Book> list = new ArrayList<Book>();
		test5.storeList(list);
		
		test5.saveFile(list);
		
//		List<Book> booksList = test5.loadFile();
		
//		test5.printList(booksList);
	}
	
	public void storeList(List<Book> list) {
		list.add(new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.15));
		list.add(new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.2));
		list.add(new Book("객체지향 JAVA8", "금영옥", 30000, "북스홈", 0.1));

	}
	
	public void saveFile(List<Book> list) {
		File path = new File("./src/ncs/test15/books.dat");
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(path, false);
			Scanner scn = new Scanner(path);
			for(int i=0; i<list.size(); i++) {
				fw.write(list.get(i).toString() + "\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
//	public List<Book> loadFile() {
//		List<Book> list = new ArrayList();
//		Scanner scn;
//		try {
//			scn = new Scanner(new File("./src/ncs/test15/books.dat"));
//			while(scn.hasNextLine()) {
//				String[] str = scn.nextLine()
//						
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//			
//
//		return null;
//	}
	
	public void printList(List<Book> list) {
		
	}
}
