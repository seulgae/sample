package ch05;

import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] scores = new int[5];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("점수 입력해라 : ");
			scores[i] = in.nextInt();
		}
		
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
	}
}
