package day17.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class MainClass02 {
	public static void main(String[] args) throws IOException {
		
		URL  url = new URL("https://n.news.naver.com/article/016/0002083822?ntype=RANKING#body");
		
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		String query = url.getQuery();
		String reference = url.getRef();
		
		System.out.println("protocol : " + protocol);
		System.out.println("host : " + host);
		System.out.println("query : " + query);
		System.out.println("reference : " + reference);
		
		InputStream in = url.openStream();
		
		InputStreamReader isr = new InputStreamReader(in, "EUC-KR");
		
		char[] c = new char[1024];
		int  readCharCnt = 0;
		while((readCharCnt = isr.read(c)) != -1) {
			System.out.print(new String(c, 0, readCharCnt));
		}
		
		isr.close();
		in.close();
		
	}
}
