package day12.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainClass01 {
	public static void main(String[] args) {
		File f = new File("c:\\");
		
		String[] list = f.list();
		
		Calendar c = Calendar.getInstance();
		
		for(String temp : list) {
			File f2 = new File(f, temp);
			
			long lastMod = f2.lastModified();
			
			c.setTimeInMillis(lastMod);
			
			SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일 a hh:mm");
			
			String today1 = s.format(c.getTime());
			
			if(f2.isDirectory()) {
				System.out.println(f2.getName() + "(디렉토리) -");
				System.out.println(today1);
			}
			
		}
		
		
		
		
	}
	
	
	
	
	
}
