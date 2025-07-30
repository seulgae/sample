package ch04;

public class LocalVarDemo {
	public static void main(String[] args) {
		int i = 0;
		double b;
		// System.out.println(b = 0.0); // The local variable b may not have been initialized, 초기화 되지 않은 변수 선언
		// System.out.println(a + c); // cannot be resolved to a variable 선언 되지 않은 변수 사용할 때 발생
		
		int c = 0;
		// public double d = 0.0; // Illegal modifier for parameter d; only final is permitted, main
		for (i = 0; i < 10; i++) {
			System.out.println(c);
		}
	
	}
	
	

}
