package java010_abstract_interface.part03;

public class Java104_abstract {

	public static void main(String[] args) {
		Flute flute = new Flute("Flute");
		System.out.println(flute.name);
		flute.play();
		
		Piano piano = new Piano("Piano");
		System.out.println(piano.name);
		piano.play();
	}
}
