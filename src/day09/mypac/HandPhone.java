package day09.mypac;

public class HandPhone {
	public String model;	// 전역변수 초기화 하지 않으면
							// null
	static {
		System.out.println("static 초기화 블럭");
	}
	
	{
		System.out.println("초기화 블럭");
	}
	

	
	
	
	
	//생성자 - 클래스명과 동일하다.
	public HandPhone() {
		this.model = "갤럭시";
		System.out.println("디폴트 생성자가 호출 되었습니다.");
	}
		
	//오버로딩 생성자
	public HandPhone(String HandPhone) {
		this.model = "model";
		System.out.println("생성자로 "+ model + "로 전달 되었습니다.");
	}
	
}
