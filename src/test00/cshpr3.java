package test00;

import java.util.Scanner;

public class cshpr3 {
	//12월 18일 문제 4번 

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자나 문자를 입력해주세요 : ");
		int num = Integer.parseInt(s.nextLine());
//		String numStr = s.nextLine();
		
		boolean b = false;
		
		for(int i=0; ;i++) {
			if(num==i) {
				b = true;
				break;
			}
//			if(numStr.equals(i+"")) {
//				b = true;
//				break;
//			}
		}
		
		if(b) {
//			System.out.println(numStr);
			System.out.println(num);
		}else {
			System.out.println("종료");
		}
	}
}
