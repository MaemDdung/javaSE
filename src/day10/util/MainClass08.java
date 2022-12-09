package day10.util;

import java.util.Random;
import java.util.Scanner;

/*
 * [[ scanner, Random ]]
 * 
 */
public class MainClass08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열 입력 >>>");
		
		String str = scan.next();
		
		System.out.println("입력받은 값: "+ str);
		
		Random ran = new Random();
		// 0~9사이  정수 중 난수 발생 시키기
		int ranNum = ran.nextInt(10);
		
		System.out.println("난수 : "+ ranNum);
		
		
		
	}
}
