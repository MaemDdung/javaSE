package day06.abstractEX;

import day06.abstractEX.pac.Man;
import day06.abstractEX.pac.Woman;

/*
 * [[ 추상클래스 (Abstract Class) ]]
 * 
 * 	구현되지 않는 추상 메소드가 존재 한다.
 * 	정의만 하고 구현X 
 * 	미완성 메소드를 가지고 있다.
 * 	상속을 받고 반드시 오버라이딩 해야 한다.
 * 
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		//추상 메소드 오버라이딩 반드시 해야 한다.
//		Human h1 = new Human( );
				
		Woman w1 = new Woman();
		
		w1.say();
		w1.usefire();
				
		Man m1 = new Man();
		m1.say();
		m1.usefire();
		
		
	}
}
