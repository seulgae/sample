package ch02;

public class CompLogicDemo {
	public static void main(String[] args) {
		int x = 0, y = 1;
		
		System.out.println(x < y);
		System.out.println(x > y);
		
		System.out.println(x > y && 5 / 0 == 0);
		System.out.println(x < y || 5/0 == 0);
		
	}
}
