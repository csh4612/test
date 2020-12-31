package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest2 {
	
	public static void main(String[] args) {
//		맵은 순서보다 키와 벨류값이 중요할 때 사용
		Map<String, String> computer1 = new HashMap<String, String>();
		computer1.put("cpu", "i7 10세대");
		computer1.put("ram", "32GB");
		computer1.put("ssd", "1TB");
		computer1.put("vga", "GTX-3080");
		computer1.put("price", "600만원");
		
		Map<String, String> computer2 = new HashMap<String, String>();
		computer2.put("cpu", "i7 8세대");
		computer2.put("ram", "16GB");
		computer2.put("ssd", "2TB");
		computer2.put("vga", "GTX-1080");
		computer2.put("price", "400만원");
		
//		리스트는 순서가 중요할 때 사용
//		List<String> computerSpecs = new ArrayList<String>();
//		computerSpecs.add("i7 10세대");
//		computerSpecs.add("32GB");
//		computerSpecs.add("1TB");
//		computerSpecs.add("GTX-3080");
//		computerSpecs.add("600만원");
		
//		컴퓨터 사향보다는 컴퓨터의 갯수같은 순서 컴퓨터 1대, 2대, 3대 ..
		List<Map<String, String>> pcList = new ArrayList<Map<String, String>>();
		pcList.add(computer1);
		pcList.add(computer2);
		
		System.out.println("cpu, ram, ssd, vag, price");
		for(Map<String,String> computer : pcList) {
			System.out.print(computer.get("cpu") + ",");
			System.out.print(computer.get("ram") + ",");
			System.out.print(computer.get("ssd") + ",");
			System.out.print(computer.get("vga") + ",");
			System.out.println(computer.get("price") );
		}
		
	}
}
