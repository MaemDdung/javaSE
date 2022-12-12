package day12.io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/*
 * [[ I/O - Input/Output ]]
 * 	입력/출력 패키지
 * 	예) 키보드 입력, 마우스클릭, 터치 - Input
 *		모니터출력, 프린터출력, 스피커 출력 - Output
 * 
 */
public class MainClass01 {
	public static void main(String[] args) throws Exception{
		// File 객체  - 경로정보를 받아 파일 또는 디렉토리 정보를 객체화
		File f = new File("c:\\");
		
		// c드라이브 하위에 있는 모든 디렉토리 및 파일을 반환한다.
		String[] list = f.list();
		
		// Calendar - 객체를 시스템 날짜로 생성한다. 
		Calendar c = Calendar.getInstance();
		
		for(String temp : list) { // 파일 목록 하나씩 가져오기
			// C드라이브 하위 드렉토리 및 파일을 새로운 File 객체로 생성한다.
			File f2 = new File(f, temp);
			
			// 1970년 1월 1일 부터 현재 수정한 날짜를 밀리세컨드로 반환한
			long lastMod = f2.lastModified();
			
			// 현재 파일 또는 디렉토리의 마지막 수정한 날짜를 Calendar 객체로 다시 설정한다.
			c.setTimeInMillis(lastMod);

			// 날짜포멧 만들어 주는 객체
			SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일 a hh:mm");
			
			// SimpleDateFormat 객체를 활용해 Calendar 객체를 사용해 사용자 포멧 문자열로 반환한다.
			// Calendar 객체 getTime 메소드를 이용하여 Date 객체로 반환한다.
			String today1 = s.format(c.getTime());
			
			//  isDirectory() 디렉토리면 true, 파일이면 false
			if(f2.isDirectory()) {
				System.out.print(f2.getName() + "(디렉토리) - ");
				System.out.println(today1);
			}// if 문 끝
			
		}// for문 끝
		
		
		for (String temp : list) {
			File f2 = new File(f, temp);
			long lastmod = f2.lastModified();
			c.setTimeInMillis(lastmod);
			SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일 a hh:mm");
			String today1 = s.format(c.getTime());
			
			if(f2.isFile()) {
				String size = String.format("%,d", f2.length());
				
				System.out.print(f2.getName() +"(파일) - "+ size+ "byte - " );
				System.out.println(today1);
			}// if 문 끝
			
		}// for 문 끝
		
		File f3 = new File("./", "test.txt");
		//파일 생성하면 true, 생성하지 못하면 false
//		f3.createNewFile();
		
		//파일을 삭제하면 true, 삭제하지 못하면 false
//		f3.delete();
		
		File f4 = new File("./upload/2022/12/12");
		//하위 디렉토리를 생성하면 true, 생성하지 못하면 false
		f4.mkdirs();
		
		
		File f5 = new File(f4, "test.txt");
		f5.createNewFile();
		
	}
	
	
	
	
	
}
