package ch05;

public class MutableDemo {
	int i = 1;
//	int j = i;
	int j = 3;
	
	public static void main(String[] args) {
		Cat c1 = new Cat("나비"); // 0x100
		Cat c2 = c1; // heep 메모리 공유
		
		System.out.println(c1.getName() + ":" + c2.getName());
		
//		c2.setName("야옹이");
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		
//		int i = 1;
//		int j = i;
		
		c2 = new Cat("야옹이");
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		
		
		
		MutableDemo m = new MutableDemo();
		
		System.out.println(m.i + " : " + m.j);
		
		
		
	}

}

class Cat { // mutable ==> immutable
	private final String name; // final ==> name이 변하지 않게
	
	public Cat(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
}
