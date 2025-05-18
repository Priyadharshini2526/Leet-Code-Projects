package Leetcode;
import java.util.Scanner;
public class No3ProductOfTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Take input from user
		System.out.print("Enter a first number: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter a second number: ");
		int num2 = scanner.nextInt();
		
		//Calculate product
		int product = num1 * num2;
		
		//Display result
		System.out.println("The product is: " + product);
		scanner.close();
	}

}
