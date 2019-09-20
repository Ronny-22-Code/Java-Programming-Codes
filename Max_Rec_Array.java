package java14_sep_15_sep_2019;

import java.util.*;

public class Max_Rec_Array {

	static Scanner sc = new Scanner(System.in);

	public static int RecMax(int[] a, int n) {

		if (n == 1) {

			return a[0];
		}

		else {

			return Max(RecMax(a, n - 1), a[n - 1]);

		}

	}

	public static int Max(int n, int m) {

		if (n > m) {

			return n;

		}
		return m;

	}

	public static void main(String[] args) {

		int n, i;

		System.out.println("Enter the number of elements in the array:");

		n = sc.nextInt();

		int[] a = new int[n];

		System.out.println("Enter the array elements:");

		for (i = 0; i < n; i++) {

			a[i] = sc.nextInt();

		}

		int max = RecMax(a,n);

		System.out.println("The maximum element from the array:");
	
		System.out.println(max);
	
	}

}
