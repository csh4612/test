package test23;

import java.util.ArrayList;
import java.util.List;

public class ListTest4 {
	
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		
		for(int i=10; i>=-10; i--) {
			strList.add(i +"");
		}
			
		System.out.println(strList);
		
		
		//1, -2, 3, -4, 5, -6, 7, -8, 9, -10
		strList = new ArrayList<String>();
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				strList.add(i*-1 +"");
			}else {
				strList.add(i+"");
			}
		}
		System.out.println(strList);
		
	}
}
