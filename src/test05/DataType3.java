package test05;

import java.util.Random;

public class DataType3 {
	public static void main (String[] args) {
		
		/*
		 *  난수 = 무작위 숫자
		 *  1- 45 까지의 중복되지 않는 랜덤의 숫자 6개
		 *  
		 *  데이터 타입이 대문자면 참조형 
		 *  int number; 원시형
		 *  String str; 참조형
		 *  
		 *  ctrl + shift + O  하면 import java.util.Random; 이 나타나서 Random을 사용할 수 있음.
		 */
		
//		int[] nums = new int[2];
//		nums[0] = 100;
//		System.out.println(nums[0]);
//		nums = new int[2];
//		System.out.println(nums[0]);
		
//		String Str= "123";
//	    String Str = new String("123"); 
//		참조형은 원래 new 데이터타입(); 해야하는데 String은 자주써서 그냥 사용가능
	    
		Random ran = new Random();
		
//		for(int i=1; i<=100000000;i++) {
//			int rNum = ran.nextInt(45)+1;
//			if(rNum==0) {
//				System.out.println("0 안나온다면서");			
//			}			
//		}
//		System.out.println("0 안나오네");			

		
		System.out.println(ran.nextInt(45)+1);
		
	}

}
