package ncs.test15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();
		Scanner scn;
		try {
			scn = new Scanner(new File("./src/ncs/test15/books.dat"));
			while(scn.hasNextLine()) {
				String[] str = scn.nextLine().split(" ");

				list.add(new Book(str[0] + " " + str[1], str[2], Integer.parseInt(str[3]), str[4], Double.parseDouble(str[5])));					
			}
			System.out.println(list.get(0).getTitle());
//			System.out.println(list.get(0).getAuthor());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
