package java018_collection;

public class Average<T extends Number> { //그냥 T에 임의의 데이터형식을 두게 되면 모든 값을 받게 되므로 Number를 상속받아 숫자만 들어오게 해준다.
	private T[] list;
	
	public Average() {}
	
	public Average(T[] list) {
		this.list = list;
	}
	
	public double findAverage() {
		double sum = 0.0;
		for(T data : list)
			sum += data.doubleValue();
		
		return sum/list.length;
	}
}
