package Leetcode;
import java.util.Scanner;
public class No11AreaofPrism {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of prism: ");
		double length = scanner.nextDouble();
		System.out.println("Enter the height of prism: ");
		double height = scanner.nextDouble();
		System.out.println("Enter the width of prism: ");
		double width = scanner.nextDouble();
		
		double surfaceArea = 2 * (length * width + width * height + height * length);
		double volume = length * width * height;
		
		System.out.println("Surface Area of the Prism: " + surfaceArea);
		System.out.println("Volume of the prism: " + volume);
		scanner.close();
	}

}
