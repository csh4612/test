package test21;

public class ArrayTest {
	
	
	public static void main (String[] args) {
		int[] nums = new int[1];
		nums[0] = 5;
		
		int[] tmp = nums;
		nums = new int[nums.length+1];
		
		for(int i=0; i<tmp.length; i++) {
			nums[i] = tmp[i];
		}
		
		nums[1] = 10;
		
		ArrayUtil.printArray(nums);
		
		
		
		
		
//		int [] nums = new int[1];
//		
//		int[] tmp = nums;
//		tmp[0] = 10;
//		nums = new int[2];
//		nums[0] = tmp[0];
//		nums[1] = 20;
//		System.out.println(nums[0]);  // 배열증가 하는 방법
	
		
		
	}
}
