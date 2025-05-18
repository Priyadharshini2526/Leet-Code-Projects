package Leetcode;
import java.util.Scanner;
public class No6AreaOfCircle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Input radius
		System.out.println("Enter the radius of circle: ");
		double radius = scanner.nextDouble();
		
		//Calculate area
		double area = Math.PI * radius * radius;
		
		//Display result
		System.out.println("The area of the circle is: " + area);
		scanner.close();
		
	}

}
