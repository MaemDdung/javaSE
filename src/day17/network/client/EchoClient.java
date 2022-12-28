package day17.network.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class EchoClient {
	public static void main(String[] args) throws IOException {
		Socket socket = null; 
		OutputStream out = null;
		InputStream in = null;
		
		try {
			// 3. localhost,3000번 포트로 접속을 시도한다.
			socket = new Socket("localhost", 3000);
			
			// 4. Socket 을 이용하여 바이트 출력 스트림 객체 생성한다.
			out = socket.getOutputStream();
			
			// 5. getBytes() 메소드는 문자열 Byte[]로 바꿔 준다.
			out.write("피카츄! 라이츄!".getBytes());
			
			// 7. Socket를 이용하여 바이트 입력 스트림 객체 생성
			in = socket.getInputStream();
			byte[] b = new byte[1024];
			
			// 9. 서버에서 보내온 데이터를 읽어서 b에 저장함 .
			int readByteCnt = in.read(b);
			
			System.out.println(new String(b, 0, readByteCnt));
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(in != null)in.close();
			if(out != null)out.close();
			if(socket != null)socket.close();
		}
		
	
		
	}
	
}
