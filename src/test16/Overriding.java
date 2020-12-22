package test16;

class Father{
	void work() {
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
		f.work();
		
		Father s = new Son();
		s.work();
	}

}
