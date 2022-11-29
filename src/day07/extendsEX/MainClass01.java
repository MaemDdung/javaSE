package day07.extendsEX;

import day07.mypac.MobilePhone;

/*
 * [[상속]]
 * 	부모 클래스(상위클래스)와 자식 클래스(하위 클래스)가 있으며, 
 * 	자식 클래스는 부모 클래스를 선택해서, 
 * 	그 부모의 멤버를 상속받아 그대로 쓸 수 있게 된다.
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		MobilePhone mp = new MobilePhone();
		mp.call();
		
		mp.sendMsg();
		
//		SmartPhone sp = new SmartPhone() {
//		sp.call();
//			
//		}
//		
	}
	
	
	
}
