package ch05;

public class StringDemo5 {
	public static void main(String[] args) {
		String formatStr = String.format("%s \t %d", "JDK", 14);
		System.out.println(formatStr);
		String.join(",", args);
		
		String joinStr = String.join(", ", "apple", "banana", "cherry", "durian");
	}

}
