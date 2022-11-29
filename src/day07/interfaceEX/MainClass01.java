package day07.interfaceEX;

import day07.mypac.AkWeapon;

/*
 *[[인터페이스 (interface)]]
 * 	추상 메소드만 있다.
 * 	변수 선언을 해도 변수가 아닌 상수가 된다.
 * 
 * 	뼈대를 만들어 준다.
 * 
 * !인터페이스의 변수는 final이 생략된 상수이다.
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		AkWeapon ak = new AkWeapon();
		ak.attack();
		
		
		//ak.NAME = "M4A1" 상수여서 바꿀 수가 없음
		System.out.println(ak.NAME);
		
	}	
	
	
	
}
