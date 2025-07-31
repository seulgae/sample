package ch05;

import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] scores = new int[100];
		int sum = 0;
		int cnt = 0;

		for (int i = 0; i < scores.length; i++) {
			System.out.print("점수 입력해라[종료하려면 -1] : ");
			scores[i] = in.nextInt();

			if (scores[i] == -1) {
				System.out.println("입력문이 종료되었습니다.");
				break;
			} else {
				sum += scores[i];
				cnt++;
			}
		}

		if(cnt == 0) {
			System.out.println("입력받은 점수가 없습니다.");
		}else {
			System.out.println("총 입력받은 수 : " + cnt);
			System.out.println("총 입력 점수이 합계 : " + sum);
			System.out.printf("평균 점수 : %.2f", (sum / (double)cnt));			
		}
		
		in.close();
	}
}
