package test22;

class Parent{
	void drive() {
		System.out.println("drive");
	}
}
class Child extends Parent{
	void playGame() {
		System.out.println("game");
	}
}
public class test{
	public static void main(String[] args) {
		Child c = new Child();
		c.drive();
		c.playGame();
	}
}

	


