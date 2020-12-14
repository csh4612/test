package test06;

import java.util.Random;

public class LottoTest {
	public static void main (String[] args) {
		
		/*
		 * 원시형 데이터 타입 (정해져있던 것) = 문자 , 숫자, 논리 
		 * 문자 = char
		 * 숫자
		 *  - 정수 = byte, short, int, long
		 *  - 실수 = float, double
		 * 논리 = boolean
		 * 
		 * 이것빼고는 참조형
		 */
		
		
//		Random r = new Random();
//		int n1 = r.nextInt(45)+1; //==> 0~44까지 나옴 그래서 +1
//		
//		int [] nums = new int[6];
//		
//		for (int i=0; i<nums.length; i++) {
//			nums[i] = r.nextInt(45)+1;
//		}
//		
//		
//		for (int i=0; i<nums.length; i++) {
//			System.out.println(nums[i]);
//		}
//		
		Random r = new Random();
		int[] nums = new int[6];
		for(int i = 0;i<nums.length;i++) {
			nums[i] = r.nextInt(6)+1;
			for(int j=0; j<i;j++) {
				if(nums[i]==nums[j]) {
					i--;
					break;
					}
			}
		}
		
		for (int i=0; i<nums.length; i++) {
		System.out.println(nums[i]);
	}
	
		
	}

}
