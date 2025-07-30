package ch05;

public class ImmutableDemo {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello"); // new 연산자를 사용한 가변 객체
		String str4 = new String("Hello"); // new 연산자를 사용한 가변 객체
		
		str2 = "World";
	
		System.out.println(str1);
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str3 == str4);
		
	}
}
