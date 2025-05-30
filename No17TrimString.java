package Leetcode;
import java.util.Scanner;
public class No17TrimString {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string with space: ");
		String input = scanner.nextLine();
		String trimmed = input.trim();
		System.out.println("Trimmed string: " + trimmed );
		scanner.close();
	}

}
