package day05.mypac;

public class Book {
	public String subject ="JAVA Programing";
	public String writter ="윤종훈";
	
	public void read( ) {
		int page = 10;
		System.out.println(subject + " " + page + "페이지를 읽어요!");
	}
		
	//page 지역변수라 안들어감
	public void pillow() {
		System.out.println("베게로 사용해요!");
	}
	
	
	
}
