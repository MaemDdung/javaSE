package day10.util;

import java.util.Calendar;

/*
 * [[Calendar Class]]
 *
 * - 날짜 관련 객체
 * 
 * 
 * 
 */
public class MainClass07 {
	public static void main(String[] args) {
		Calendar calNow = Calendar.getInstance(); 
		
		int year = calNow.get(Calendar.YEAR); //년
		System.out.println("올 해 "+ year);
		
		int month = calNow.get(Calendar.MONTH)+1; // 월 (0월 부터 시작함그래서 +1)
		System.out.println("월 : "+ month);
		
		int day = calNow.get(Calendar.DAY_OF_MONTH)+1; // 일
		System.out.println("일 : "+ day);
		
		int hour = calNow.get(Calendar.HOUR);		//시
		int min = calNow.get(Calendar.MINUTE);		//분
		int sec = calNow.get(Calendar.SECOND);		//초
		
		System.out.println(hour+":"+min+":"+sec);
		
	}
}
