# JavaSE

***

### 객체란?   
실제로 존재 또는 추상적으로 식별가능한 모든것   
최소한의 프로그램 단위.   

Java - 객체 설계도를 만든다. (a.k.a 와플틀)   
```
class 클래스명{
	변수
	메소드
}
```

객체를 만드는방법(객체생성) --> 메모리에 객체를 올린다. --> 인스턴스화   
 * 클래스명(타입) 변수명 = new 클래스명();      

### 객체 구성요소   
  - 변수 - 특징, 속성 값   
  	- 타입   
  		- 기본형(8개) - boolean, byte, char, short, int, long, float, double(stack메모리생성)   
  		- 참조형 - 기본형 외 모든 변수 --> 객체 주소값 가지고 있는 변수 (heap메모리생성)   
  	- 선언위치   
  		- 전역변수 - 클래스에 종속. 멤버변수   
  				- !초기화 하지 않으면   
  					- 참조형 null 값   
  					- 기본형은 default 값 boolean(false) 정수형(0) 실수형(0.0)   
  		- 지역변수 - 메소드 안에 선언. !주의 초기값 대입없을시 컴파일 에러 발생!! 초기화 필수!!!   
  	- 동적/정적   
  		- 동적(default) - 일반변수   
  		- 정적(static) - static이 선언된 (static메모리생성) / 실행시 생성 / 같은타입객체가 공유   
  		
  - 메소드(Method) - 기능, 코드집합
  	- 오버로딩 - 메소드명 중복 정의, 매개변수 타입 또는 개수 다르다.
	```
	//메소드 구조   
	접근제어자 (static) 리턴타입 메소드명(매개변수타입 매개 변수명) {
		//코드 블럭
		... 실행코드...
		return 리턴값;	// 리턴타입이면 void생략가능  
	```

	- 접근제어자 4가지   
	```
		public -모든 패키지 클래스에서 접근 가능
		protected - 같은 패키지 또는 상속 관계에서 접근가능
		default(선언하지 않은 상태)
		
			
	```	








