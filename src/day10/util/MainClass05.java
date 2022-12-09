package day10.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * [[HashMap Class]]
 * 
 * - map인터페이스를 구현한 클래스이다.
 * - key 값, Value 값을 쌍으로 저장한다. (사전형태)
 * - key 값 중복 불가
 * 
 */
public class MainClass05 {
	public static void main(String[] args) {
		//HashMap 객체 생성
		
		HashMap<String, String> map1 = new HashMap<>();
		
		//데이터 가져오기
		map1.put("HELLO", "안녕하세요");
		map1.put("CAR", "자동차");
		map1.put("Tiger", "호랑이");
				
		//데이터 얻어 오기
		String Value = map1.get("HELLO"); //키 값으로 값 가져오기
		
		System.out.println("Value : " + Value);
		
		Set<String> set = map1.keySet();
		
		//set -> 반복자 객체
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String KeyValue = it.next();//키값 하나씩 읽어 온다
			
			String Value2 = map1.get(KeyValue);
			
			System.out.println("Value2 :" + Value2);
			
		}
		
		
	}
}
