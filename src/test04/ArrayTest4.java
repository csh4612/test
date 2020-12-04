package test04;

public class ArrayTest4 {
	public static void main(String[] args) {
		String[] strs = new String[3];
		
		strs[0] = "거북이";
		strs[1] = "토끼";
		strs[2] = "고래";
		
		//위의 strs 각방의 값의 길이가 2인 것만 출력하는 반복문(for)를 작성
		
		
		for(int i=0;i<strs.length;i++) {
			 
			if(strs[i].length()==2) {
				for(i=0;i<strs.length;i++) {
					System.out.println(strs[i]);
			}
				
				/*
				 * 배열은 length 메서드가 없음
				 * String 길이를 알 수 있는데 length 속성이 없다.
				 * length 메서드만 가지고 있다.
				 * 
				 */
			
		
		}
		 				
		}
		
	}

}
