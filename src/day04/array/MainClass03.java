package day04.array;

public class MainClass03 {
	public static void main(String[] args) {
		// new 연산자 사용하지 않고 직접 배열 값 대입하기
				String[] names = {"피카츄", "라이츄", "파이리", "꼬부기", "질퍽이"};
				
				// 배열의 내용 출력해보기
				for(int i=0; i < names.length; i++) {
					System.out.println(names[i]);
				}
				
				// 확장 for 문
				for(String tmp : names) {
					System.out.println(tmp);
				}
		
	}
}
