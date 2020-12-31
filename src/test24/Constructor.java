package test24;

public class Constructor {
	
	Constructor(){
		System.out.println("메모리를 생성할때마다 실행됨.");
		// 생성자의 대소문자는 동일해야한다.
		// 오버로딩도 가능, 
		// void Constructor(){} 이건 메소드
	}
	Constructor(int i){
		System.out.println("나는 다른 생성자");
	}
	
	public static void main(String[] args) {
//		Constructor c = new Constructor();
//		System.out.println("프로그램 실행");
		
//		Constructor c1 = new Constructor();  새로 메모리를 만들어서
//	    Constructor c2 = new Constructor();  서로 같지 않음
//	    System.out.println(c1==c2);          펄스!!, 그래서 이퀄을 사용 c1.equals(c2)
		
		new Constructor();  // 메모리 생성  new 생성자();
		new Constructor(2); // 생성자는 메모리를 생성할때만 실행 가능함!!!!!
	}

}
