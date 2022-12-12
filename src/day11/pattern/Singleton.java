package day11.pattern;


//싱글톤 패턴
public class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {
	}

	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		
		return instance;
	}

	
}
