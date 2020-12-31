package test23;


/*
 * 클래스에 fanal을 쓰면 상속 x
 * 메소드에 쓰면 오버라이딩 X
 * 변수에 쓰면 변수 고정
 */

final class Single{
	// 상속을 못해줌!!
}

class F{
	public final void test() {
		System.out.println("난 f의 테스트");
		//오버라이딩 안됨!!
	}
}

public class FinalTest extends F{
//	public final int NUMBER_TEXT =10;
//	이것도 가능
	
	public static void main(String[] args) {
		
		final int num = 10;
		// num을 고정!!
		
		
	}

}
