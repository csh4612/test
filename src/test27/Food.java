package test27;

public class Food {
	private String name;
	private int price;
	private String type;
	
	public Food(String name, int price, String type) {
		this.name = name;
		this.price = price;
		this.type = type;
	}
	public String toString() {
		return "이 음식은 " + name + "이고 가격은" + price + "이며" + type + "입니다.";
	}
}

class Exe{
	public static void main(String[] args) {
		Food f1 = new Food("설렁탕", 10000, "한식");
		System.out.println(f1);
		Food f2 = new Food("피자", 20000, "양식");
		System.out.println(f2);
		Food f3 = new Food("스시", 30000, "일식");		
		System.out.println(f3);
	}

	
}
