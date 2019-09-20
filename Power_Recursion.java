package java14_sep_15_sep_2019;

import java.util.*;

public class Power_Recursion {

	static Scanner sc = new Scanner(System.in);

	public static int power(int a, int b) {

		if (b == 0) {

			return 1;

		}

		else {

			return (a * power(a, b - 1));

		}

	}

	public static void main(String[] args) {

		int a, b;

		System.out.println("Enter the base of the exponent:");

		a = sc.nextInt();

		System.out.println("Enter the power of the number:");

		b = sc.nextInt();

		int k = power(a, b);

		System.out.println("The power of the number is calculated as :");

		System.out.println(k);

	}

}
