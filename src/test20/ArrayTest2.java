package test20;

class Dog{
	String name;
	int age;
	String type;
}

public class ArrayTest2 {
	
	
	public static void main(String[] args) {
		String[] names = {"1세","2세","3세","4세"};
		int[] ages = {2,4,6,8};
		String[] types = {"시바견","요쿠셔","슈나우져","웰시코기"};
		
		Dog[] dogs = new Dog[3];
		
		for(int i=0;i<3;i++) {
		double d = Math.random()*names.length;
		int num = (int)d;
		
		Dog dog = new Dog();
		
		dog.name = names[num];
		dog.age = ages[num];
		dog.type = types[num];
		
		dogs[i] = dog;
		}
		
		/*
		 * 강아지 3마리를 가질수 있는 별수를 만들어서
		 * 위에 포문을 잘 함해보세요
		 */
		for(int i=0;i<3;i++) {
		System.out.println(dogs[i].name);
		System.out.println(dogs[i].age);
		System.out.println(dogs[i].type);
		}
		
	}
}
