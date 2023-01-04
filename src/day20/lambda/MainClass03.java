package day20.lambda;

import java.util.ArrayList;
import java.util.List;

public class MainClass03 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(4);
		numbers.add(6);
		numbers.add(8);
		numbers.add(13);
		numbers.add(3);
		numbers.add(15);
		
		
		int sum = fpSum(numbers);
			
		System.out.println(sum);

	}

	private static int fpSum(List<Integer> numbers) {
		return numbers.stream()
				.reduce(0, 
					(sum, number) ->  sum + number);
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum += number; 
		}
		return sum;
	}

}