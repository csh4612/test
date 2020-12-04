package test04;

public class ArrayTest6 {
	public static void main (String[] args) {
		String[] menus = new String [3];
		
		/*
		 * 배열 단점 
		 * 데이터타입 1개
		 * 방갯수를 정해줘야한다.
		 * 공간 늘리기가 힘들다. 
		 */
		
		menus[0] = "아이스크림";
		menus[1] = "치킨";
		menus[2] = "피자";
		
		String[] tmpMenus = menus;
		
		menus = new String[4];
//		menus[0] = tmpMenus[0];
//		menus[1] = tmpMenus[1];
//		menus[2] = tmpMenus[2];
		
		for(int i=0; i<tmpMenus.length;i++) {
			menus[i] = tmpMenus[i];
		}
		
		menus[3] = "맥주"; 
		
		for(int i=0;i<menus.length;i++) {
			System.out.println(menus[i]);

		}		
	}
}
