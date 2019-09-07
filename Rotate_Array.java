package Classes_7sep_8sep_2019;

import java.util.*;

public class Rotate_Array {

	static Scanner sc = new Scanner(System.in);

	public static void Rotate(int[] a, int n, int k) {

		int i, j, temp;

		for (j = 0; j < k; j++) {

			temp = a[n - 1];

			for (i = n - 1; i > 0; i--) {

				a[i] = a[i - 1];

			}
			a[0] = temp;

		}

		
		System.out.println("The rotated array is:");

		for (i = 0; i < n; i++) {

			System.out.println(a[i]);

		}

	}

	public static void main(String[] args) {

		int n, i, k;

		System.out.println("Enter the size of the array:");

		n = sc.nextInt();

		int[] a = new int[n];

		System.out.println("Enter the array elements:");

		for (i = 0; i < n; i++) {

			a[i] = sc.nextInt();

		}

		System.out.println("Enter the rotation of the array:");

		k = sc.nextInt();

		Rotate(a, n, k);

	}

}
