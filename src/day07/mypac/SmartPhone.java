package day07.mypac;

public class SmartPhone extends  MobilePhone {
	
	@Override
	public void call() {
		System.out.println("영상통화를 해요!");
	}
	
	public void doInternet() {
		System.out.println("인터넷을 해요!!");
	}
}
