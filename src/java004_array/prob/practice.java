package java004_array.prob;

public class practice {

	public static void main(String[] args) {
		String[] name = new String[] {"소원", "예린", "은하", "유주", "신비"};
		int[][] ans = new int[][] {
			{1,3,2,4,3,1,4,2,2,1},
			{3,2,4,2,2,1,1,3,4,1},
			{2,4,3,2,1,2,1,3,3,4},
			{2,3,3,1,1,3,2,2,4,4},
			{3,1,1,2,4,1,2,3,1,3}};
			
		int[] sol = new int[] {1,2,3,4,4,3,2,1,1,2};
		
		for(int i=0; i<ans.length; i++) {
			System.out.print(name[i] + " 점수 : ");
			int score = 0;
			for(int j=0; j<ans[i].length; j++) {
				if(ans[i][j] == sol[j]) score++;
			}
			System.out.println(score + "점");
		}
	}
}
