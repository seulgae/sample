package ch03;

import java.util.Scanner;

public class ForDemo {
	public static void main(String[] args) {
		
//		for(int i = 0; i < 10; i ++ )
//			System.out.println(1);
	
	
		//11 부터 20까지 정수를 출력
//		for (int i = 11; i <= 20; i++) {
//			System.out.println(i);
//		}
		
		
//		for (int i = 1; i <10; i++) {
//			System.out.printf("%d * %d = %d\n", 2,  i, i * 2);
//		} 
		
		Scanner in = new Scanner(System.in);
		System.out.print("값을 입력해주세요 : ");
		
		int num = in.nextInt();
		
		for (int i = 1; i <10; i++) {
			System.out.printf("%d * %d = %d\n", num,  i, i * num);
		}
		
	}
}
