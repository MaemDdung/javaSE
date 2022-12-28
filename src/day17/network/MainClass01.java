package day17.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainClass01 {
	public static void main(String[] args) throws UnknownHostException {
		//InetAddress 는 ip를 관리하는 클래스
		//getLocalHost()는 로컬 시스템의 ip를 InetAddress 객체로 반환
		InetAddress ia = InetAddress.getLocalHost();
		
		System.out.println("host Name : " + ia.getHostName());
		
		
//		getHostAddress()는 
		System.out.println("host ip : "+ ia.getHostAddress());
		
		
		ia = InetAddress.getByName("www.naver.com");
		
		System.out.println("host Name : " + ia.getHostName());
		System.out.println("host ip : "+ ia.getHostAddress());
	}
}
