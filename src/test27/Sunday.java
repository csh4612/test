package test27;

import java.util.ArrayList;
import java.util.List;

public class Sunday {
	/*
	 * 생성자 일반 적으로는 public을 사용
	 * void 있으면 생성자 X , void가 있으면 메소드
	 */
	public List<String> todoList;
	public Sunday() {
		todoList = new ArrayList<String>();
	}
	
	public static void main(String[] args) {
		Sunday s = new Sunday();
		s.todoList.add("1");
		System.out.println(s.todoList);
	}

}
