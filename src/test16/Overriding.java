package test16;

class Father{
	void work(String str, int i) {
		System.out.println("아빠가 일합니다.");
		
	}
}
class Son extends Father{
	void work() {
		System.out.println("아들이 일합니다.");
	}
}

public class Overriding {
	
	public static void main (String[] args) {
		Father f = new Father();
		f.work("",1);
		
	    Son s = new Son();
		s.work("",2);
		s.work();
	}

}
