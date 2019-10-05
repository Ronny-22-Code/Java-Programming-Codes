package java5thOct_6thOct_2019;

import java.util.*;

public class Coin_Change_Backtracking {

	static Scanner sc = new Scanner(System.in);

	public static void coin(int[] coins, int vidx, int target, String ans) {

		int i;

		if (target == 0) {

		System.out.println(ans);
		
		return;
		
		}

		if (target < 0 || vidx == coins.length) {

			return;
		}

		coin(coins, vidx, target - coins[vidx], ans + coins[vidx]);
		coin(coins, vidx + 1, target, ans);

	
	
	
	}

	public static void main(String[] args) {

		int i, n, target;

		System.out.println("Enter the number of coins:");

		n = sc.nextInt();

		int[] coins = new int[n];

		System.out.println("Enter the coins available:");

		for (i = 0; i < n; i++) {

			coins[i] = sc.nextInt();

		}

		System.out.println("Enter the target:");

		target = sc.nextInt();

		coin(coins, 0, target, "");

	}

}
