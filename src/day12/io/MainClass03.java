package day12.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.Buffer;


/*
 *  BufferedInputStream / BufferedOutputStream
 *  - 버퍼 보조스트림
 * 	- 성능도 더 향상된다.
 * 	- 병목현상
 *  
 */
public class MainClass03 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		
		try {
			// hello.txt 파일을 읽기 위한 객체
			fis = new FileInputStream("./upload/hello.txt");
			
			File f4 = new File("./upload");
			//하위 디렉토리를 생성하면 true, 생성하지 못하면 false
			f4.mkdirs();
			
			
			File f5 = new File(f4, "hello2.txt");
			f5.createNewFile();
			
			
			// hello2.txt에 쓰기위한 객체
			// FileOutputStream 디렉토리 경로는 존재한다.
			// 파일은 없으면 자동으로 생성된다.
			fos = new FileOutputStream(f5);
			bos = new BufferedOutputStream(fos);
			
			//
			ps = new PrintStream(bos, true);
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			//fis.read(b) => b 길이만큼 읽어서 b에 저장
			// 읽은 길이값 readByteCnt에 저장
			while((readByteCnt = fis.read(b)) != -1) {
				// fos.write() => b 데이터 readbyteCnt 길이만큼 쓰기
				bos.write(b, 0, readByteCnt);
			}
			
			bos.flush();//남은 데이터를 쏟아내라!
			
			ps.println();
			ps.print("=======================================");
			ps.println("PrintStream으로 남겨요!!!");
			
		} catch (Exception e) {

		}finally {
			if(ps != null)ps.close();
			if(bos != null)bos.close();
			if(bis != null)bis.close();
			if(fos != null)fos.close();
			if(fis != null)fis.close();
			
		}
		
		System.out.println("실행 완료");
		
		
	}
}
