package java018_collection;

import java.util.Comparator;

public class Descending implements Comparator<Integer>{
	public int compare(Integer o1, Integer o2) {
//		return o2>o1 ? 1 : o2<o1 ? -1 : 0;
		return o2.compareTo(o1); //내림차순
	}
}
