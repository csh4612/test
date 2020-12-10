package test05;

import java.util.Scanner;

public class ScanTest3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가장 좋아하는 축수 선수는 : ");
		String Player = scan.nextLine();
		
		String[] names = {"송흥민","손흔민","손흥밍","손날두"};
		// 대체가능 String[] names = new String("최상혁");
		
		for(int i=0; i<names.length; i++) {
			if(names[i].equals(Player)) {
				System.out.println("손흥민을 검색하신건가요?");
			}
		}
		
//		System.out.println(names[0].equals(Player));
		
		
//		String str = "박경훈";
//		String str2 = new String("박경훈");
//		System.out.println(str.equals(str2)); 트루
//		System.out.println(str==str2); 펄스

		
//		Scanner s = new Scanner(System.in);
//		System.out.print("이름 : ");
//		String name = s.nextLine();
//		System.out.println("박경훈".equals(name));  //트루, 
		
	}	

}
