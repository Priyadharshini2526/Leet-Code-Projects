package Leetcode;
import java.util.Scanner;
public class No18Substring {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = scanner.nextLine();
		
		System.out.println("Enter the start position (0-based index): ");
		int start = scanner.nextInt();
		
		System.out.println("Enter the end position (exclusive): ");
		int end = scanner.nextInt();
		
		//Validate input and extract string
		if (start >= 0 && end <= input.length() && start < end ) {
			String substring = input.substring(start, end);
			System.out.println("Substring: " + substring);
			
		}else {
			System.out.println("Invalid positions. Please ensure 0 <= start < end <= string length.");
		}
		scanner.close();
 	}

}
