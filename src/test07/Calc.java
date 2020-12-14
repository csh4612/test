package test07;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		String numStr1 = s.nextLine();
		System.out.print("연산자 : ");
		String op = s.nextLine();
		System.out.print("두번째 숫자 : ");
		String numStr2 = s.nextLine();
		// 1+2 = 3
		// +, -, *, /, %
		
		int i = Integer.parseInt(numStr1);
		int j = Integer.parseInt(numStr2);
		
		if(op.equals("+")) {
			System.out.println(i+j);
		}else if(op.equals("-")) {
			System.out.println(i-j);
		}else if(op.equals("*")) {
			System.out.println(i*j);
		}else if(op.equals("/")) {
			System.out.println(i/j);
		}else if(op.equals("%")) {
			System.out.println(i%j);
		}else {
			System.out.println("연산자 잘 못 입력했음");
		}
	}
}
