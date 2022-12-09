package day08.exception;
/*
 * [[ Exception의 종류]]
 * 
 * 	1.Checked Exception
 * 		- 컴파일시에 반드시 try ~ catch로 처리해야 한다.
 * 	2.UnChecked Excetion
 * 		- try~ catch 로 처리 하지 않아도 컴파일 시에 에러가 발 생하지 않는다.
 * 		- 선택적 처리
 * 
 * 
 */
public class MainClass04 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(2000); //2초 일시 정지
			} catch (InterruptedException e) {
				System.out.println("익셉션 발생!");
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
}
