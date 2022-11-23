package day04.array;

public class MainClass02 {
	public static void main(String[] args) {
		//배열객체 생성하기
		String[] names = new String[6];
		names[0] = "피카츄";
		names[1] = "라이츄";
		names[2] = "파이리";
		names[3] = "꼬부기";
		names[4] = "버터플";
		names[5] = "야도란";
		
		//값 가져오기
		System.out.println(names[3]);
		
		//배열의 길이
		System.out.println(names.length);
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//배열 값 변경
		names[4] = "잠만보";
		
		
		System.out.println("확장 for문!!");
		//확장 for문을 이용해서 출력하기
		for(String tmp : names) {
			 System.out.println(tmp);
		}
		
		
		
	}
}
