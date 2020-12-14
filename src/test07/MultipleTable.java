package test07;

import java.util.Scanner;

public class MultipleTable {
	public static void main (String[] args) {
		// 구구단 이중포문으로 구현하여 출력
		// Scanner를 사용하여 값을 입력받은 뒤에
		// 예를 들어 3을 입력받았따면 1단부터 3단까지만 나오면 된다.

		Scanner s = new Scanner(System.in);
		System.out.print("몇단까지 출력할까요? : ");
		String numStr = s.nextLine();
		
		
		int num = Integer.parseInt(numStr);
		
		
		for(int i =1; i<=num; i++) {
			System.out.println("===" + i + "단 ===");
			
			  for(int j = 1; j<10; j++) {
					System.out.println(i + "X" + j + "=" + (i*j));
				}
			}
		}
				
	}

