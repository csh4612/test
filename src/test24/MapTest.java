package test24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
	/*
	 * 제너럴 4가지
	 * K - key (맵), V - value (맵), T - type, E - element (리스트)
	 */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		// Map<K,V>
		map.put("이름","홍길동");
		map.put("나이","33");
		map.put("주소","서울 동대문구 회기동");
		
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
//		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
		
		
//		System.out.println(map);
//		System.out.println(map.get("이름"));
//		System.out.println(map.get("나이"));
//		System.out.println(map.get("주소"));
		
	}
}
