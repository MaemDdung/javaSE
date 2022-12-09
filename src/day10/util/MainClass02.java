package day10.util;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * [[ArrayList Class]]
 * 
 * 
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		//ArrayList 객체 생성 하기
		
		ArrayList<String> list =  new ArrayList<>();
		list.add("피카츄"); // 0  (index)
		list.add("라이츄"); // 1
		list.add("파이리"); // 2
		
		//저장된 데이터의 특정 인덱스 값 얻어오기
		String str = list.get(0);
		System.out.println("list 0 인덱스 값: "+ str);
		list.remove(2);
		
		System.out.println("저장된 데이터의 개수: " + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list["+i+"]: " + list.get(i));
		}
		
		for(String name : list) {
			System.out.println("name : "+ name);
		}
		
		
	}
}
