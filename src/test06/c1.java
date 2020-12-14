package test06;

import java.util.Random;

public class c1 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int[] l = new int[6];
				
				
		for(int i=0; i<l.length; i++) {
			int l2 = r.nextInt(45)+1;
			l[i] = l2;
			
			for (int j=i-1; j>=0; j--) {
				if(l2==l[j]) {
					i--;
					break;
					
				}
			}
		}
		
		for(int i=0;i<l.length; i++) {
			System.out.println(l[i]);
		}
	}

}
