package day05.var;

import day05.mypac.Card;

/*
 * [[변수 (variable)]]
 * 메모리 공간에 붙여진 이름.
 * JAVA 프로그램 사용되는 모든 값을 메모리 공간에 저장.
 * 메모리 공간에 이름을 붙여 접근 가능
 * 
 * 변수 선언 및 초기화
 * 	자료형 변수명 = 값 
 * 
 * 1.타입의 따른 변수 
 * 		기본형 - 예약어, 소문자로 시작 값을 가지고 있다. 
 * 			8가지 boolean, byte, short, int, long, char, float, double
 * 
 * 		참조형 - 대문자로 시작을하고, 주소값을 가지고 있다. 
 * 			기본형 외 나머지 전부!
 * 
 * 2.선언 위치에 따른 변수
 * 		전역 변수(global 변수) - 클래스 안에 선언(멤버 변수)
 * 							  초기화를 하지않으면 default 값이 들어간다.
 * 								참조형 - null
 * 								기본 정수형 - 0
 * 								기본 실수형 - 0.0
 * 								기본 boolean - false
 * 								
 * 
 * 
 * 	 	지역변수(local 변수) - 메소드 또는 생성자 안에 선언.
 * 							중괄호 {} 안에 선어된 변수.
 * 							반듯이 초기화 해줘야 한다!! (안하면 컴파일 에러)
 * 
 * 3. 정적(static) / 동적 변수
 * 		
 * 
 * 
 * 		
 * !초기화 = 처음 값을 대입
 * 
 */
public class MainClass01 {

	
	
	public static void main(String[] args) {
		Card c1 = new Card();
		
		System.out.println(c1.cardType);
		System.out.println(c1.number);
		System.out.println(c1.width);
		System.out.println(c1.heigh);
		
		Card c2 = new Card();
		c2.cardType = "heart";
		c2.number = "K";
		c2.width = 65;
		c2.heigh = 90;
		System.out.println("c2.cardType"+c2.cardType);
		System.out.println("c2.number" + c2.number);
		System.out.println("c2.width"+c2.width);
		System.out.println("c2.heigh"+c2.heigh);

	
	                                    
	    Card c3 = new Card();           
	                                    
	    System.out.println(c3.cardType);
	    System.out.println(c3.number);  
	    System.out.println(c3.width);   
	    System.out.println(c3.heigh);   
	                                    
	                                     
	}
}

