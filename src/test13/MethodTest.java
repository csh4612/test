package test13;

class Bear{
	
}
class Water{
	
}


public class MethodTest {
	//오버로딩!!
	void drink(Water b) {
		System.out.println("아 배불러~~");
	}
	void drink(Bear b) {
		System.out.println("아 취불러~~");
	}
	
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
	}

}
