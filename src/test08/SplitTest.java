package test08;

public class SplitTest {
	public static void main (String[] args) {
		
//		String str = "100,23,10,40"; // 구분자는 뭘 쓰던 상관없음. 특수기호는 조금 다르긴 함 나중에 알려주심
//		int idx = str.indexOf(","); // 몇번째 있는지 찾을때 indexOf
//		System.out.println(idx);
//		String str1 = str.substring(0,idx); //substring은 (0,idx) 0부터 idx = , 까지만 
//		System.out.println(str1);
//		
//		str = str.substring(idx+1);
//		idx = str.indexOf(",");
//		String str2 = str.substring(0,idx);
//		
//		System.out.println(str2);
		
		
//		String str = "1,2,3,4,5";
//		String[] strs = str.split(",");
//		System.out.println(strs.length);  // 방 갯수 물어본 문제
		
//		String str = "123,1";
//		int idx = str.indexOf(",");
//		System.out.println(idx);  // 콤마의 방 위치
		
		String str = "123,1";
		int idx = str.indexOf(",");
		System.out.println(str.substring(idx));
		
	}

}
