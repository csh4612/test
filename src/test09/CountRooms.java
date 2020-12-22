package test09;

import java.util.Random;

public class CountRooms {
	public static void main(String[] args) {
		int[][] rooms = new int [4][];
		
		/*
		 * 위의 rooms는 0층부터 3층까지 있음
		 * 각층마다 1개방이상 10개방 이하로 랜덤방을 가지고 있는 건물을 만들기
		 * 층이 최대 3층뿐인데 
		 * 4보다 작거나 같다로 돌리면
		 * 없는 4층을 돌리겠죠??
		 */
		
		Random r = new Random ();
		
	
		for(int i=0; i<rooms.length; i++) {
			rooms[i] = new int [r.nextInt(10)+1];
	    }
		int sum =0;
		for(int i=0; i<rooms.length; i++){
			sum += rooms[i].length;
		    System.out.println(i + "층 방갯수 : " + rooms[i].length);
		}
		
		System.out.println("총 방 갯수는 : " + sum);
		

	}
}
