package day02.basic;
/*
 * [[기본 자료형]]
 * 1. 기본 논리형(boolean)
 * 
 * -선언 방법
 * 		boolean변수명;
 * -가질 수 있는 범위 : true, false 두가지 값 저장 가능.
 * 
 * 
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		//논리형 지역 변수 선언하기
		boolean isWait;
		//선언한 변수에 값 대입하기
		isWait = true;
		//저장된 값을 문자열로 출력 하기
		System.out.println("논리형 변수에 저장된 값: "+isWait);
		
		//직역변수는 일반적으로 선언과 동시에 값을 넣어주어야 한다.
		boolean canRun = false; //변숫 선언과 동시에 값 대입

		//변수에 저장된
		isWait = false;
		canRun = false;
		
		//줄 복사 Ctrl + Alt + 방향키아래 
		//줄 삭제 Ctrl + D
		System.out.println("isWait : "+ isWait);
		System.out.println("canRun : "+ canRun);
		
		//주석처리 단축키 Ctrl + /
//		boolean isArea;
//		System.out.println(isArea);
		
		
		
	}
}
