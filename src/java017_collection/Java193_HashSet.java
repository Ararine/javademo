package java017_collection;

import java.util.HashSet;

//Hashset : 중복허용 안되고, 순서유지 안된다.
public class Java193_HashSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(new Integer(10));
		set.add(new Integer(30));
		set.add(new Integer(10));
		set.add(new Integer(20));
		
		for(Integer it : set)
			System.out.println(it);
	}//end main()
	
}//end class
