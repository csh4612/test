package test23;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	//for문을 사용해 1-10까지 strList에 add 하도록 하세요
	public static void main (String[] args) {
		List<String> strList = new ArrayList<String>();
		
//		strList.add("123");
		for(int i=1; i<=10; i++) {
			strList.add(i+"");
//			strList.add(String.valueOf(i));
		}
		
		for(int i=0;i<strList.size();i++) {
			System.out.println(strList.get(i));
		}
		
		
	}

}
