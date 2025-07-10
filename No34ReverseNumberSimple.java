package Leetcode;
import java.util.Scanner;
public class No34ReverseNumberSimple {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		int reverse = 0;
		while(number!=0) {
			int digit = number % 10;
			//Get last digit
			reverse = reverse * 10 + digit;
			//Add digit to reverse
			number = number / 10;
		}
		System.out.println("Reversed number is: " + reverse);
		input.close();	}

}
