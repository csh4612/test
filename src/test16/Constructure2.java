package test16;

class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}
}

public class Constructure2 {
	int num;
	
	public static void main(String[] args) {
		Person p = new Person("김씨");
		System.out.println(p.name);
		Person p1 = new Person("최씨");
		System.out.println(p1.name);
	}

}
