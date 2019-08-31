package class31Aug_1Sep_2019;

import java.util.*;

public class Binary_Search {

	static Scanner sc = new Scanner(System.in);

	public static int Search(int n, int[] a, int d) {

		int i, l = 0, h = n - 1, m;

		while (l <= h) {

			m = (l + h) / 2;

			if (a[m] == d) {

				System.out.println("The Element was found at:");

				return m ;

			}

			else if (a[m] < d) {

				l = m + 1;

			}

			else {

				h = m - 1;

			}

		}
		return -1;

	}

	public static void main(String[] args) {

		int n, f, i, d;

		System.out.println("Enter the number of elements:");

		n = sc.nextInt();

		int[] a = new int[n];

		System.out.println("Enter the array elements:");

		for (i = 0; i < n; i++) {

			a[i] = sc.nextInt();

		}

		System.out.println("Enter the data element to search:");

		d = sc.nextInt();

		f = Search(n, a, d);

		System.out.println(f);

	}

}
