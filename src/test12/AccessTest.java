package test12;
//접근 범위가 큰 순서: public > protected > default(접근제어자 안쓰면 default) > private

class Money{
	int coin;
	
	
	
}

public class AccessTest {
	public static void main(String[] args) {
		

		Money m = new Money();
		System.out.println(m.coin);
	}
	
}
