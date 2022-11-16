package day03.loop;
/*
 * 3. for 문
 * 
 * for(초기화변수; 조건식; 증감식){
 * 		반복 수행할 코드
 * }
 */
public class MainClass03 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		int i = 0;
		while(i <10) {
			System.out.println(i);
			i++;
		}
	}
}
