package day03.conditional;

public class MainClass02 {
	public static void main(String[] args) {
		int score = 80;
		String result = null;
		
		if(score >= 90) {
			result = "수";
		}else if(score >= 80) {
			result = "우";
		}else if(score >= 70) {
			result = "양";
		}else if(score >= 60) {
			result = "미";
		}else {
			result = "가"; 
		}
	}
}
