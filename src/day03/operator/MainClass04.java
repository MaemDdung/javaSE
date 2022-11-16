package day03.operator;
/*
 * 4. 논리 연산자
 * 
 * && : And조건, 교집합 개념, 양쪽 모두true 일때만 true
 * || : OR조건, 합집합 개념, 어느 한쪽이 true 이면 true
 * !  : not조건, 여집합 개념, 논리 값을 반전 시킨다.
 * 
 */
public class MainClass04 {
	public static void main(String[] args) {
		boolean result = true && true;
		System.out.println("&& :" + result);
		
		result = true || false;
		System.out.println("|| :" + result);
		
		result = !false;
		System.out.println("!  :" + result);
		
		result = true || false || false || false;
		System.out.println(result);
		
		
		if ((10 < 20) || (5==4)) {
			System.out.println("조건 중 하나이상 true입니다.");
		}
		
		
		
		
		
		
		
	}
}
