package day07.mypac;

public class MobilePhone extends Phone{
	
	//
	public void call() {
		System.out.println("무선으로");
		super.call();
	}
	
	public void sendMsg() {
		System.out.println("문자를 보내요.");
	}
	
	
}
