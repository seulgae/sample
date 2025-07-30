package ch04;

public class RefTypeDemo {
	
	public static void main(String[] args) {
		int i = 10; // Stack 
		
		Ball myBall = new Ball();
		System.out.println(myBall); // 1번 객체
		
		Ball yourBall = new Ball();
		System.out.println(yourBall); // 2번 객체 
		System.out.println(myBall == yourBall); // 주소값 다름
		
		myBall = yourBall; // 1번객체에 2번객체 주소값 대입
		System.out.println(myBall == yourBall);
		
	}
	
}

class Ball {
	
}
