package pack24_25Aug2019;

import java.util.*;

public class Func_Armstrong {

	public static void main(String[] args) {

		int n;

		System.out.println("Enter the number to check whether it is an armstorng or not:");

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		checknumberofdigits(n);

	}

	public static void checknumberofdigits(int n) {

		int k = 0, r;

		while (n > 0) {

			r = n % 10;

			k++;

			n = n / 10;

		}

	}

	public static boolean Armstrong(int n, int k) {

		int r, i, b = 0;

		int d = n;

		while (n > 0)

		{

			r = n % 10;

			for (i = 0; i < k; i++) {

				b = b + (int) Math.pow(r, k);

				n = n / 10;

			}

		}

		if (d == b) {

			return true;

		}

		else {

			return false;

		}

	}
}
