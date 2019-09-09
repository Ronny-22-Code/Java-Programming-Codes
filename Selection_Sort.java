package Classes_7sep_8sep_2019;

import java.util.*;

public class Selection_Sort {

	static Scanner sc = new Scanner(System.in);

	public static void sort(int[] a, int n) {

		int i, min, j;

		for (i = 0; i < n - 1; i++) {

			min = i;

			for (j = i + 1; j < n ; j++) {

				if (a[j] < a[min]) {

					int temp = a[min];

					a[min] = a[j];

					a[j] = temp;

				}

			}

		}

		System.out.println("The sorted array elements are:");

		for (i = 0; i < n; i++) {

			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {

		int n, i;

		System.out.println("Enter the size of the array:");

		n = sc.nextInt();

		int[] a = new int[n];

		System.out.println("Enter the array elements:");

		for (i = 0; i < n; i++) {

			a[i] = sc.nextInt();

		}

		sort(a, n);

	}

}
