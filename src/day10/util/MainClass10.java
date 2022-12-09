package day10.util;

import java.util.LinkedList;
import java.util.Queue;

/*
 * [[ Queue ]]
 * 	- 배열성 인터페이스
 * 	- 선입선출(FIFO) : 먼저 들어온 값이 먼저 나간다.
 */
public class MainClass10 {
	
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("피카츄");
		queue.offer("라이츄");
		queue.offer("파이리");
		
	}
	
}
