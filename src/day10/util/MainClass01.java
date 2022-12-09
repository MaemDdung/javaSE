package day10.util;

import java.util.Stack;

/*
 * [[ Stack Class ]]
 * 	- 배열성 클래스 (Collection)
 * 	- 선입후출(FILO) : 먼저 들어온 값이 마지막에 나간다.
 *
 * 
 * 	Generic (제네릭)
 * 		1.잘못된 타입 들어오는것 방지
 * 		2. 변환(cast)이 필요없다
 */
public class MainClass01 {
	public static void main(String[] args) {
		//Stack 객체 생성 
		// <제네릭> - 배열성 객체 들어간 데이터 타입 정할 수 있다.
		Stack <String> stack = new Stack<>();
		
		//생성한 객케에 자료 저장하기
		stack.push("피카츄");
		stack.push("라이츄");
		stack.push("파이리");
		
		//현제 저장 하고 있는 데이서 개수
		System.out.println("데이터 개수 :" + stack.size());

		
		//데이터 하나씩 빼오기
//		System.out.println("1: "+ stack.pop());
//		System.out.println("2: "+ stack.pop());
//		System.out.println("3: "+ stack.pop());
		
		System.out.println("가장 위에 있는 데이터 :" + stack.peek());
		//반복문으로 한번에 빼오기
		while(!stack.empty()) {
			String name = stack.pop();
			System.out.println("pop 한 데이터 :"+ name);
		}
		
		
		
		
		
		
	}
}
