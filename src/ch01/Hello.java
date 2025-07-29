package ch01; // 패키지 이름은 소문자로 ;;

public class Hello {
/**
 * 프로그램의 기본 메서드
 * @param args 문자 배열
 **/
	public static void main(String[] args) {
		// 나의 첫번째 프로그램
		int x;
		x = 1;
		int y = 2;
		int result = x + y ;
		System.out.println(result);
		
		System.out.println("안녕!");
		System.out.println("hello" + "world");
		
		String str = "hello"; // 문자열 선언
		System.out.println(str);
		
	}
}
