package test05;

import java.util.Scanner;

public class ScanTest4 {
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		String numStr1 = s.nextLine();
		System.out.print("두번째 숫자 : ");
		String numStr2 = s.nextLine();
		System.out.print("연산자 : ");
		String operator = s.nextLine();
		/*
		 * java 에서 더하기 + 연산자는
		 * 숫자랑 숫자 만나면 플러스
		 * 문자 숫자 만나면 연결
		 * 문자 문자 만나면 연결
		 * 
		 */
		
		int num1 = Integer.parseInt(numStr1);
		int num2 = Integer.parseInt(numStr2);
		if(operator.contentEquals("+")) {
			System.out.println(num1+num2);
		} else if(operator.contentEquals("-")){
			System.out.println(num1-num2);
		} else if(operator.contentEquals("/")){
			System.out.println(num1/num2);
		} else if(operator.contentEquals("*")){
			System.out.println(num1*num2);
		} else if(operator.contentEquals("%")){
			System.out.println(num1%num2);
		}
		
		
		
		
		
//		System.out.println(numStr1 + operator + numStr2 + " = ");
		
		
		
	}

}
