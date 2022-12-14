package java009_inheritance.prob.part05;

public class Select extends Festival{
	private int startPeriod;
	private int endPeriod;
	public Select() {
		
	}
	
	////여기에 구현하세요 문제 1//////////////////////////////////
	public Select(String name, String place, double distance, boolean fee, int startPeriod, int endPeriod) {
		super(name, place, distance, fee);
		this.startPeriod = startPeriod;
		this.endPeriod = endPeriod;
	}
	/////////////////////////////////////////////////
	public int getStartPeriod() {
		return startPeriod;
	}


	public void setStartPeriod(int startPeriod) {
		this.startPeriod = startPeriod;
	}


	public int getEndPeriod() {
		return endPeriod;
	}

	public void setEndPeriod(int endPeriod) {
		this.endPeriod = endPeriod;
	}
	
	public String distance() {
		if(getKiloMeter() <= 50) return "근거리";
		else if(getKiloMeter() <= 200) return "중거리";
		else return "장거리";
	}
	
	
	//여기에 구현하시오 문제 1/////////////////////////////////////
	public String toString() {
		return String.format("%s %7s %8.1f %9b %15d %15d", getName(), getPlace(), getKiloMeter(), isFee(), startPeriod, endPeriod);
	}
	///////////////////////////////////////////////////
	
	//여기에 구현하시오 문제 2//////////////////////////////////////
	public void prn() {
		System.out.printf("%s에 %s가 있습니다.\n", distance(), getName());
	}
	////////////////////////////////////////////////////
}
