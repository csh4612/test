package test20;

class Father{
	void work() {
		System.out.println("아빠 일");
	}
}

class Son extends Father{
	void work() {
		System.out.println("아들 일");
	}
	
}

class Daughter extends Father{
	void makeUp() {
		System.out.println("딸 화장");
	}
	void work() {
		System.out.println("딸 일");
	}
	
}

public class Execute {
	// 아들 1명, 딸 2명
	
	public static void main(String[] args) {
		Son s = new Son();
		
		Daughter d1 = new Daughter();
		Daughter d2 = new Daughter();
		
//		Daughter [] ds = new Daughter[2];
//		ds[0] = d1;
//		ds[1] = d2;   //딸들
		
		Father[] fs = new Father[3];
		fs[0] = s;
		fs[1] = d1; 
		fs[2] = d2;  // 아빠의 자식들, 업 캐스팅
		
		for(int i=0; i<fs.length; i++) {
			if(fs[i] instanceof Daughter) { //다운캐스팅
				Daughter d = (Daughter)fs[i];
			    d.makeUp();
			}
			
			fs[i].work();
		}
		
	}
	

}
