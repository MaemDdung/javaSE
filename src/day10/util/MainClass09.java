package day10.util;

import java.util.Random;
//로또 번호
public class MainClass09 {
	public static void main(String[] args) {
		//정수를 저장할 수 있는 45 크기 배열
		int[] lNum = new int[45];
		
		//반복문으로 배열에 1~45 저장
		for (int i = 0; i < lNum.length; i++) {
			lNum[i] = i+1;
		}
		
		Random ran = new Random();
		// 셔플 - 반복문 돌면서 순서 섞이
		for (int i = 0; i < lNum.length; i++) {
			//0~ 44 사이 정수 값 얻어오기
			int changeIdex = ran.nextInt(45);
			
			//바꿔야 할 인덱스 값과 현제 인덱스 값 자리 바꾸기
			int tmp = lNum[i];
			lNum[i] = lNum[changeIdex];
			lNum[changeIdex] = tmp;
		}

		for (int i = 0; i < 7; i++) {
			System.out.print(lNum[i]+ " | ");
		}
		
		
	}
	
}
