package day09.construtor;

import java.util.logging.Handler;

import day09.mypac.HandPhone;

/*
 * [[생성자 (Constructor)]]
 * 	객체를 생성할때 호출하는 반환값이 없는 메소드. 사실 메소드는 아니다!!
 * 	객체 초기화 목적에 사용
 * 
 * 	클래스명과 동일 하다. 예) 클래스명()
 * 	오버로딩 가능
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		//객체 성성될 때 생성자 실행
		HandPhone hp = new HandPhone();
		
		HandPhone hp2 = new HandPhone("아이폰");
		
		System.out.println("hp mode: "+ hp.model);
		System.out.println("hp2 mode: "+ hp2.model);
	}
}
