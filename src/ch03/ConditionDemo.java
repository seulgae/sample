package ch03;

import java.util.Scanner;

public class ConditionDemo {
	public static void main(String[] args) {
//		int x = 10;
//		
//		String str = "Yes";
//		
//		if(str.equalsIgnoreCase("Yes")) {
//			System.out.println(1);
//			System.out.println(2);
//			System.out.println(3);
//			System.out.println(4);
//		}
	
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = in.nextInt();
		
//		if(num % 2 == 0) {
//			System.out.println("짝수 입니다");
//		}
		
//		if(num % 2 == 1) {
//			System.out.println("홀수 입니다");
//		}
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		
	}
}
