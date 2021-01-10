package test27;

public class Execute1 {
	public static void main(String[] args) {
		MobilePhone mp = new MobilePhone("레이저",300000,"모터롤라","skt");
		
		MobilePhone sp = new SmartPhone("노트10",1000000,"삼성","kt");
		
//		System.out.println(mp);
//		System.out.println(sp);
		
		mp.send("010-0000-0000");
		sp.send("010-0200-0000");
		sp.pickUp();
		
		System.out.println(sp instanceof SmartPhone);
		System.out.println(mp instanceof SmartPhone);
		
		if(sp instanceof SmartPhone) {
			SmartPhone sp2 = (SmartPhone) sp;
			sp2.dokakao("요즘 카카오를 몰라?");
		}
		
		
	}

}
