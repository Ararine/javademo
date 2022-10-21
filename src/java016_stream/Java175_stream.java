package java016_stream;

import java.io.File;

public class Java175_stream {
	//File class - listFiles()
	public static void main(String[] args) {
		File file = new File("src/java016_stream/a");
		deleteFileList(file);
	}//end main()
	
	//Remove File: src\java016_stream\a
	//Remove File: src\java016_stream\a\b
	//Remove File: src\java016_stream\a\b\c
	
	public static void deleteFileList(File srcFile) {
		File[] fileAll = srcFile.listFiles(); // listFiles() 파일 배열로 리턴
		System.out.println(fileAll.length); 
		if(fileAll.length != 0) {
			for(File file : fileAll) {
				System.out.println(file);
				deleteFileList(file);
			}
		}
		System.out.println("Remove File: " + srcFile.getPath()); //재귀함수의 형태를 띄기 때문에 안쪽부터 지워진다.
		srcFile.delete();
		
		
	}//end deleteFileList()
}//end class
