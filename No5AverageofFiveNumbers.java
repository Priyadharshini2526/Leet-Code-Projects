package Leetcode;
import java.util.Scanner;
public class No5AverageofFiveNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 5;
		  
		//Get 5 inputs from user
		for (int i=1;i<=count;i++) {
			System.out.println("Enter number " + i + ":");
			int number = scanner.nextInt();
			sum += number;
		}
		
		//Calculate average
		double average = (double) sum/count;
		
		//Display average
		System.out.println("The average is: " + average);
		scanner.close();
	}

}
