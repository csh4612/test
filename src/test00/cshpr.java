package test00;

public class cshpr {
		//12월 18일 문제 1번 

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		
		for(int i=0; i<nums.length; i++) {
			if(i%2 == 0) {
				nums[i] = (i+1)*100;					
				} if(i%2 == 1) {
					nums[i] = (i+1)*10;
				} if(i==nums.length-1) {
					nums[i] = 10;
				}				
			}		
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}
}
