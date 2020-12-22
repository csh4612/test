package test09;

public class MultipleArray2 {
	public static void main(String[] args) {
		int[][] nums = new int[3][3];
		
		for(int i = 0; i<nums.length; i++) {
			for(int j = 0; j<nums[i].length; j++) {
				nums[i][j] = i*nums[i].length+1+j;					
				}				
			}
		
		/*
		 * 7 8 9
		 * 4 5 6
		 * 1 2 3
		 */
		  
		
		for(int i = 0; i<nums.length; i++) {
			for(int j = 0; j<nums[i].length; j++) {				
				System.out.println(nums[i][j]);					
			}
		}
		
	}
}
