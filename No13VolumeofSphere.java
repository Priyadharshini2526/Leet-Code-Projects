package Leetcode;
import java.util.Scanner;
public class No13VolumeofSphere {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the radius of the sphere: ");
		double radius = scanner.nextDouble();
		
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		
		System.out.println("Volume of the Sphere: " + volume);
		scanner.close();
	}

}
