package java017_collection.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		String a = "상승가[2000]";
		String[] array = a.split("\\[");
		for(String arr : array)
			System.out.println(arr);

}
	}
