package test10;

import java.util.Random;

public class FindMine {
	public static void main(String[] args) {
		int[] nums = new int[5];
		// int 배열의 경우 각 방에 0으로 초기화 됨
		String[] strs = new String[5];
		/* 원시형데이터가 아닌 참조형데이터 타입은 각 방이 null로 초기화 됨
		 빈 문자열과 null은 완전 다른것!!!!!
		if(strs[0]==null) {
			System.out.println("null임");
		} null확인 하는 방법
		*/
		Random r = new Random();
		int mineIdx = r.nextInt(strs.length)+1;
		// mineIdx 1-5까지 나옴
		// String str = 1+"";
		for(int i=0; i<strs.length; i++) {
			strs[i] = i+1+"";
			// strs 배열의 각방의 값과 mineIdx의 값이 같을 경우, 숫자대신 꽝을 넣기
			
			if(strs[i].equals(mineIdx+"")) {
//			다른방법 mineIdx == Integer.parseInt(strs[i])
				strs[i] = "꽝";				
			}			
			
		}
		
		for(int i=0; i<strs.length;i++) {
			System.out.println(strs[i]);
		}
		
		
	}
}
