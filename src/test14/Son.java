package test14;
/*
 * 상속 extends
 */

class Mother{
	int money = 10000;
	String fName = "신";
	String lName = "미선";
}



public class Son extends Mother{
	int money = 1000;
	String lName = "상혁";
	
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s.fName + s.lName);
		
	}
}
	
	
	
