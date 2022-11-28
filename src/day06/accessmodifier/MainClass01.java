package day06.accessmodifier;

import day06.mypac.MobilePhone;
import day06.mypac.Phone;

/*
 * [[ 접근제어자 ]]
 * 		public - 모든 클래스에서 접근 가능
 * 		protected - 같은 패키지 또는 상속 관계에서 접근 가능.
 * 		default - 같은 패키지 접근 가능
 * 		private - 같은 클래스 안에서 접근 가능
 *		
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		Phone phone = new Phone();
		
	//	System.out.println(phone.name);
		
		MobilePhone mp = new MobilePhone();
		System.out.println(mp.getName());
		
		//mp.name = "rkfhqhssmd";
		mp.setName("가로본능");
		System.out.println(mp.getName());
	}
	
	

	
	
}
