package test09;

import java.util.Random;

public class OTM {
	public static void main(String[] args) {
		// Over Time Meal 야식
		/*
		 * 4층짜리 건물에
		 * 각층마다 방갯수는 랜덤갯수(최하1개~최대10개)
		 * 방갯수가 제일 작은 층과 제일 많은 층을 찾아서 출력해주세요.
		 */
		
		int [][] rooms = new int [4][];
		Random r = new Random();
		for(int i=0; i<rooms.length; i++) {
			rooms[i] = new int [r.nextInt(10)+1];
			for(int j=0; j<i;j++) {
				if(rooms[i].length==rooms[j].length) {
					j--;
					break;
				}
			}			
		}
		
	
		
	}	
}
