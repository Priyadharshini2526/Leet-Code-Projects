package Leetcode;
import java.util.Scanner;
public class No14VolumeofCylinder {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the radius of the cylinder: ");
		double radius = scanner.nextDouble();
		System.out.println("Enter the height of the cylinder: ");
		double height = scanner.nextDouble();
		
		double volume = Math.PI * Math.pow(radius, 2) * height;
		System.out.println("Volume of the cylinder: " + volume);
		scanner.close();
	}

}
