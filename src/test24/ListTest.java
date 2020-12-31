package test24;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	/*
	 * JDK 자바 개발도구, JRE 자바 실행환경
	 * 
	 * K - Key
	 * V - Value
	 * T - Type
	 * E - Element  제너릭
	 */
	
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(100);
		Integer i = numList.get(0);
		
		List<String> strList = new ArrayList<String>();
		strList.add("");
		strList.get(0);
	}

}
