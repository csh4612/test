package test22;

public class Test1 {
	
	public String toString() {
		return "이제 오브젝트의 toString()이 아니라 이게 출력";
	}
	
	public static void main(String[] args) {
		int i=1;
		String str = (i==1) ? "1이네" : "1이아니네";
		System.out.println(str);
		
//		String str = (i==1) ? "1이네" : (i==2) ? "2이네" : "1,2 다 아니네";
//		System.out.println(str);  // if eles로 끝나느 로직에만 3학년 단자를 많이 씀
		
		Test1 t = new Test1();
//		String s = (t==null) ? null : t.toString();
		System.out.println(t);
		
		
	}

}
