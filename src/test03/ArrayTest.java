package test03;

public class ArrayTest {
	public static void main(String[] args) {
		/*
		 *array 배열
		 *숫자 0부터 시작
		 *
		 * int[] nums = new int[갯수];
		 * 
		 * i<nums.length; (방갯수를 바꿔도 끝까지 출력되게)
		 */
		
		int[] nums = new int[3];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		
		
//		nums[3] = 2; 방 갯수 확인
		
		for (int i=0;i<nums.length;i++) {
		
			System.out.println(nums[i]);
		}
//	}
 }
}

