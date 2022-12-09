package day08.exception;

import java.util.Random;
/*
 * finally - 정상 또는 예외가 발생해도 실행 되는 블럭
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		try {
			System.out.println("DB를 연결합니다.");
			System.out.println(ran.nextInt()/0);
			System.out.println("DB 관련 작업을 합니다.");
		} catch (Exception e) {
			System.out.println("예외가 발생 했습니다.");
		}
		
		
		
	}
	
	
	
}
