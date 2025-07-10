package Leetcode;

public class No44DoubleIsIntegerCheck {
	public static void main(String[] args) {
		double number1 = 10.0;
		double number2 = 10.25;
		
		System.out.println(number1 + " is a integer?" + isInteger(number1));
		
		System.out.println(number2 + " is a integer?" + isInteger(number2));
		
	}
public static boolean isInteger(double num) {
	return num == Math.floor(num);
}
}
