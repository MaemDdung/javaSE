package day06.constant;
//자 패키지에 이름은 예약어로 설정이 불가하다! 
//(const인데 설정 안되서 바꿈)

/*
 * [[ 상수 ]]
 * 		처음 할당된 값이 변경되지 않는다.
 * 		final 키워드 사용
 * 		상수는 대문자로 선언한다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		final double PI = 3.14592; //원주율
		
		//아래처럼 바꿔 쓰면 에러 남
		//PI = 3.21;
		
		//원의 반지름
		int r= 10;
		//원의 넓이
		double area = PI*r*r;
		
		System.out.println("원의 넓이: " + area);
		System.out.println("원주율: " + Math.PI);
		
		area = 0;
		area = Math.PI * Math.pow(r, 2);
		System.out.println("원의 넓이: " + area);
		
	}
	
}
