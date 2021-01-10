package test27;

public class MobilePhone {
	private String name;
	private int price;
	private String vendor;
	protected String serviceVendor;
	
	public MobilePhone(String name, int price, String vendor, String serviceVendor) {
		this.name = name;
		this.price = price;
		this.vendor = vendor;
		this.serviceVendor = serviceVendor;
	}
	public String toString() {
		String str = "폰 이름: " + name + "\r\n";   // \t 하면 띄어짐, \r\n 은 엔터
		str += "가격: " + price + "\r\n";
		str += "제조사: " + vendor + "\r\n";
		str += "통신사: " + serviceVendor + "\r\n";
		return str;
	}
	public void send(String phoneNumber) {
		System.out.println(serviceVendor + "통신사를 통해" + phoneNumber + "로 전화를 겁니다.");
	}
	public void pickUp() {
		System.out.println(serviceVendor + "통신사를 통해 전화를 받습니다.");
	}
	
	public static void main(String[] args) {
		MobilePhone mp = new MobilePhone("노트10",1000000,"삼성","kt");
		System.out.println(mp);
		mp.send("010-0000-0000");
	}
}
