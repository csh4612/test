package test01;

public class condition {
	
	public static void main(String[] args) {
		
		boolean higher;
		int num1 = 200;
		int num2 = 200;
		
		higher = num1 >= num2;
		System.out.println(higher);
		
		higher = num1 <= num2;
		System.out.println(higher);
		
		
		int hour = 3;
		if(hour<3) { 
			System.out.println("3시 전이면 아직 아침이지~");
		}
		else { 
			System.out.println("3시네, 밥먹자~");
		}
	
		
	
	}

}
