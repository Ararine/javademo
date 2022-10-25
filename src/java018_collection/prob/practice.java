package java018_collection.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		LinkedList<Book> book = new LinkedList<Book>();	
//		try(Scanner scn = new Scanner(new File("./src/java018_collection/prob/booklist"))) {
//			while(scn.hasNextLine()) {
//				String[] array = scn.nextLine().split("/");
//				book.push(null);
//			}
//		} catch(FileNotFoundException ex) {
//			ex.toString();
//		}
//		System.out.printf("title \t publisher \t write \t price \t");
//		System.out.println(book.pop().getPrice());
		String a = "Java Programming/JavaBest/Kim kava/25000";
		String[] array = a.split("/");
		book.push(new Book(array[0], array[1], array[2], array[3]));
		System.out.println(book.pop().getPublisher());
	}
}
