package Leetcode;
import java.util.Scanner;
public class No10AreaofParalogram {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Input base and height
		System.out.println("Enter the base of the paralogram: ");
		double base = scanner.nextDouble();
		System.out.println("Enter the height of the paralogram: ");
		double height = scanner.nextDouble();
		//Calculate area
		double area = base * height;
		
		//Display result
		System.out.println("Area of Paralogram: " + area);
		scanner.close();
	}

}
