package day03.operator;
/*
 * 2. 증감 연산자
 * 
 * ++ : 11씩 증가 시킨다
 * -- : 11씩 감소 시킨다
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		int num = 0;
		num = num + 1;
		System.out.println(num);
		
		num++;
		System.out.println(num);
		
		//0~99 까지 출력 하는 반복 문(for)
//		for(int i=0; i < 100; i++) {
//		System.out.println(i);
//		}
		
		
		int num2 = 0;
		num2 = num2 - 1;
		System.out.println(num2);
		num2--;
		System.out.println(num2);
		
		
		//순선에 따라 연산이 안될 수 있
		int num3 = 0;
		System.out.println("num3 :"+ ++num3);
		
		int num4 = 0;
		System.out.println("num4 :"+ num4++);
		System.out.println("num4 개행후 :"+ num4);

		
	}
}
