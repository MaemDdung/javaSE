package day06.abstractEX.pac;

public class Man extends Human{
	
	@Override
	public void say() {
		System.out.println("굵은 목소리로 말해요");
		super.say();
	}
	
	@Override
	public void usefire() {
		System.out.println("장작을 펴요!");
		
	}

	
	
	
}
