package day03.loop;
/*
   
   1. 반복문 조건문 연습
   주말 숙제 코드 분석 하기
   
   2번 숙제
   			*
 		   **
          ***
         ****
        *****
       ******
      *******
 
  
   3번 
  		*
       ***
      *****
     *******
     
     
     
  4번 
       *
      *** 
     *****
    *******
     *****
      ***
       *
   만들테면 만들어 봐라;;
 */
public class MainClass04 {
	public static void main(String[] args) {
		//1번 숙제 분석!
//		for(int i = 0; i < 7; i++) {
//			for(int j=0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		for(int i=0; i < 7; i++){
			for(int j=0; j < i+1; j++) { 
				System.out.print("*"); 
			}
			System.out.println();
		}
			
		
		
		
	}
}
