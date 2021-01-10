package test27;

public class Human {
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "내 이름은" + name + "이고" + age + "살 입니다.";
	}

}

class Exe1{
	public static void main(String[] args) {
		Human h = new Human("김길동",1);
		System.out.println(h);
	}
}
