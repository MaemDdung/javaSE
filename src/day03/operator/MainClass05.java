package day03.operator;
/*
 * 5. 대입연산자
 * 
 *  =, +=, -=, *=, /=, %=
 */
public class MainClass05 {
	public static void main(String[] args) {
		// = 대입 연산자로 변수 num에 10 저장
		int num = 10;
		
		num += 10; //num = num + 10; 같다
		System.out.println(num);
		
		num -= 5; //num = num - 5; 같다
		System.out.println(num);
	}
}