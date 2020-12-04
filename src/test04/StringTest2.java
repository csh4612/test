package test04;

public class StringTest2 {
	public static void main(String[] args) {
//		String str = "진석,상혁,은선,예린";
//		String[] names = str.split(",");  ,을 없애고 출력
//		
//		for(int i = 0; i<names.length;i++) {
//			System.out.println(names[i]);
//		}
//	}
		
		String str = "샴고양이코숏고양이페르시안고양이사막";
		
//		String[] catTypes = new String[4];
//		catTypes[0] = "샴";
//		catTypes[1] = "코숏";
//		catTypes[2] = "페르시안";
//		catTypes[3] = "사막";      같은 게  String[] catTypes = str.split("고양이");
		
		String[] catTypes = str.split("고양이");
		for(int i=0; i<catTypes.length;i++) {
			System.out.println(catTypes[i]);
		}

 }
}
