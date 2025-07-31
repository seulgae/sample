package ch05;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] scores = {92, 100, 85, 78, 69};
		int sum = 0;
		
		for(int i = 0; i < 5; i++ ) {
			sum = sum + scores[i];
		}
		
		System.out.println("학생의 다섯명 합은?" + sum);
		System.out.println("");
	}
}
