package test09;

import java.util.Random;
import java.util.Scanner;

public class MatchNumber2 {
	public static void main (String[] args) {
		/*
		 * 업앤다운 1-50
		 */
		Random r = new Random();
		int targetNum = r.nextInt(50)+1;
		Scanner s = new Scanner(System.in);
		
		for(int i=1; i<=50;i++) {
			System.out.print("읇어봐 : ");
			int myNum = Integer.parseInt(s.nextLine());
			/*
			 * 3가지의 경우의 수, 업 다운 정답
			 */
			
			if(targetNum>myNum) {
				System.out.println("업!");
			}else if(targetNum<myNum) {
				System.out.println("다운!");
			}else {
				System.out.println("정답!");
				break;
			}
			
		}
	}

}
