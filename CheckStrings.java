//Q 1.3  Write a program to check two strings are equal or not. 

package com.bridgelabz.practice;

public class CheckStrings {

	public static void main(String[] args) {

		String str = "Bridgelabz";
		String var = "Bridgelabz";

		// 1st approach to check if two strings are equal or not.

		if (str == var) {
			System.out.println("Both Strings are equal");
		} else {
			System.out.println("Both are not equal");
		}
		System.out.println(str == var);

		// 2nd approach/solution is to check by equals method of String Class

		String a = "practice";
		String b = "PRACTICE";
		if (str.equals(var) == true) {
			System.out.println("Both strings are equal");
		} else {
			System.out.println("Both Strings are not equal");
		}

		if (a.equalsIgnoreCase(b) == true) {
			System.out.println("Both strings are equal");
		} else {
			System.out.println("Both Strings are not equal");
		}

		// 3rd approach/solution is to check by compare method of String Class

		String m = "Alfa";
		String n = "Bridgelabz";
		if (m.compareTo(n) == 0) {
			System.out.println("Both strings are equal");
		} else {
			System.out.println("Both Strings are not equal");
		}
	}
}
