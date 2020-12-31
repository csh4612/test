package test24;

import java.util.ArrayList;
import java.util.List;

public class LoopTest {
	
	public static void main (String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		// 0 - 100, 1-200 -> 0에서 9번
		for(int i=0;i<10;i++) {
			int num = (i+1)*100;
			numList.add(num);
		}
		
//		Integer[] nums = new Integer[10];
//		for(int i=0;i<10;i++) {
//			int num = (i+1)*100;
//			nums[i] = num;
//		}
		System.out.println("for문");
		for(int i=0; i<numList.size();i++) {
			Integer n = numList.get(i);
			System.out.println(n);
		}
		System.out.println("향상된 for문");
		for(Integer n : numList) {
			System.out.println(n);
		}
		
		
		
	}
}
//		int [] nums = new int[0];
//		List<Integer> numList = new ArrayList<Integer>();
//		numList.add(10);
		
//		int[] nums =new int[3];
//		nums[0] =10;
//		nums[1] =20;
//		nums[2] = 30;
//		
//		 
//		for(int i=0;i<nums.length;i++) {
//			int num =nums[i];
//			System.out.println("nums[" + i + "] : " + num);
//		}
//		향상된 포문
//		for(int num : nums) {
//			System.out.println(num);
//		}
//		
//	}


