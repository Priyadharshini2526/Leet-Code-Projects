package Leetcode;

public class No24MinMaxFinder {
	public static void main(String[] args) {
		int[] numbers = {25, 12, 89, 3, 56, 74, 10};
		
		int min = numbers[0];
		int max = numbers[0];
		
		for(int number : numbers) {
			if(number < min) {
				min = number;
			}
			if(number > max) {
				max = number;
			}
		}
		System.out.println("Minimum value in the array: " + min);
		System.out.println("Maximum value in the array: " + max);
	}

}
