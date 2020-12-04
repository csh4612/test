package test02;

public class loop4 {
	public static void main(String[] args) {
		int num1 = 1;
		for(;num1<=9;num1++) {
			System.out.println("==== " + num1+ "단 ====");
			for(int num2 = 1 ; num2<=9 ; num2++) {
				System.out.println(num1 + "x" + num2 + "=" + num1*num2);
			}
		}
	}


}
