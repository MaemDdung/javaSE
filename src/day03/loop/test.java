package day03.loop;

public class test {
	public static void main(String[] args) {
		for(int i = 0; i < 7; i++) {
			for(int j=0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
