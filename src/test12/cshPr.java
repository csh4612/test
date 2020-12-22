package test12;

public class cshPr {
	static void setNums(int[] nums, int increse) {
		for(int i=0; i<nums.length; i++) {
			nums[i] = (i+1)*increse;
		}		
	}
	static void printNums(int[] nums) {
		for(int i=0; i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}	
	public static void main(String[] args) {
		int[] nums = new int[10];
		setNums(nums,100);
		printNums(nums);
	}


}
