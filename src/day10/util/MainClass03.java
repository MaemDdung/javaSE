package day10.util;

import java.util.Vector;

public class MainClass03 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>();
		
		//추가
		vec.add("피카츄");
		vec.add("라이츄");
		vec.add("파이리");
		
		//인덱스 번호로 값 얻어 오기
		String str = vec.get(0);
		System.out.println("vec 0인덱스 값: "+ str);
		
		//Vector 전체 값 출력
		for (String name : vec) {
			System.out.println("name : " + name);
		}
		
			
			
		
		
	}
}
