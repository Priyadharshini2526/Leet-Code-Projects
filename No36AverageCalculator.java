package Leetcode;

public class No36AverageCalculator {
	//Method to calculate average of three numbers
	public static double CalculateAverage(int a, int b, int c) {
		return (a + b + c) / 3.0;
	}
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		double average = CalculateAverage(num1, num2, num3);
		System.out.println("Average of the three numbers is: " + average);
		
	}
}
