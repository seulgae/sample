package ch05;

import java.util.Scanner;

public class DoWhileDemo {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int num = 0;
		
//		do {
//			System.out.print("값을 입력하세요 : ");
//			num = in.nextInt();
//		}while(num > 0);
		
		
		// 1 ~ 10 까지의 짝수만 출력
		int i = 1;
		
		
		while(i <= 10) {
			i++;
			if(i % 2 == 1) {
				continue;
			}
			System.out.println("짝수입니다 : " + i);
		}
		
		
	}
}
