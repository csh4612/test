package test09;

public class MatchNumber {
	public static void main (String[] args) {
		int[] nums = {1,1,1,2,2,3,4,5};
		int[] fNums = {1,2,6};
		int[] cnts = new int [fNums.length];
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<fNums.length; j++) {
				if(nums[i]==fNums[j]) {
					cnts[j]++;
				}
			}
//			if(nums[i]==fNums[0]) {
//				cnts[0]++;
//			}     1월 시험
//			if(nums[i]==fNums[1]) {
//				cnts[1]++;
//			}
		}
		for(int i=0; i<fNums.length; i++) {
			System.out.println(fNums[i] + ":" + cnts[i]);

		}
//		System.out.println(fNums[0] + ":" + cnts[0]);
//		System.out.println(fNums[1] + ":" + cnts[1]);
		
		/*
		 *  alt + shift + d, j 디버깅
		 *  값을 알고싶으면 ctrl + shift + i
		 *  논리 알고 싶으면 드레그 하고 똑같이
		 *  f6누르면 진행 , f8은 확인안하고 다 진행
		 *  
		 */
		
	}
}
