package dya11.pattern;








public class MainClass01 {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		Singleton singleton3 = Singleton.getInstance();
		
		System.out.println(System.identityHashCode(singleton));
		System.out.println(System.identityHashCode(singleton2));
		System.out.println(System.identityHashCode(singleton3));
		
		
		
		Factory factory = Factory.getSingleton();
		Factory factory2 = Factory.getSingleton();
		Factory factory3 = Factory.getSingleton();
		
		System.out.println(System.identityHashCode(factory));
		System.out.println(System.identityHashCode(factory2));
		System.out.println(System.identityHashCode(factory3));
		
		
		
	}
}
