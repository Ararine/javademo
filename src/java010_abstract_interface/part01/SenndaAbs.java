package java010_abstract_interface.part01;

public class SenndaAbs extends CarAbs { //추상클레스를 상속 받고 추상메소드를 수정하지 않으면 오류가 발생한다.

	public SenndaAbs() {
		
	}
	
	@Override
		public void work() {
			System.out.println("승용차가 사람을 태우고 있습니다.");
		}
}
