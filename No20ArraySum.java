package Leetcode;
import java.util.Scanner;
public class No20ArraySum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Ask for array size
		System.out.println("Enter the number of elements in the array:");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		int sum = 0;
		
		//Input array elements
		System.out.println("Enter" + size + "integers:");
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
			sum += array[i];
			
		}
		System.out.println("Sum of array elements:" + sum);
		scanner.close();
	}

}
