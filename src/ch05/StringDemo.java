package ch05;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "J";
		String s2 = "C";
		
		String s3 = new String("J");
		String s4 = "j";
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s3));
		
		// 대소문자 구분안하고 동등한지
		System.out.println(s3.equalsIgnoreCase(s4));
		
		// 크기 비교
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		
		// 대 소문자 비교안하고 크기 비교
		System.out.println(s1.compareToIgnoreCase(s4));
		
		// 몰랐던 부분 !!
//		System.out.println("s1 == s3" + s1 == s4);
		
		
	}
}
