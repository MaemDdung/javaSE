package day05.mypac;

public class MathUtil {
	public double pi = 3.141592;
	
	
	
	/**
	 * 원의 넓이를 구하는 메소드
	 * 
	 * @param r
	 * @return
	 */
	public double getArea(int r) {	//매개변수 반지름
		double area = pi*r*r;		// 원주율 * 반지름 제곱
		
		return area;				//원의 넓이
	}
	
	
	//두수 합계
	public int sum(int a, int b) {
		int result = a+b;
		
		return result; 
	}
	
	
	//세수의 합 (오버로딩)
	public int sum(int a, int b, int c) {
		int result = a + b + c;
		
		return result;
	}
	
	
	
	
	
}
