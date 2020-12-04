package test03;

public class SortTest {
	public static void main(String[] args) {
		/*
		 * Sort 정렬
		 */
		
		int[] ages = new int[3];
		
		ages[0] = 10;
		ages[1] = 5;
		ages[2] = 22;
		//10, 5, 22
		
		int tmp = ages[0];
		ages[0] = ages[2];
		ages[2] = tmp;
		// 22, 5, 10
		tmp = ages[1];
		ages[1] = ages[2];
		ages[2] = tmp;
		// 22, 10, 5
		
		
		
		
		for (int i=0; i<ages.length;i++) {
			System.out.println(ages[i]);
		}
	}
}
