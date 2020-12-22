package test00;

public class chspr33 {
	public static void main(String[] args) {
		String numStr = "1,200";
		boolean isNum = false;
		
		for(int i=0; i<numStr.length();i++) {
			String fStr = numStr.substring(i,i+1);
			if(fStr.equals("0")||fStr.equals("1")||fStr.equals("2")||
			   fStr.equals("3")||fStr.equals("4")||fStr.equals("5")||
			   fStr.equals("6")||fStr.equals("7")||fStr.equals("8")||
			   fStr.equals("9")) {
				isNum= true;
			}else {
				isNum= false;
			}if(!isNum) {
				break;
			}
		}
		
		if(isNum) {
			int num = Integer.parseInt(numStr);
			System.out.println(num);
		}else {
			System.out.println("종료");
		}
		
	
		
			
	
	}
}
