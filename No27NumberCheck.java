package Leetcode;
import java.util.Scanner;
public class No27NumberCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		if (number > 0) {
			System.out.println("The number is positive:");
		}else if (number < 0) {
			System.out.println("The number is negative:");
		}else {
			System.out.println("the number is zero:");
		}
		scanner.close();
	}

}
