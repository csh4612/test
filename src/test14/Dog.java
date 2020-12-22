package test14;

class Animal{
	int age;
	String name;
	String type;
	int hight;
}
public class Dog extends Animal {
	public static void main(String[] args) {
		// Dog는 Animal이라고 부를 수 있다! (즉 Animal이 Dog보다 상위 개념)
		Animal a = new Dog();
		// Animal은 Dog라고 부를 수 없다! (Dog가 Animal의 상위개념이 아님!)
//		Dog d = new Animal();
		
		Animal a1 = new Dog();
		a1 = new Animal(); //이러면 if문이 실행 안됨.
		
		if(a1 instanceof Dog) {
			// a1 instanceof Dog = a1을 Dog라고 불러도되?
			
			System.out.println("동물 a1은 개입니다.");
		}else {
			System.out.println("a1은 개가 아니구나");
		}
		
		
	}
}
