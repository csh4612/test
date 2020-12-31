package test20;

import java.util.Scanner;

public class ExceptionTest {
	String str;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("당신의 나이는? : ");
		String numStr = s.nextLine();
		ExceptionTest et = new ExceptionTest ();
		
		try {
		int num = Integer.parseInt(numStr);
		System.out.println("당신의 나이는" + num + "이군요");
		System.out.println(et.str.equals("태새전환~"));
		} catch(NumberFormatException nfe) {
			System.out.println("숫자로 적으세요");			
		} catch(NullPointerException npe) {
			System.out.println("널 에러");
		}
		
		
	}

}
