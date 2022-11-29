package day07.mypac;
/*
 * 인터페아스 상속 받는 방법
 * 
 * implements 예약어로  선언한다.
 * 
 * 
 */
public class AkWeapon implements Weapon, Scope{
	
	public void attack() {
		System.out.println("지상 공격을 해요!");

	}

	@Override
	public void attackSky() {
		System.out.println("공중을 공격을 해요!");
		
	}
	
	@Override
	public void doSnip() {
		System.out.println("저격을 해요!");
		
	}
	
}
