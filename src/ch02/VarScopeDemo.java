package ch02;

public class VarScopeDemo {
	int var2 = 20; // 전역 인스턴스 변수
	int var3 = 30;

	public static void main(String[] args) {
		
		VarScopeDemo a = new VarScopeDemo();
		
		int var1 = 10; // 전역변수
		
		if(true) {
			int var3 = 0;
			System.out.println(var1 + a.var2);
		}
		
		int i = 0;
		
		for(;i<3;) {
			int var3 = 0; // 지역변수
			System.out.println(var1 + a.var2);
			break;
		}
		
		System.out.println(a.var3);
		
	}
}
