package test12;

public class Person {
	
	String name;
	int age;
	
	void eat() {
		System.out.println(name + "이 밥을 먹습니다.");
	}
	
	void sleep() {
		System.out.println(name + "이 잠을 잡니다.");
	}
		
	public static void main (String[] args) {
//		Person[] persons = new Person[17];
		
		Person p = new Person();
		p.name = "홍길동";
		p.age = 30;
		p.eat();
		p.sleep();
		
		
		
	}	

}
