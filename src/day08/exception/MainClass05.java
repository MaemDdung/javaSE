package day08.exception;

import day08.mypac.NumberPrinter;

public class MainClass05 {
	public static void main(String[] args) {
		NumberPrinter np = new NumberPrinter();
		
		try {
			np.printNumber();
		} catch (Exception e) {
			System.out.println("익셉션 발생!");
		}
	}
}
