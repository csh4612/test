package test17;
class ConT{
	int num = 20;
	public ConT() {
		test();
		System.out.println(num);
	}
	void test() {
		System.out.println("hi~");
	}
}

public class ConTest extends ConT {
	int num = 10;
	public ConTest() {
		System.out.println(num);
	}
	void test() {
		System.out.println("hi~");
	}
	
	public static void main(String[] args) {
		ConTest ct = new ConTest();
	}

}
