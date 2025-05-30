package Leetcode;
import java.util.Scanner;
public class No15ConcateTwoStrings {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String str1 = scanner.nextLine();
		System.out.println("Enter the second string:");
		String str2 = scanner.nextLine();
		
		String result = str1 + str2;
		System.out.println("Concatenated string: " +result);
		scanner.close();
		
	}

}
