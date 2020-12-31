package test23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodList {
	public static void main(String[] args) {
		Map<String,String> f1 = new HashMap<String,String>();
		f1.put("음식명","마카롱");
		f1.put("가격","2000");
		f1.put("칼로리","200k");
		f1.put("종류","디저트");
		
		Map<String,String> f2 = new HashMap<String,String>();
		f2.put("음식명","마라탕");
		f2.put("가격","14000");
		f2.put("칼로리","1500k");
		f2.put("종류","중식");
		
		Map<String,String> f3 = new HashMap<String,String>();
		f3.put("음식명","치킨");
		f3.put("가격","15000");
		f3.put("칼로리","2000k");
		f3.put("종류","한식");
		
		Map<String,String> f4 = new HashMap<String,String>();
		f4.put("음식명","초밥");
		f4.put("가격","20000");
		f4.put("칼로리","600k");
		f4.put("종류","일식");
		
		List<Map<String,String>> foodList = new ArrayList<Map<String,String>>();
		foodList.add(f1);
		foodList.add(f2);
		foodList.add(f3);
		foodList.add(f4);
		
		System.out.println(foodList);
		//foods 리스트의 각방이 있는 음식정보를 아래와같이 출력
		// [음식명: 마카롱, 가격:]
		
		for(int i=0; i<foodList.size();i++) {
			Map<String,String> food = foodList.get(i);
			System.out.println("[ 음식명 : " + food.get("음식명") + ", 가격 : " + food.get("가격") + "]");					
		}
	}

}
