package day09.lang;

import java.util.Iterator;

/*
 * [[String Class]]
 * 	불변의 객체 - 메모리에서 문자열 값이 변경되지 않는다.
 * 	1. 메모리 절약
 * 	2. 보안성 향상
 * 	3. 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));

		str1 = "def";
		
		System.out.println(System.identityHashCode(str1));
		
		
		//langth 길이
		String txt = "ABCDEFGHIJK";
		System.out.println("The length of the txt string is : "+ txt.length());
		
		//문자열이 지정한 문자로 시작 하는지 판단 
		String str4 = "apple";
		boolean startWith = str4.startsWith("a");
		System.out.println("startWith :"+ startWith);
		
		//문자열 마지막에 지정한 문자가 있는지 판단
		String str5 = "test";
		boolean endWith = str5.endsWith("t");
		System.out.println("endWith :"+ endWith);
		
		//문자 인데스 번호 반환
		String str6 = "abcdef";
		int indexOf = str6.indexOf("d");
		System.out.println("indexOf :"+ indexOf);
		
		//문자열에 지정한 문자가 마지막 몇번째에 있는지 int를 반환한다.
		String str7 = "AndroidApp";
		int lastIndexOf = str6.lastIndexOf("A");
		System.out.println("lastIndexOf :"+ lastIndexOf);
		
		//문자 치환
		String str8 = "A*B*C*D";
		String replace = str8.replace("*","-");
		System.out.println("replace :"+ replace);
		
		
		//문자열 나누기 (배열로 반환)
		String str9 = "A:B:C:D:abcd";
		String[] split = str9.split(":");
		for (int i = 0; i < split.length; i++) {
			System.out.println("split["+i+"] :"+ split);
		}
		
		
		//문자열 절삭
		String str10 = "ABCDEF";
		String substring = str10.substring(0, 2);
		System.out.println("substring :"+ substring);
		
		
		//소문자 변환
		String str11 = "abcDEF";
		String toLowerCase = str11.toLowerCase();
		System.out.println("toLowerCase :"+ toLowerCase);
		
		
		//대문자 변환
		String str12 = "abcDEF";
		String toUpperCase = str12.toUpperCase();
		System.out.println("toUpperCase :"+ toUpperCase);
		
		
		//공백 제거1
		String s1 = "           JAVA  JAVA    JAVA              ";
		String v1;
		v1 = s1.trim();
		System.out.println("trim로 공백 제거 :"+ v1);
		
		
		//공백 제거2
		String s2 = "           JAVA  JAVA    JAVA              ";
		String v2;
		v2 = s2.replace(" ", "");
		System.out.println("replace로 공백 제거 :"+ v2);
		
		
		
		//문자 비교
		String str13 = "A";
		String str14 = "B";
		int compareTo = str13.compareTo(str14);
		if (compareTo > 0) {
			System.out.println(str13 + ">" + str14);
		}else if (compareTo == 0) {
			System.out.println(str13 + "=" + str14);
		}else {
			System.out.println(str13 + "<" + str14);
		}
		
		//문자 포함 여부
		String str15 = "abcd";
		String str16 = "c";
		boolean contains = str15.contains(str16);
		System.out.println("contains :" + contains);
		
		
		//문자열 추가 변경할때 주로 사용하는 자료형
		//Thread safe
		StringBuffer sb = new StringBuffer();
		//문자열 추가
		sb.append("abc");
		System.out.println(System.identityHashCode(sb));
		sb.append("def");
		System.out.println(System.identityHashCode(sb));
		
		//StringBuffer 동일 그러니 Thread safe 이 아니다.
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("abc");
		sBuilder.append("def");
		
		
		String str17 = "abc";
		str17 +="def";
		
		
	}
}
