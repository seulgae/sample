package ch04;

public class PersonDemo {

	public static void main(String[] args) {
		Person2 p = new Person2();
//		p.setAge(21);
//		p.setName("민국");
//		p.setNationality("대한민국");
//		p.sayHello();

		p.setAge(21).setName("민국").setNationality("대한민국").sayHello();
	}

}

class Person2 {
	private String name;
	private int age;
	private String nationality;

	public Person2 setName(String name) {
		this.name = name;
		return this;
	}

	public Person2 setAge(int age) {
		this.age = age;
		return this;
	}

	public Person2 setNationality(String nationality) {
		this.nationality = nationality;
		return this;
	}

	public void sayHello() {
		System.out.println(nationality + " 에 사는 " + age + "살 " + name);
	}
}
