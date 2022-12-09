package day08.exception;
/*
 * 
 * [[ 예외 (Exception)]]
 * 	- 프로그램 실행 도중 발생되는 에러에 해당된다.
 * 	- 예외처리 : 예외가 발생되었을 때 이를 처리하는 것
 * 
 * 처리하는 방법: 
 * 
 * try {
 * 		실행코드
 * }catch(익셉션클래스명 변수명){
 * 		해당 예외가 발생했을 경우 실행할 코드
 * }
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		//정수 값을 저장 할 지역 변수 초기화
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
//		result = num1/num2;
//		if(num2 != 0) {
//			result = num1/num2;
//			System.out.println("실행결과 :"+ result);
//		}else {
//			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
//		}

		try {
			result = num1/num2; //예외 발생시 아래 코드 실행X -> catch 실행
			System.out.println("실행결과 :"+ result);
		} catch(Exception e) {
			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
			e.printStackTrace();
			System.out.println("무슨 에러야?"+ e.getMessage());
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
