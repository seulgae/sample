package ch04.sec07;

public class StaticBlockDemo {
	// 정적 변수(static, 클래스)변수
	static int sumOneToTen;
	static {
		int sum = 0;
		
		for (int i = 0; i <= 10; i++) {
			sum = sum + i;
		}
		
		sumOneToTen = sum;
	}
	int any;
	
	// 정적 메서드
	public static void main(String[] args) {
		
//		StaticBlockDemo a = new StaticBlockDemo();
		System.out.println(sumOneToTen);
//		System.out.println(any); // 클래스 메서드에서 인스턴스 변수를 사용할 수 없음
//		System.out.println(sum); // 클래스 메서드에서 인스턴스 변수를 사용할 수 없음
//		System.out.println(a.any = 10);
	}

}



