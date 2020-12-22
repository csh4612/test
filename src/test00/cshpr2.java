package test00;

import java.util.Random;

public class cshpr2 {
	/*오버로딩이란? 문제 3번
	 * 1. 같은 영역에서 메소드명이 같아야한다
	 * 2. 리턴타입 상관업음
	 * 3. 매개변수의 데이터타입이 다르거나 갯수가 다르거나
	 * 데이터타입과 갯수가 다르다고 해도 순서가 바뀌면 된다.
	 */
	
	//12월 18일 문제 2번 

	public static void main(String[] args) {
		Random r = new Random();
		int[] sameNumber = new int[4];
		
		for(int i=0; i<sameNumber.length; i++) {
			sameNumber[i] = r.nextInt(10)+1;
//			for(int j=i-1;j>=0 ; j--) {
//				if(sameNumber[i]!=sameNumber[j]) {
//					i--;
//					break;
//				}				
//			}			
		}		
		for(int i=0; i<sameNumber.length; i++) {
			System.out.println(sameNumber[i]);
		}		
	}
}


