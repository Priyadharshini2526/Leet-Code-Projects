package Leetcode;
import java.util.Scanner;
public class No16ToLowerCase {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = scanner.nextLine();
		String lowerCaseString = input.toLowerCase();
		System.out.println("Lowercase String: " + lowerCaseString);
		scanner.close();
	}

}
