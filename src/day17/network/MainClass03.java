package day17.network;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass03 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://n.news.naver.com/article/016/0002083822?ntype=RANKING#body");
		// URLConnection 객체 생성
		// 1. URLConnection은 서버의 헤더 정보를 얻을 수 있음
		// 2. 서버의 리소스(HTML)를 스트림으로 얻어 올 수 있음
		URLConnection urlConn = url.openConnection();

		// getHeaderFields() 메서드는 헤더의 정보를 Map으로 반환
		// key - String , value - List<String>
		// 23-35까지 url의 헤더정보를 얻어온 예제
		Map<String, List<String>> headMap = urlConn.getHeaderFields();

		Set<String> set = headMap.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			List<String> listValue = headMap.get(key);
			System.out.print(key + " : ");
			for (String values : listValue) {
				System.out.print(values + " ");
			}
			System.out.println();
		}

		// getInputStream() 메서드는 URLConnection에서 url의 입력
		// 스트림을 얻어온다.

		// InputStream in = url.openStream();
		InputStream in = urlConn.getInputStream();
		InputStreamReader isr = new InputStreamReader(in, "utf-8");

		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while ((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		}
	}

}