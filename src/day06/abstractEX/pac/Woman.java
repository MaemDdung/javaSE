package day06.abstractEX.pac;
/*
 * 상속 받는법 
 * 		Class 클래스명 extends 상속받을 클래스명 
 * 
 */
public class Woman extends Human {

	
	//@-언노테이션
	
	//오버라이딩 - 부모 메소드 재정의
	@Override
	public void usefire() {
		System.out.println("구이 요리를 해요!");
	}
	
	
	

}
