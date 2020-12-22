package test11;

public class MemberTest {
	String name; //멤버변수, 멤버필드, 메인 메소드 안에 똑같은 변수 설정 가능
	int age;
	boolean isWoman;
	// 선언만 가능, for print 등 실행 안됨
	
	void run() {
		
	}
	
	public static void main (String[] args) {
		
		// 클레스 명은 데이터타입으로 가능 MemberTest mt;
		MemberTest mt = new MemberTest();
		System.out.println(mt.name);
		System.out.println(mt.age);
		System.out.println(mt.isWoman);
	}

}
