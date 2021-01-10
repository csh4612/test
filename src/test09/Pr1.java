package test09;

import java.util.Random;

public class Pr1 {
	public static void main(String[] args) {
		String[][] bombs = new String [2][2];
		
		int max = bombs.length * bombs[0].length;
		Random r = new Random();
		int rNum = r.nextInt(max)+1;
		
		for(int i=0; i<bombs.length; i++) {
			for(int j=0; j<bombs[i].length; j++) {
				
				bombs[i][j] = rNum+"";
				
//				bombs[i][j] = i*bombs[i].length+1+j+"";
				
				System.out.println(bombs[i][j]);
			}
		}
	}

}
