package class31Aug_1Sep_2019;

import java.util.*;

public class Reverse_Array {

	static Scanner sc = new Scanner(System.in);

	public static void Reverse(int[] a, int n) {

		int i = 0, j = n - 1;

		int[] b = new int[n];
		
		for(i=0;i<n;i++) {
			
			b[j] = a[i];
			j--;
		}
		
		System.out.println("The reversed array elements are as follows:");

		for (i = 0; i < n; i++) {

			System.out.println(b[i]);

		}
	}

	public static void main(String[] args) {

		int n, i;

		System.out.println("Enter the number of array elements:");

		n = sc.nextInt();

		System.out.println("Enter the array elements:");

		int[] a = new int[n];

		for (i = 0; i < n; i++) {

			a[i] = sc.nextInt();

		}

		Reverse(a, n);

	}

	
}
