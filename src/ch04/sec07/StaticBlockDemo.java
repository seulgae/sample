package ch04.sec07;

public class StaticBlockDemo {
	// 정적(static, 클래스) 변수
	static int sumOneToTen;
	static {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		sumOneToTen = sum;
	}
	int any = 0;

	// 정적(static, 클래스) 메서드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOneToTen); // 클래스 메서드에서 클래스 변수를 사용
//		System.out.println(any);  클래스 메서드에서 인스턴스 변수를 사용할 수 없음 
//		System.out.println(sum);  클래스 메서드에서 지역 변수를 사용할 수 없음
	}

}