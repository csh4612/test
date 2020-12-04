package test01;

public class condition2 {
	
	
	public static void main(String[] args) {
		int a = 300;
		int b = 200;
		
		if(a<100 || b<100) {			
			if(a<100 && b>100) {
				System.out.println("a만 100보다 작다.");
			}
		    else if(b<100 && a>100) {
		    	System.out.println("b만 100보다 작다.");
		    }
		    else if(a<100 && b<100) {
				System.out.println("a와 b는 모두 100보다 작다.");
			}
			
		}
		else if(a>100 || b>100) {
			if(a>100 && b<100) {
				System.out.println("a만 100보다 크다.");
			}
			else if(b>100 && a<100) {
				System.out.println("b만 100보다 크다.");
			}
			System.out.println("a와 b는 모두 100보다 크다.");
		}
		else {
			System.out.println("a와 b는 100이다");
		}
	}
	
}
