package test09;

public class MultipleArray {
	public static void main (String[] args) {
		/*MultipleArray
		 * 다중 배열 
		 * int [] nums = new int [3];
		 * 1차원 배열은 반드시 방 갯수를 알려줘야한다.
		 * 2차원 배열은 상관없음
		 * int [][][] nums = new int [][][];
		 * 3차원 배열
		 */
		
		int [][] nums = new int[3][3]; // 0-2 층, 0-2 방 , 총 9방
		/* 1차원 배열
		 * int[] nums = new int[3];
		 * int[0] = 데이터 타입 int
		 * 2차원 배열
		 * int [] nums1 = new int [3][3];
		 * int [층] = 데이터 타입은 int배열,  nums[0] = new int[3];
		 * int [층][방] = 데이터 타입은 int, nums[0][0] = 3;
		 * 
		 * int [][] nums = new int[4][3];
		 * nums[0] = new int[4]; 0층의 방이 3개인 것을 4개로 바꿈
		 */
		
	    int cnt = 1;
	    // nums에 대입하는 반복문
		for(int i=0; i<nums.length; i++) {			
			for(int j=0; j<nums[i].length; j++) {
				nums[i][j] = cnt++;			
			}
		}
		// nums의 값 출력하는 반복문
		for(int i=0; i<nums.length; i++) {			
			for(int j=0; j<nums[i].length; j++) {
				System.out.println(nums[i][j]);		
			}
		}
		
		
	}
}

