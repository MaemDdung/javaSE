package day17.network.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * [[소켓(Socket)]]
 * TCP/IP 기반 네트워크 통신에서 테이터 송수신의 마지막 접점을 말한다.
 * 소켓 통신 => 서버-클라이언트간 데이털 주고 받는 양방향 연결 지향성 통신.
 * 
 */
public class EchoServer {
	public static void main(String[] args) throws IOException  {
		ServerSocket ServerSocket = null;  
		Socket s = null;
		InputStream in = null;
		OutputStream out = null;
		
		
		
		try {
			// 1. 3000번 Port로 ServerSocket 객체생성
			ServerSocket= new ServerSocket(3000);
			
			System.out.println("클라이언트 요청 대기중 ...");
			
			// 2. accept() 메서드는 클라이언트의 요청이 들어오면
			// 클라이언트와 통신 할 수 있는 Socket 객체를 생성한다.
			s = ServerSocket.accept();
			
			System.out.println("클라이언트 요청 수락 ...");
			
			// 6. Socket 객체를 이용해서 InputStream 객체를 생성한다.
			in = s.getInputStream();
			
			byte[] b = new byte[1024];
			
			// 클라이언트에서 보낸 메세지 읽어서 저장
			int readByteCnt = in.read(b);
			
			System.out.println(new String(b, 0, readByteCnt));
			
			// 8. 응답 데이터 돌려주기
			out = s.getOutputStream();
			out.write(b, 0, readByteCnt);
			
			out.close();
			in.close();
			s.close();
			ServerSocket.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(out != null)out.close();
			if(in != null)in.close();
			if(s != null)s.close();
			if(ServerSocket != null)ServerSocket.close();
		}
		
		
		
	}
	
	
}
