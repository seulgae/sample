package ch04;

public class PersionDemo {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.setAge(30).setName("길태형").setNationality("대한민국").sayHello();
		
	}
}

class Person {
	private String name;
	private int age;
	private String nationality;
	
    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public Person setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }
	
	public void sayHello() {
		System.out.println(nationality+"에 사는 " + name + " 입니다." + " 나이는 " + age + "입니다.");
	}
	
}
