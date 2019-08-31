package class31Aug_1Sep_2019;

import java.util.*;

public class Max_Element {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n, i;

		System.out.println("Enter the number of elements:");

		n = sc.nextInt();

		int[] a = new int[n];

		System.out.println("Enter the array elements:");

		for (i = 0; i < n; i++) {

			a[i] = sc.nextInt();

		}

		int max = Max(n, a);

		System.out.println("The maximum element in the array is :");

		System.out.println(max);

	}

	public static int Max(int n, int[] a) {

		int m, i;

		m = a[0];

		for (i = 0; i < n; i++) {

			if (m < a[i]) {

				m = a[i];

			}

		}
		return m;

	}

}
