package day03.operator;
/*
 * 6. 삼항 연산자 (조건문과 비슷)
 * 	조건식 ? 조선삭아 첨인경우 : 조건식이 거짓인 경우 
 *
 * 
 * 
 */
public class MainClass06 {
	public static void main(String[] args) {
		int num = -10;
								//true      : false
		String result = num > 0? "num은 양수" : "num은 음수";
		System.out.println(result + "입니다.");
		
		
		String result2 = null;
		if(num > 0) {
			result2 = "num은 양수";
		}else {
			result2 = "num은 음수";
		}
		System.out.println(result2 + "입니다.");
	}
}
