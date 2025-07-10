package Leetcode;

import java.util.Scanner;

public class No23ValueChecker {
	public static void main (String[] args) {
		int[] numbers = {3, 8, 15, 22, 31, 47};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value to search in the array: ");
		int target = scanner.nextInt();
		scanner.close();
		
		boolean found = false;
			for(int number : numbers) {
				if (number == target) {
					found = true;
					break;
				}
			}
			if (found) {
				System.out.println("The array contains the value " + target);
			}else {
				System.out.println("The array does not contain the value " + target + ".");
			}
	}

}
