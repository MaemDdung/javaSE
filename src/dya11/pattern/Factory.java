package dya11.pattern;

/*
 * 팩토리 패턴 
 * 	
 */
public class Factory {
	
	private static Factory instance;
	
	private Factory() {
	}

	public static Factory getSingleton() {
		return new Factory();
	}
}
