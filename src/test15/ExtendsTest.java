package test15;

public class ExtendsTest {
	
	public static void main(String[] args) {
		/* 지금 구조
		 *  Singer
		 *   - HipHopSinger
		 *    -Ssamd
		 *    -Momyson
		 */
		
		Singer s = new HipHopSinger();
		s = new Ssamd();
		s = new Momyson();
		/*
		 * 위의 상속관계를 보면
		 * Singer가 제일 상위 그 하위클래스 (Singer를 상속받은 애들)
		 * 은 모두다 Singer 데이터 타입의 변수에 대입가능!
		 */
		
		HipHopSinger hhs = new Ssamd();
		hhs = new Momyson();
		/*
		 * HipHopSinger 역시도 Momyson과 Ssamd가 상속을 받아서
		 * Momyson, Ssamd 모두 HipHopSinger라고 불러도 된다.
		 */
		
		Ssamd ss = new Ssamd();
		Momyson m = new Momyson();
		/*
		 * 당연한 이야기지만 Ssamd는 Ssamd라고
		 * Momyson은 Momyson이라고 불러도 된다.
		 */
		
		HipHopSinger hhs1 = new HipHopSinger();
		Ssamd ss1 = (Ssamd) hhs1;
		System.out.println("오류없음");
	
//		다운캐스팅 예시
//		Singer s = new Ssamd();
//		System.out.println(s.rapStyle);
//		Ssamd ss = (Ssamd)s; //다운캐스팅
//		System.out.println(ss.rapStyle);
//		
//		byte b = 127;
//		short s = b;
//		int i = s;
//		long l =i;
//		
//		long l - 127;
//		int i = (int)l;
//		short s = (short)i;
//		byte b = (byte)s;
//		System.out.println(b);
	}
	

}
