package test23;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
	
	public static void main (String[] args) {
		List<String> strList = new ArrayList<>();
		
		strList.add(2+"");
		for(int i=0; i<9; i++) {
			strList.add((Integer.parseInt(strList.get(i)) * 2) +"");
		}
		
		System.out.println(strList);
		
		
//		for(int i=2; i<=1024; i*=2) {
//			strList.add(i+"");
//		}
//		
//		System.out.println(strList);
		
		
	}
}
