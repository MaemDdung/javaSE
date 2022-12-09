package day08.innerclass;
/*
 * [[내부 클래스 (Innerclass)]]
 * 	
 * 클래스 안에 또 다른 클래스 정의
 * 
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		new MainClass01.InnerClass().doSomething();
		new InnerClass().doSomething();
		
		
		
		
	}	//Main 메소드 END
	static class InnerClass{
		public void doSomething() {
			System.out.println("무언가를 해요!");
		}
	}
	
}	//MainClass01 END
