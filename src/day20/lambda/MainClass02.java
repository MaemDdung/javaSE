package day20.lambda;

import java.util.ArrayList;
import java.util.List;

public class MainClass02 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Bat");
		list.add("Cat");
		list.add("Dog");
		
			
		// 기존방법
//		printBasic(list);
		
		printWithFP(list);
	}
	// 기존 확장포문 이용
	private static void printBasic(List<String> list) {
		for(String str : list) {
			System.out.println(str);
		}
	}
	
	// stream forEach 람다식 
	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println("element - " + element));
	}
	
	
	// 기존 확장포문 필터 if문 이용
	private static void printBasicWithFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}
	
	// stream forEach 람다식 필터 적용
	private static void printWithFPWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println("element - " + element));
	}
	
}