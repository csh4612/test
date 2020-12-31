package test23;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
		// Map 은 키와 벨류, list는 구성원
		// List 인터페이스를 구현하고 있는 대표적인 클래스 2개
		// - ArrayList : 배열과 비슷함, 순서를 가지고 있음.
		// - LinkedList : 비슷한데 순서를 갖고 있는게 아니고 각각이 앞뒤를 알고 있어서 순서대로 출력 가능
		// Map 인터페이스를 구현하고 있는 대표적인 클래스 2개
		// - HashMap : 키와 값이 중요하지 순서가 중요하지 않음
		// - LinkedHashMap : 키와 값이 중요하고 각각이 앞뒤를 알고 있어서 순서대로 출력 가능
		
		Map<String,String> human = new HashMap<String,String>();
		human.put("이름","홍길동");
		human.put("나이", "22");
		human.put("주소", "서울");
		human.put("직업", "개발자");
		System.out.println(human);
		System.out.println(human.get("이름"));
		
		//LinkedHashMap, 앞뒤가 뭐가 있는지 알아서 put한 순서대로 나옴
		Map<String,String> human1 = new LinkedHashMap<String,String>();
		human1.put("이름","홍길동");
		human1.put("나이", "22");
		human1.put("주소", "서울");
		human1.put("직업", "개발자");
		System.out.println(human1);
		System.out.println(human1.get("이름"));
	}

}
