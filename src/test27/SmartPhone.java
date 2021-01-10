package test27;

public class SmartPhone extends MobilePhone{
	public SmartPhone(String name, int price, String vendor, String serviceVendor) {
		super(name, price, vendor, serviceVendor);
		
	}
	public void dokakao(String msg) {
		System.out.println(serviceVendor + "를 통해서 카카오로 메세지를 보냄");
	}

}
