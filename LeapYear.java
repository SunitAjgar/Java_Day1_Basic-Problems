//Q.1.7 Write a program to check leap year
package com.bridgelabz.practice;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year for checking Leap year ");
		int year = sc.nextInt();
		if (year >= 1582) {
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
				System.out.println("The entered year is a leap year");
			else
				System.out.println("The entered year is not a leap year");
		}
		else {
			System.out.println("Please Enter a year after 1582");
		}
	}
}
