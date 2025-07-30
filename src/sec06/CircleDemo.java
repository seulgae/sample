package sec06;

public class CircleDemo {

	public static void main(String[] args) {
		Circle a = new Circle();
		a.info();
		Circle b = new Circle(10.0);
		b.info();
		Circle c = new Circle("빨강");
		c.info();
		Circle d = new Circle(10.0, "파랑");
		d.info();
			
	}
}

class Circle {
	double radius;
	String color;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(String color) {
		this.color = color;
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public void info() {
		System.out.printf("원의 반지름은 %.1f 이고 색깔은 %s입니다.\n", radius, color);
	}
	
}
