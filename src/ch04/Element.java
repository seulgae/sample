package ch04;

public class Element {

	public static void main(String[] args) {
		
		Animal a  = new Animal();
		a.introduce("끝내자 ;;");
		
	}

}

class Animal {
	
	
	int age;
	String gender;
	
	void isMammal(){
		
	}
	
	void introduce(String b) {
		System.out.println(b);
	}
	
}

class Duck {
	String backColor = "yellow";
	
	void swim() {
		System.out.println("수영쌉가능");
	}
	
	void quack() {
		System.out.println();
	}
	
}

class Fish {
	int sizeInFt = 0;
	
	void swim() {
	
	}
}
