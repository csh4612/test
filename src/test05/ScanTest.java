package test05;

import java.util.Scanner;

public class ScanTest {
	public static void main(String[] args) {
		
		/*
		 * Scan : 
		 * 
		 * 입력/ 출펵 = Input/Output = I/O
		 * 
		 * 참초형 데이터 타입 Scanner
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 살이니?");
		
		String str = scan.nextLine();
		/*
		 * str 일반적이라면
		 * 1살보다 크거나 같고 200살보다 작은 숫자가 들어와야 일반적!!
		 * 위에 조건을 만족했을 경우는 정상입력!
		 * 아닐 경우에는 나이가 제멋대로 이네 이짜슥!
		 */
						
		System.out.println("니 나이 : " + str);
		int age = Integer.parseInt(str);
		if(age>=1 && age<200) {
			System.out.println("정상입력!!");
		} else {
			System.out.println("비정상입력!!");
		}
		
		
//		String numStr = "200";
//		// num을 인트로 바꿀수 없나?
//		// parse : 분석하다 , load: 읽다
//		
//		int num = Integer.parseInt(numStr);
//		
//		System.out.println(0<num);
//		System.out.println(num);
//		
//		num = Integer.parseInt("200백");
//		System.out.println(num);
		
		
	}

}
