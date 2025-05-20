package Leetcode;
import java.util.Scanner;
public class No9EquilateralTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the sides of Equilateral Triangle:");
		double side = scanner.nextDouble();
		
		double area = (Math.sqrt(3)/(4)) * side * side;
		
		System.out.println("The area of the equilateral triangle is:" + area);
		
		scanner.close();
	}

}
