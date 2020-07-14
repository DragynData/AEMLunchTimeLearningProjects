package tech.innisfree.challenges;

public class EulerProblem1 {
	
	public static void main(String[] args) {
		
		int input = 1000;
		int sum = 0;
		
		for (int i = 1; i<input; i++) {
			if ((i%3==0)||(i%5==0)) {
				 sum += i;
			}
		}
		 System.out.println(sum);
	}
	
}
