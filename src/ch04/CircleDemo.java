package ch04;
public class CircleDemo {
	public static void main(String[] args) {

		Circle c = new Circle();

//		System.out.println(c.findArea());
//		c.setRadius(-1);
		
//		if (c.getRadius() < 0 ) {
//			System.out.println(c.getRadius());
//			System.out.println("원의 반지름은" + c.getRadius());
//			System.out.println("원의 넓이는 " + c.getRadius());	
//		}
		
		Circle c1 = new Circle(-1);
		System.out.println(c1.getRadius());

	}
}

//class Circle {
//	double radius; // 0.0;
//
//	double findArea() {
//		return 3.14 * radius * this.radius; 
//		// 해당 클래스의 필드를 가르킴;
//	}
//}
class Circle {
	
	// 필드
	private double radius;

	//  기본 생성자
	public Circle (){
		
	}
	
	public Circle(double r) {
		if(r > 0) {
			this.radius = r;			
		}
		System.out.println("값을 0 이상으로 입력해주세요....");
		
	}
	
	
	public double getRadius() {
		return radius;
	}

	public double setRadius(double r) {
		if (r <= 0) {
			System.out.println("원의 반지름은 0보다 커야합니다.");
			return 0.0;
		}
		this.radius = r;
	
		
		
		return 0.0;
	}
	

}