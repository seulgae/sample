package ch02;

import java.util.Scanner;

public class InputDemo {
	public static void main(String[] args) {
		
		System.out.print("숫자를 입력하세요 : ");
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		System.out.println("입력받은 숫자는 " + x + "입니다.");
		
		System.out.println("실수를 입력해주세요.");
		float f = in.nextFloat();
		
		System.out.printf("입려받은 실수는 %f 입니다.", f);
		
		
		
	}
}
