package test07;

import java.util.Scanner;

public class csh {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("몇 단까지 출력할까요? : ");
		String str1 = s.nextLine();
		System.out.print("몇 자리 숫자까지 출력할까요? : ");
		String str2 = s.nextLine();
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		
		for(int i =1; i<=num1; i++) {
			System.out.println("=== " + i + "단 ===");
			    for(int j = 1; j<=num2; j++) {
					System.out.println(i + " X " + j + " = " + (i*j));
				}
			}
	}

}
