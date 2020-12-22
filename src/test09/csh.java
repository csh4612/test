package test09;

import java.util.Random;

public class csh {
	public static void main(String[] args) {
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
		// 기준 하나 놓고 다 비교하면서 바꾸면 tmp?		 		
		//입력문
		int i =0;
		int max = 0;
		for( i=0; i<rooms.length; i++) {
			if(rooms[i].length>max) {
				max= rooms[i].length;
			}			
		}
		//출력 i값을 어떻게 하지???????
		for( i=0; i<rooms.length; i++) {
			if(rooms[i].length>max) {
				max= rooms[i].length;
			}
		}
		System.out.println("방갯수가 많은 층은 : " + i + "층 " + "방갯수 :" + max);
		//입력
		int j=0;
		int min = 10;
		for(j=0; j<rooms.length; j++) {
			if(rooms[j].length<min) {
				min= rooms[j].length;
			}	
		}
		//출력 
		for(j=0; j<rooms.length; j++) {
			if(rooms[j].length<min) {
				min= rooms[j].length;
			}			
		}
		System.out.println("방갯수가 적은 층은 : " + j + "층 " + "방갯수 :" + min);
				
		
		
		
	}
}
