package java009_inheritance.prob.part05;

public class Festival {
	private String name;
	private String place;
	private double kiloMeter;
	private boolean fee;

	
	public	Festival() {
		
	}

	public Festival(String name, String place, double kiloMeter, boolean fee) {
		this.name = name;
		this.place = place;
		this.kiloMeter = kiloMeter;
		this.fee = fee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public double getKiloMeter() {
		return kiloMeter;
	}

	public void setKiloMeter(double kiloMeter) {
		this.kiloMeter = kiloMeter;
	}

	public boolean isFee() {
		return fee;
	}

	public void setFee(boolean fee) {
		this.fee = fee;
	}

	
	public Festival(double kiloMeter) {
		this.kiloMeter = kiloMeter;
	}
	
	public String toString() {
		return String.format("%s %7s %8.1f %9b\n", name, place, kiloMeter, fee);
	}

}
