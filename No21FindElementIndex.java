package Leetcode;
import java.util.Scanner;
public class No21FindElementIndex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		
		//input array elements
		System.out.println("Enter" + size + "integers:");
		for (int i = 0; i <size;i++) {
		array[i] = scanner.nextInt();
		}
		System.out.println("Enter the element to find:");
		int target = scanner.nextInt();
		
		int index = -1;
		for (int i = 0;i<size; i++) {
			if(array[i] == target)
			{
				index = i;
				break;
			}
		}
		if (index != -1) {
			System.out.println("Element found at index: " + index);
		}
		scanner.close();
	}

}
