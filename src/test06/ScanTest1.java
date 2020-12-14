package test06;

import java.util.Scanner;

public class ScanTest1 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		String str1 = scan.nextLine();
		System.out.print("연산자 : ");
		String op = scan.nextLine();
		System.out.print("두번째 숫자 : ");
		String str2 = scan.nextLine();
		
		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
		
		/*
		 * String 비교시 == 은 안됨, equals를 사용!!!
		 */
		
		if(op.equals("+")) {
			System.out.println(n1+n2);
		}else if(op.equals("-")) {
			System.out.println(n1-n2);
		}else if(op.equals("*")) {
			System.out.println(n1*n2);
		}else if(op.equals("/")) {
			System.out.println(n1/n2);
		}
		
	
		
		
		/*
		 * 카멜케이스 = nextLine 
		 * class = 첫글자 대문자 두단어가 합쳐졌을때 두번째 단어의 첫글자는 대문자
		 * variabel(변수) = 첫글자는 무조건 소문자, 두단어가 함쳐졌을때 두번째 단어의 첫글자는 대문자
		 * method = 뒤에 ()가 붙음, 첫글자는 무조건 소문자, 두단어가 함쳐졌을때 두번째 단어의 첫글자는 대문자
		 * 
		 */
		
		/*
		 * String 문자열을 int로 변환
		 * String sn1 = "15";
		 * String sn2 = "15";
		 * int n1 = Integer.parseInt(sn1);
		 * int n2 = Integer.parseInt(sn2);
		 * System.out.println(n1+n2);
		 */
	}

}
