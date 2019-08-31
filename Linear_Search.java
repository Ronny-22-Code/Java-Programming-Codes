package class31Aug_1Sep_2019;

import java.util.*;

public class Linear_Search {

	static Scanner sc = new Scanner(System.in);

	public static int Search(int n, int[] a, int d) {

		int i;

		for (i = 0; i < n; i++) {

			if (a[i] == d) {

				System.out.println("The Element was found in the array at:");

				return i;

			}

		}

		return -1;

	}

	public static void main(String[] args) {

		int i, n, d;

		System.out.println("Enter the number of elements ");

		n = sc.nextInt();
		int[] a = new int[n];

		System.out.println("Enter the array elements:");

		for (i = 0; i < n; i++) {

			a[i] = sc.nextInt();

		}

		System.out.println("Enter the data element to search:");

		d = sc.nextInt();

		int idx = Search(n, a, d);
		System.out.println(idx);

	}

}
