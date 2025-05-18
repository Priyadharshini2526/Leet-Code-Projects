package Leetcode;
import java.util.Scanner;
public class No4ArithmeticOperations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		//Get input of two numbers
		System.out.println("Enter first number: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = scanner.nextInt();
		
		//Performing arithmetic operations
		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;
		int quotient = (num2 !=0) ? num1 / num2:0;
		int remainder = (num2 !=0) ? num1 % num2:0;
		
		//Display result
		System.out.println("Sum:" + sum);
		System.out.println("Difference:" + difference);
		System.out.println("Product:" + product);
		
		if (num2 !=0) {
		System.out.println("Quotient:" + quotient);
		System.out.println("Remainder:" + remainder);
		}
		else {
			System.out.println("Cannot divide by zero.");
			
		}
		scanner.close();
		
	}

}
