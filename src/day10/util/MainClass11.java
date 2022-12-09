package day10.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainClass11 {
	public static void main(String[] args) throws ParseException {
		getDate();
		getDateAndDay();
		getDateTimeAndDay();

		String resultDate = dateCalc("2022-10-11 00:00:00", "yyyy-MM-dd HH:mm:ss", 0, 0, 100, 0, 0, 0);
		
		System.out.println(resultDate);

	}

	public static void getDate() {
		// 날짜 객체
		Date date = new Date();

		// 날짜 포맷 변경해주는 객체
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String strDate = sdf.format(date);

		System.out.println(strDate);
	}

	public static void getDateAndDay() {
		// 날짜 객체
		Date date = new Date();

		// 날짜 포맷 변경해주는 객체
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");

		// 요일값 반환 0~6(일~토)
		int sday = date.getDay();

		String strDay = "";

		switch (sday) {
		case 0:
			strDay = "일";
			break;
		case 1:
			strDay = "월";
			break;
		case 2:
			strDay = "화";
			break;
		case 3:
			strDay = "수";
			break;
		case 4:
			strDay = "목";
			break;
		case 5:
			strDay = "금";
			break;
		case 6:
			strDay = "토";
			break;
		}
		String strDate = sdf.format(date) + "(" + strDay + ")";
		System.out.println(strDate);
	}

	public static void getDateTimeAndDay() {
		// 날짜 객체
		Date date = new Date();

		// 날짜 포맷 변경해주는 객체
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");

		// 요일값 반환 0~6(일~토)
		int sday = date.getDay();

		String strDay = "";

		switch (sday) {
		case 0:
			strDay = "일";
			break;
		case 1:
			strDay = "월";
			break;
		case 2:
			strDay = "화";
			break;
		case 3:
			strDay = "수";
			break;
		case 4:
			strDay = "목";
			break;
		case 5:
			strDay = "금";
			break;
		case 6:
			strDay = "토";
			break;
		}
		String strDate = sdf.format(date) + "(" + strDay + ")";
		System.out.println(strDate);
	}

	// 날짜계산
	public static String dateCalc(String strDate, String format, int addYear, int addMonth, int addDate, int addHour,
			int addMinute, int addSecond) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(strDate);
		Calendar cal = Calendar.getInstance();

		cal.add(Calendar.YEAR, +addYear);
		cal.add(Calendar.MONTH, +addMonth);
		cal.add(Calendar.DATE, +addDate);
		cal.add(Calendar.HOUR_OF_DAY, +addHour);
		cal.add(Calendar.MINUTE, +addMinute);
		cal.add(Calendar.SECOND, +addSecond);

		SimpleDateFormat sdf2 = new SimpleDateFormat(format);
		String toDate = sdf2.format(cal.getTime());

		return toDate;
	}

}