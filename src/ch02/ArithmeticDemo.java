package ch02;

public class ArithmeticDemo {

	public static void main(String[] args) {
		long l = 100L;
		int i = 10;
		
		long result = l + i;
		System.out.printf("%d와 %d의 + 연산 결과는 %d 입니다.\n", l, i, result);
		
		
		double d = 100.0;
		int i1 = 10;
		
		double result2 = d + i1;
		System.out.printf("%f 와 %d의 + 연산결과는 %f 입니다. \n", d, i1,result2);
		
		int a = -1_000_000;
		int b = 2_000_000;
		
		long res = (long)a * b;
		
		System.out.println(res);
		
		
		int apple = 1;
		float pieceUnit = 0.1f;
		int number = 7;
		
		float result3 = apple - pieceUnit * number;
		System.out.println(result3);
		
//		int res3 = 3/0;
//		System.out.println(res3);
		
		
		int three = 4;
		int res4 = three  %  2 ; 
		System.out.println(res4);
		
	}
}
