package test18;

public class Excute {
	public static void act(Action a) {
		a.eat();
		a.sleep();
		a.walk();
		a.run();
	}
	
	public static void main(String[] args) {
		Action a1 = new Animal();
		Action a2 = new Human();
		act(a1);
		act(a2);
	}

}
