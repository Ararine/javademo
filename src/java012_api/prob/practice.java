package java012_api.prob;

public class practice {

	public static void main(String[] args) {
		String data = "basic/java_web/jsp_framework/spring";
		System.out.println(process(data.toCharArray()));
	}
	
	static String process(char[] array) {
		String res = "";
		for(int i=0; i<array.length; i++) {
			if(array[i] == '_') res	+= ' ';
			else if(array[i] == '/') res += ':';
			else res += array[i];
		}
		return res;
	}

	
}
