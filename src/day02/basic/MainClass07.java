package day02.basic;
/*
 * [[참조형 데이터형(레퍼런스형)]]
 * 
 * 5.String 형(문자열)
 * 
 * -선언하는 방법
 * 		String 변수명;
 * -문자열을 저장 할 수 있다.
 * 
 * ※String 앞에 s 대문자 필수※
 * 
 *  기본형 - boolean, chat, byte, short, int, long, float, double
 *  참조형 - 기본형을 제외한 모든 클래스
 *  
 *  boolean => T,F
 *  chat => 문자
 *  byte, short, int, long => 
 *  
 *  
 */
public class MainClass07 {
	public static void main(String[] args) {
		//변수 선언과 동시에 값 대입하기
		String str = "안녕하세요";
		System.out.println("str : "+ str);
		
		
		/*
		 *  h e l l o 
		 *  0 1 2 3 4 => 인덱스번호
		 * 
		 */
		
		String hello = "hello";
		System.out.println("1번 인덱스 :" + hello.charAt(1));
		
		String addr = "서울 특별시 강서구 방화";
		boolean isContain = addr.contains("특별시");
		if(isContain) {
			System.out.println("addr 에는 특별시라는 문자열이 있어요!");
		}
				
	}
}

