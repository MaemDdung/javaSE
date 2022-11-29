package day07.mypac;

public class M4A1Weapon implements Weapon {

	@Override
	public void attack() {
		System.out.println("지상 공격을 해요!");
	}

	@Override
	public void attackSky() {
		System.out.println("하늘 공격을 해요!"); 		
	}

}