package test09;

import java.util.Random;

public class FindBomb {
	public static void main(String[] args) {
		String[][] boms = new String [2][2];
		
//		boms[0][0] = 1+"";
//		boms[0][1] = "폭탄"; int는 불가능
		
		int max = boms.length * boms[0].length;
		
		Random r = new Random();
		int rNum = r.nextInt(max)+1;
		
		for(int i=0; i<boms.length; i++) {
			for(int j=0; j<boms[i].length; j++) {
				
			}
		}
		
	}

}
