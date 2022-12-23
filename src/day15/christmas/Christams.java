package day15.christmas;

public class Christams {
	public static void main(String[] args) {
		System.out.println("   ☆");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				if(j + i < 7 / 2 ) {
					System.out.print(" ");
				}else if (j+i > 7/2 + (i*2)) {
					System.out.print(" "); 
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		System.out.println("  | |   Merry Christmas~☆");
	}
}
