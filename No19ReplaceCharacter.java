package Leetcode;
import java.util.Scanner;
public class No19ReplaceCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();
		String replacedString = input.replace('d','f');
		System.out.println("Modified string:" + replacedString);
		scanner.close();
	}

}
