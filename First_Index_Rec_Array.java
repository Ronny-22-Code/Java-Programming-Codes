package java14_sep_15_sep_2019;

import java.util.*;

public class First_Index_Rec_Array {

	static Scanner sc = new Scanner(System.in);

	public static int Index(int[] a, int n, int v, int i) {

		int k;
		
			if (i == n - 1) {

				return -1;

			}

			k = Index(a, n - 1, v, i + 1); 
			
			if (a[i] == v) {

				return i;

			}

			else {

				return k;

			}

		}

	

	public static void main(String[] args) {

		int i = 0, n, v;

		System.out.println("Enter the size of the array :");

		n = sc.nextInt();

		System.out.println("Enter the array elements:");

		int[] a = new int[n];

		for (i = 0; i < n; i++) {

			a[i] = sc.nextInt();

		}

		System.out.println("Enter the value to find:");

		v = sc.nextInt();

		int f = Index(a, n, v, 0);

		System.out.println(f);

	}

}
