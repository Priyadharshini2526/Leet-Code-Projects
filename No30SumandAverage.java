package Leetcode;
import java.util.Scanner;

public class No30SumandAverage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int number;
		int totalNumbers = 5;
		
		System.out.println("Enter 5 numbers: ");
		for(int i=1; i<=totalNumbers; i++) {
			System.out.println("Number" + i + ":");
			number = scanner.nextInt();
			sum += number;
		}
		double average = (double) sum/totalNumbers;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
		scanner.close();
	}

}
