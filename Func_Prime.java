package pack24_25Aug2019;

import java.util.*;

public class Func_Prime {

	public static void AllPrimes(int lo, int hi) {

		int i;

		for (i = lo; i < hi; i++) {

			boolean res = isPrime(i);

			if (res == true) {

				System.out.println(i);

			}

		}

	}

	public static boolean isPrime(int n) {

		int j;

		for (j = 2; j < n; j++) {

			if (n % j == 0) {

				return false;

			}
		}
		if (j == n) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {

		int n, lo, hi;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the lower limit");

		lo = sc.nextInt();

		System.out.println("Enter the upper limit");

		hi = sc.nextInt();

		AllPrimes(lo, hi);

	}

}
