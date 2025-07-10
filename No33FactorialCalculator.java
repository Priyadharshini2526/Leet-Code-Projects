package Leetcode;
import java.util.Scanner;

public class No33FactorialCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Get input from user
		System.out.println("Enter a number to find its factorial: ");
		int number = scanner.nextInt();
		
		long factorial = 1;
		
		//Check valid input
		if(number < 0) {
			System.out.println("Factorial is not defined for negative numbers.");
			
		}else {
			for(int i = 1; i<=number; i++) {
				factorial *= i;
			}
			System.out.println("Factorial of " + number + " is: " + factorial);
		}
		scanner.close();
	}

}
