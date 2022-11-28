package day06.accessmodifier;

import day06.mypac.MemberVo;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * 아이디 : pika
		 * 비밀번호 : pika1234
		 * 이름 : 피카츄
		 * 전화번호 : 010-1234-1234
		 * 주소 : 서울시 서대문구 태초마을
		 * 생년월일 : 1996. 02. 27
		 */
		MemberVo MemberVo = new MemberVo();
		MemberVo.setId("pika");
		MemberVo.setPassword("pika1234");
		MemberVo.setName("피카츄");
		MemberVo.setPhoneNumber("010-1234-1234");
		MemberVo.setAdderss("서울시 서대문구 태초마을");
		MemberVo.setBirth("1996. 02. 27");
		
		String id = MemberVo.getId();
		String password = MemberVo.getPassword();
		String name = MemberVo.getName();
		String phoneNumber = MemberVo.getPhoneNumber();
		String adderss = MemberVo.getAdderss();
		String birth = MemberVo.getBirth();
		
		
		System.out.println(id);
		System.out.println("********");
		System.out.println(name);
		System.out.println(phoneNumber);
		System.out.println(adderss);
		System.out.println(birth);
		
	}
	
	
	
}
