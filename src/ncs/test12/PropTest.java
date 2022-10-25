package ncs.test12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropTest {

	public static void main(String[] args) {
		Properties prop = new Properties();
		File path = new File("./src/ncs/test12/data.xml");
		try {
			if(!path.exists()) {
				path.createNewFile();			
			}
			prop.setProperty("1", "apple,1200,3");
			prop.setProperty("2", "banana,2500,2");
			prop.setProperty("3", "grape,4500,5");
			prop.setProperty("4", "orange,800,10");
			prop.setProperty("5", "melon,5000,2");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void fileSave(Properties p) {

	}

	public static void fileOpen(Properties p) {

	}
}
