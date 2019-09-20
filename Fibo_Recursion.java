package java14_sep_15_sep_2019;

import java.util.*;

public class Fibo_Recursion {

	static Scanner sc = new Scanner(System.in);

	public static int Fibo(int n) {

		if (n == 0 || n == 1) {

			return n;

		}

		else {

			return (Fibo(n - 1) + Fibo(n - 2));

		}

	}

	public static void main(String[] args) {

		int n, c, i = 0;

		System.out.println("Enter the number of terms required for the series");

		n = sc.nextInt();

		for (c = 0; c < n; c++) {

			System.out.println(Fibo(i));

			i++;

		}

	}

}
