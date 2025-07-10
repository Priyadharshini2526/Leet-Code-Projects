package Leetcode;

import java.util.Scanner;

public class No26DaysInMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month (1-12): ");
		int month = sc.nextInt();
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		sc.close();
		int days = switch (month) {
		case 1, 3, 5, 7, 8, 10, 12 -> 31;
		case 4, 6, 9, 11 -> 30;
		case 2 -> ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
		default -> -1;
		};
		if (days == -1)
			System.out.println("Invalid month!");
		else
			System.out.println("Days: " + days);
	}

}
