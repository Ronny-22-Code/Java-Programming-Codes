package java_29Sep2019_Lec_12;

import java.util.*;

public class Coin_Toss_Print_Approach_Recursion {

	static Scanner sc = new Scanner(System.in);

	public static void CoinToss(int n, String ans) {

		if (n == 0) {

			System.out.println(ans);

			return;

		}

		CoinToss(n - 1, ans + "H");

		CoinToss(n - 1, ans + "T");

	}

	public static void main(String[] args) {

		int n;

		System.out.println("Enter the number of cases");

		n = sc.nextInt();

		CoinToss(n, "");

	}

}
