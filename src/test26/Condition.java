package test26;

public class Condition {
	
	public static void main(String[] args) {
		// 책 18p
//		String str = "1";
//		if(str=="2") {
//			
//		}
//		
//		Condition c = new Condition();
//		if(c==new Condition()) {
//			
//		}
//		
//		double db =1.1;
//		if(db==1.3) {
//			
//		}
		
		
		int age = 21;
		if(age/10==0) {
			System.out.println("유아기");
		}else if(age/10==1) {
			System.out.println("질풍노도의 청소년");
		}else if(age/10==2) {
			System.out.println("사회생활 병아리");
		}else if(age/10==3) {
			System.out.println("인생의 쓴맛을 알 나이");
		}else if(age/10>=4) {
			System.out.println("인생의 허망함을 알 나이");
		}
		
		int gener = age/10; // "1"
		switch(gener) { // whitch문의 () 는 정수만 됨, 1.7이상부터 String, char 도 됨
		    case 0 : //"1" :
			System.out.println("유아기");
			break;
			
		    case 1 : //"2" :
			System.out.println("질풍노도의 청소년");
			break;
			
		    case 2 : //"3":
			System.out.println("사회생활 병아리");  //break가 없으면 아래를 다 실행
						
		    case 3 : //"4" :
			System.out.println("인생의 쓴맛을 알 나이");
						
		    default : //default : // if문의 else 와 같음
			System.out.println("인생의 허망함을 알 나이");
			
		}
		
		
		
	}

}
