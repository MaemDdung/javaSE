package day05.oop;

import day05.mypac.*;

public class MainClass02 {
	public static void main(String[] args) {
		Book book1 =new Book();
		
		//제목
		System.out.println("책제목 :"+book1.subject);
		System.out.println("저자 :"+book1.writter);
		
		book1.read();
		book1.pillow();
	}	
	
	
}
