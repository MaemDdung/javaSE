package day05.var;

import day05.mypac.Card;

public class MainClass02 {
	//static이 붙으면 별도로 분류 된다
	
	// 기본형/전역변수/static
	public static int num = 10;
	
	// 기본형/전역변수 동적(오브젝트가 안생김)
	public int num2 = 20;
	
	public static void main(String[] args) {
		
		System.out.println(num);
		
		//객체 지향
		MainClass02 mc2 = new MainClass02();
		System.out.println(mc2.num2);
		
		Card c1 = new Card();
		System.out.println(c1.width);
		
		//static : 객체명.정적변수명 생성없이 사용가능
		System.out.println(Card.width);
		
	}
	
	
	
	
	
	
	
	
	
}
