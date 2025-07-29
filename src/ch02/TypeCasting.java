package ch02;

public class TypeCasting {
	public static void main(String[] args) {
		// 목시적, 자동 형변환
		double d1 = 5 * 3.14; // 연산에서 피연산자의 타입이 자동으로 형변환
		double d2 = 1; // 1 -> 1.0
		
		System.out.println(d1);
		System.out.println(d2);
		
		// 명시적, 강제 형변환
		float f = (float)3.14;
		System.out.println(f);
		
		byte b = (byte)300;
		double d = (double)3.14f;
		double d23 = (double)3.14;
		
		System.out.println(f + ", "+ b + ", "+ d + ", "+  d2);
		
		// 숫자ㅏ를 문자로, 문자를 수자로
		char c = 3 + '0';
		int i = '3' - '0';
		
		System.out.println(c);
		System.out.println(i);
		
		// 숫자를 문자열로, 문자를 문자열로
		String s = 3 + "0123";
		String s1 = '3' + " ";
		
		System.out.println(s);
		System.out.println(s1);
		
		// 문자열을 숫자로, 문자열을 문자로
		s1.charAt(1);
		
		System.out.println(s1.charAt(0));
		System.out.println("hello".charAt(1));
		System.out.println("안녕하세요.".charAt(0));
		
		String str = "300";
		System.out.println(Integer.parseInt(str) + 1);
		
		str = "3000000000";
		long value2 = Long.parseLong(str);
		System.out.println(value2);
		
		str = "3.14";
		double value3 = Double.parseDouble(str);
		System.out.println(value3);
		
		
		
	}
	
}
