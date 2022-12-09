package day09.mythread;



public class interTread implements Runnable {

	@Override
	public void run() {
		System.out.println("interThead가 시작되었습니다.");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("interThead가 종료되었습니다.");
	}

	
	
}
