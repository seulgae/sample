package ch04;

public class PersionDemo { // [정적 영역: 클래스 정보 로드됨]
	public static void main(String[] args) { // [정적 영역: main 메서드 코드]
		
        // [스택 영역] 참조변수 p 생성
        // [힙 영역] new Person()으로 인스턴스 생성 -> name, age, nationality 메모리 할당
		Person p = new Person();
		
        // 메서드 체이닝
        // setAge -> setName -> setNationality -> sayHello 호출
        // 인스턴스 변수(name, age, nationality)는 모두 [힙 영역]에 저장
		p.setAge(30)
         .setName("길태형")
         .setNationality("대한민국")
         .sayHello();
	}
}

class Person { // [정적 영역: 클래스 정보 로드됨]
	
    // [힙 영역: 인스턴스 변수] - new Person() 호출될 때 인스턴스마다 별도로 생성됨
	private String name;        
	private int age;            
	private String nationality; 

    // [정적 영역: 메서드 코드] - 메서드 자체는 공유되지만
    // this.name 등 인스턴스 변수는 [힙 영역]의 객체 참조
    public Person setName(String name) {
        this.name = name;
        return this; // 자기 자신 반환 -> 메서드 체이닝 가능
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
        System.out.println(
            nationality + "에 사는 " + name + " 입니다. 나이는 " + age + "입니다."
        );
    }
}