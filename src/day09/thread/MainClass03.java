package day09.thread;

import day09.mythread.CountThread;

public class MainClass03 {
	
	public static void main(String[] args) {
		CountThread cThread = new CountThread();
		
		cThread.start();	//카운트스레드 시작!
		
		for(int i = 0; i<10; i++) {	// 메인스레드 카운트 시작
			System.out.println(i*100);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
		System.out.println("메인 스레드가 종료됩니다.");
		
	}
	
	
	
}
