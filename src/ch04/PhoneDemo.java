package ch04;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.model = "갤럭시 23";
		myPhone.value = 100;
		
		myPhone.print();
		
		Phone yourPhone = new Phone();
		yourPhone.model = "아이폰13";
		yourPhone.value = 200;
		yourPhone.print();
	}
}
class Phone{
	String model;
	int value;
	
	void print() {
		System.out.println(value + "만원 짜리 " + model + "스마트폰");
	}
}