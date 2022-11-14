package day02.basic;
/*
 * [[기본 자료형]]
 * 2.문자형(char)
 * 
 * -선언 방법
 * 		char 변수명;
 * -전 세계에서 쓰이는 문자형태 대부분 표현 가능.
 * 
 * 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		//char형 변수 선언과 동시에 값 대입하기
		char ch1 = 'A';
		//출력해보기
		System.out.println(ch1);
		char ch2 = '尹';
		char ch3 = '뛃';
		
		System.out.println(ch2);
		System.out.println(ch3);
		
		
		int num = ch1; //char형을 int형으로 형변환
		System.out.println("대문자 A에 해당하는 숫자 코드 : " + num);
		
		int num2 = 110; //int형을 char 형으로 강제변환
		char ch4 = (char)num2;
		System.out.println(ch4);
		
		
		
	}
}
