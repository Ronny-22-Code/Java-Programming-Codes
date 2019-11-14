package Lec_28;

import java.util.*;

public class DP {

	static Scanner sc = new Scanner(System.in);

	public static int fibo(int n) {

		int fib1;

		if (n == 0 || n == 1) {

			return n;
		}

		fib1 = fibo(n - 1) + fibo(n - 2);

		return fib1;

	}

	public static int fiboTD(int n, int[] a) {

		if (n == 0 || n == 1) {

			return n;
		}

		if (a[n] != 0) {

			return a[n];
		}

		int fib1 = fiboTD(n - 1, a) + fiboTD(n - 2, a);

		a[n] = fib1;

		return a[n];

	}

	public static int fiboBU(int n) {

		int[] a = new int[n + 1];

		a[0] = 0;

		a[1] = 1;

		for (int i = n; i >= 2; i--) {

			a[i] = a[i - 1] + a[i - 2];

		}

		return a[0];

	}

	public static int fiboSE(int n) {

		int s = 0;

		int[] a = new int[2];

		a[0] = 0;

		a[1] = 1;

		for (int i = 0; i <= n - 1; i++) {

			s = a[0] + a[1];

			a[0] = a[1];

			a[1] = s;

		}

		return a[1];

	}

	public static int Maze(int cr, int cc, int er, int ec, String s) {

		int c = 0;

		if (cr == er && cc == ec) {

			System.out.print(s + " ");
			return 1;

		}

		if (cr > er || cc > ec) {

			return 0;

		}

		if (cr < er && cc < ec) {

			c += Maze(cr + 1, cc, er, ec, "V");

			c += Maze(cr, cc + 1, er, ec, "H");

			c += Maze(cr + 1, cc + 1, er, ec, "D");

			return c;

		}
		return 0;

	}

	public static int mazePath(int cr, int cc, int ec, int er, int[][] a) {

		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		if (a[cr][cc] != 0) {
			return a[cr][cc];
		}

		int cnt = 0;

		cnt += mazePath(cr + 1, cc, ec, er, a);
		cnt += mazePath(cr, cc + 1, ec, er, a);

		return a[cr][cc] = cnt;

	}

	public static int mazePathBU(int er, int ec) {

		int[][] a = new int[er + 2][ec + 2];

		for (int row = er; row >= 0; row--) {

			for (int col = ec; col >= 0; col--) {

				if (row == er && col == ec) {
					a[row][col] = 1;
					continue;
				}

				a[row][col] = a[row + 1][col] + a[row][col + 1];

			}
		}

		return a[0][0];

	}

	public static int MazeBUSE(int cr, int cc, int er, int ec) {

		int[] a = new int[ec + 2];

		for (int row = er; row >= 0; row--) {

			for (int col = ec; col >= 0; col--) {

				if (row == er && col == ec) {
					a[col] = 1;
					continue;
				}

				a[col] = a[col] + a[col + 1];

			}

		}
		return a[0];

	}

	public static int MazeBUSEdia(int cr, int cc, int er, int ec) {

		int[] a = new int[ec + 2];

		for (int row = er; row >= 0; row--) {

			int dia = 0;

			for (int col = ec; col >= 0; col--) {

				if (row == er && col == ec) {
					a[col] = 1;
					continue;
				}

				int temp = a[col] + a[col + 1] + dia;

				dia = a[col];

				a[col] = temp;

			}

		}
		return a[0];

	}

	public static int boardPath(int curr, int end) {

		int ans = 0;

		if (curr == end) {

			return 1;

		}

		if (curr > end) {

			return 0;

		}

		for (int dice = 1; dice <= 6; dice++) {

			ans = ans + boardPath(curr + dice, end);
		}

		return ans;

	}

	public static int boardPathTD(int curr, int end, int[] a) {

		if (curr == end) {

			return 1;

		}
		if (curr > end) {
			return 0;
		}
		if (a[curr] != 0) {

			return a[curr];
		}
		int ch = 0;
		for (int dice = 1; dice <= 6; dice++) {

			ch += boardPathTD(curr + dice, end, a);
		}
		a[curr] = ch;
		return ch;

	}

	public static int boardPathBU(int curr, int end) {

		if (curr == end) {

			return 1;

		}

		int[] a = new int[end + 6];

		for (int i = end - 1; i >= curr; i--) {

			for (int dice = 1; dice <= 6; dice++) {

				a[i] = a[i] + a[i + dice];

			}
		}

		return a[0];
	}

	public static int boardPathBUSE(int curr, int end) {

		int[] a = new int[6];

		int s;

		a[0] = 1;

		for (int i = 1; i <= end; i++) {

			s = 0;

			for (int j = 0; j < 6; j++) {
				s += a[j];
			}

		}
		return a[0];

	}

	public static int LCS(String s1, String s2) {

		int l1 = s1.length();

		int l2 = s2.length();

		int sp, fp;

		if (l1 == 0 || l2 == 0) {

			return 0;
		}

		char ch1 = s1.charAt(0);

		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);

		String ros2 = s2.substring(1);

		int ans = 0;

		if (ch1 == ch2) {

			return ans = LCS(ros1, ros2) + 1;
		}

		else {

			fp = LCS(s1, ros2);

			sp = LCS(ros1, s2);
		}

		return Math.max(fp, sp);

	}

	public static int LCSTD(String s1, String s2, int[][] ab) {

		int l1 = s1.length();

		int l2 = s2.length();

		int sp, fp;

		if (l1 == 0 || l2 == 0) {

			return 0;
		}

		if (ab[l1][l2] != -1) {

			return 0;
		}

		char ch1 = s1.charAt(0);

		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);

		String ros2 = s2.substring(1);

		int ans = 0;

		if (ch1 == ch2) {

			return ans = LCSTD(ros1, ros2, ab) + 1;
		}

		else {

			fp = LCSTD(s1, ros2, ab);

			sp = LCSTD(ros1, s2, ab);
		}

		ans = Math.max(fp, sp);

		return ab[l1][l2] = ans;

	}

	public static int LCSBU(String s1, String s2) {

		int l1 = s1.length();

		int l2 = s2.length();

		int[][] ab = new int[l1 + 1][l2 + 1];

//		if (l1 == 0 || l2 == 0) {
//
//			return 0;
//		}

		for (int r = l1; r >= 0; r--) {

			for (int c = l2; c >= 0; c--) {

				if (r == s1.length() || c == s2.length()) {

					ab[r][c] = 0;

					continue;
				}

				char ch1 = s1.charAt(r);

				char ch2 = s2.charAt(c);

				int ans = 0;

				if (ch1 == ch2) {

					ans = ab[r + 1][c + 1] + 1;
				}

				else {

					int fp = ab[r + 1][c];

					int sp = ab[r][c + 1];
					ans = Math.max(fp, sp);

				}

				ab[r][c] = ans;

			}

		}

		return ab[0][0];
	}

	public static int LCSBUSE(String s1, String s2) {

		int l1 = s1.length();

		int l2 = s2.length();

		int[] ab = new int[l2 + 2];

		if (l1 == 0 || l2 == 0) {

			return 0;
		}

		for (int r = l1 + 1; r >= 0; r--) {

			for (int c = l2 + 1; c >= 0; c--) {

				if (r == s1.length() || c == s2.length()) {

					ab[c] = 0;

					continue;
				}

				char ch1 = s1.charAt(r);

				char ch2 = s2.charAt(c);

				int ans = 0;

				if (ch1 == ch2) {

					ab[c] = ab[c + 1] + 1;
				}

				else {

					ab[c] = ab[c + 1];

				}

				ans = Math.max(ab[c], ab[c + 1]);

				ab[c] = ans;

			}

		}

		return ab[0];

	}

	public static int edit_operations(String s1, String s2) {

		int l1 = s1.length();

		int l2 = s2.length();

		if (l1 == 0 || l2 == 0) {

			return Math.max(l1, l2);
		}

		char ch1 = s1.charAt(0);

		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);

		String ros2 = s2.substring(1);

		int ans = 0;

		if (ch1 == ch2) {

			return ans = edit_operations(ros1, ros2);
		}

		else {

			int i = edit_operations(s1, ros2);

			int d = edit_operations(ros1, s2);

			int r = edit_operations(ros1, ros2);

			ans = Math.min(i, Math.min(d, r)) + 1;

		}

		return ans;
	}

	public static int edit_operationsTD(String s1, String s2, int[][] ad) {

		int l1 = s1.length();

		int l2 = s2.length();

		if (l1 == 0 || l2 == 0) {

			return 0;
		}

		if (ad[l1][l2] != -1) {

			return ad[l1][l2];
		}

		char ch1 = s1.charAt(0);

		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);

		String ros2 = s2.substring(1);

		int ans = 0;

		if (ch1 == ch2) {

			return ans = edit_operationsTD(ros1, ros2, ad);
		}

		else {

			int i = edit_operationsTD(s1, ros2, ad);

			int d = edit_operationsTD(ros1, s2, ad);

			int r = edit_operationsTD(ros1, ros2, ad);

			ans = Math.min(i, Math.min(d, r)) + 1;
		}

		return ad[l1][l2] = ans;

	}

	public static int editdistance_operationsBU(String s1, String s2) {

		int[][] a = new int[s1.length() + 1][s2.length() + 1];

		for (int row = s1.length(); row >= 0; row--) {
			for (int col = s2.length(); col >= 0; col--) {

				if (row == s1.length()) {
					a[row][col] = s2.length() - col;
					continue;
				}

				if (col == s2.length()) {
					a[row][col] = s1.length() - row;
					continue;
				}

				char ch1 = s1.charAt(row);
				char ch2 = s2.charAt(col);

				int ans = 0;
				if (ch1 == ch2) {
					ans = a[row + 1][col + 1];
				} else {

					int i = a[row][col + 1];
					int d = a[row + 1][col];
					int r = a[row + 1][col + 1];

					ans = Math.min(i, Math.min(d, r)) + 1;
				}

				a[row][col] = ans;

			}
		}

		return a[0][0];

	}

	public static int edit_operationsBUSE(String s1, String s2) {

		int[] a = new int[s2.length() + 2];

		for (int row = s1.length(); row >= 0; row--) {
			for (int col = s2.length(); col >= 0; col--) {

				if (row == s1.length()) {
					a[col] = s2.length() - col;
					continue;
				}

				if (col == s2.length()) {
					a[col] = s1.length() - row;
					continue;
				}

				char ch1 = s1.charAt(row);
				char ch2 = s2.charAt(col);

				int ans = 0;
				if (ch1 == ch2) {
					ans = a[col + 1];
				} else {

					int i = a[col + 1];
					int d = a[col];
					int r = a[col + 1];

					ans = Math.min(i, Math.min(d, r)) + 1;
				}

				a[col] = ans;

			}
		}

		return a[0];

	}

	public static int Wineproblem(int[] prices, int si, int ei, int year) {

		if (si == ei) {

			return prices[si] * year;

		}

		int fp = Wineproblem(prices, si + 1, ei, year) + prices[si] * year;

		int sp = Wineproblem(prices, si, ei - 1, year) + prices[ei] * year;

		return Math.max(fp, sp);

	}

	public static int Wineprob(int[] prices, int si, int ei) {

		int year = prices.length - ei + si;

		if (si == ei) {

			return prices[si] * year;

		}

		int fp = Wineprob(prices, si + 1, ei) + prices[si] * year;

		int sp = Wineprob(prices, si, ei - 1) + prices[si] * year;

		return Math.max(fp, sp);

	}

	public static int WineprobTD(int[] prices, int si, int ei, int[][] a) {

		int n = prices.length;

		int year = n - ei + si;

		if (si == ei) {

			return prices[si] * year;

		}

		if (a[si][ei] != 0) {

			return a[si][ei];

		}
		int fp = WineprobTD(prices, si + 1, ei, a) + prices[si] * year;

		int sp = WineprobTD(prices, si, ei - 1, a) + prices[si] * year;

		return a[si][ei] = Math.max(fp, sp);

	}

	public static int WineprobBU(int[] prices, int si, int ei) {

		int n = prices.length;

		int[][] a = new int[n][n];

		int fp = 0, sp = 0;

		for (int slide = 0; slide < n; slide++) {

			for (si = 0; si <= n - slide - 1; si++) {

				ei = slide + si;

				int year = n - ei + si;

				fp = a[si + 1][ei] + prices[si] * year;

				sp = a[si][ei - 1] + prices[si] * year;

				a[si][ei] = Math.max(fp, sp);

			}

		}

		return a[0][n - 1];

	}

	public static int WineprobBUSE(int[] prices, int si, int ei) {

		int n = prices.length;

		int[] a = new int[n];

		int fp = 0, sp = 0;

		for (int slide = 0; slide < n; slide++) {

			for (si = 0; si <= n - slide - 1; si++) {

				ei = slide + si;

				int year = n - ei + si;

				fp = a[ei] + prices[si] * year;

				sp = a[ei - 1] + prices[si] * year;

				a[ei] = Math.max(fp, sp);

			}

		}

		return a[n - 1];

	}

	public static int MCM(int[] matrix, int si, int ei) {

		int k, min = Integer.MAX_VALUE;

		if (si - ei == 1) {

			return 0;
		}

		for (k = si + 1; k < ei - 1; k++) {

			int fp = MCM(matrix, si, k);

			int sp = MCM(matrix, k, ei);

			int sw = matrix[si] * matrix[k] * matrix[ei];

			int total = fp + sp + sw;

			if (total > min) {

				min = total;
			}

		}

		return min;

	}

	public static int MCMTD(int[] matrix, int si, int ei, int[][] a) {

		int k, min = Integer.MAX_VALUE;

		if (si - ei == 1) {

			return 0;
		}

		if (a[si][ei] != 0) {

			return a[si][ei];
		}

		for (k = si + 1; k <= ei - 1; k++) {

			int fp = MCMTD(matrix, si, k, a);

			int sp = MCMTD(matrix, k, ei, a);

			int sw = matrix[si] * matrix[k] * matrix[ei];

			int total = fp + sp + sw;

			if (total > min) {

				min = total;
			}

		}

		return a[si][ei] = min;

	}

	public static int MCMBU(int[] matrix) {

		int k, min = Integer.MAX_VALUE;

		int n = matrix.length;

		int[][] a = new int[n][n];

		for (int slide = 1; slide < n - 1; slide++) {

			for (int si = 0; si <= n - slide - 1; si++) {

				int ei = slide + si;

				for (k = si + 1; k <= ei - 1; k++) {

					int fp = a[si][k];

					int sp = a[k][ei];

					int sw = matrix[si] * matrix[k] * matrix[ei];

					int total = fp + sp + sw;

					if (total > min) {

						min = total;
					}

				}
				a[si][ei] = min;

			}
		}

		return a[0][n - 1] = min;

	}

	public static int Knapsack(int[] weight, int[] profit, int vidx, int cap) {

		int inc = 0;

		if (vidx == weight.length) {

			return 0;
		}

		int exc = Knapsack(weight, profit, vidx + 1, cap);

		if (weight[vidx] <= cap) {

			inc = Knapsack(weight, profit, vidx + 1, cap - weight[vidx]) + profit[vidx];

		}

		return Math.max(inc, exc);

	}

	public static int KnapsackTD(int[] weight, int[] profit, int vidx, int cap, int[][] a) {

		int inc = 0;

		if (vidx == weight.length) {

			return 0;
		}

		if (a[vidx][cap] != 0) {

			return a[vidx][cap];
		}

		int exc = KnapsackTD(weight, profit, vidx + 1, cap, a);

		if (weight[vidx] <= cap) {

			inc = KnapsackTD(weight, profit, vidx + 1, cap - weight[vidx], a) + profit[vidx];

		}

		return a[vidx][cap] = Math.max(inc, exc);

	}

	public static int KnapsackBU(int[] weight, int[] profit, int cap) {

		int n = weight.length + 1;

		int[][] a = new int[n][n];

		int exc = 0, inc = 0;

		for (int vidx = n - 2; vidx >= 0; vidx--) {

			for (int c = cap; c >= 0; c--) {

				exc = a[vidx + 1][c];

				if (weight[vidx] <= c) {

					inc = a[vidx + 1][c - weight[vidx]] + profit[vidx];

				}

			}

		}
		return a[0][n] = Math.max(inc, exc);

	}

	public static int boundaryPath(int cr, int cc, int er, int ec, int K) {

		if (cr < 0 || cr >= er || cc < 0 || cc >= ec) {
			return 1;
		}

		if (K == 0) {
			return 0;
		}

		int cnt = 0;

		cnt += boundaryPath(cr + 1, cc, er, ec, K - 1);
		cnt += boundaryPath(cr - 1, cc, er, ec, K - 1);
		cnt += boundaryPath(cr, cc + 1, er, ec, K - 1);
		cnt += boundaryPath(cr, cc - 1, er, ec, K - 1);

		return cnt;

	}

	public static int boundaryPathTD(int cr, int cc, int er, int ec, int K, int[][][] strg) {

		if (cr < 0 || cr >= er || cc < 0 || cc >= ec) {
			return 1;
		}

		if (K == 0) {
			return 0;
		}

		if (strg[K][cr][cc] != 0) {
			return strg[K][cr][cc];
		}

		int cnt = 0;

		cnt += boundaryPathTD(cr + 1, cc, er, ec, K - 1, strg);
		cnt += boundaryPathTD(cr - 1, cc, er, ec, K - 1, strg);
		cnt += boundaryPathTD(cr, cc + 1, er, ec, K - 1, strg);
		cnt += boundaryPathTD(cr, cc - 1, er, ec, K - 1, strg);

		strg[K][cr][cc] = cnt;
		return cnt;

	}

	public static int boundaryPathBU(int i, int j, int er, int ec, int K) {

		int[][][] strg = new int[K + 1][er][ec];

		for (int moves = 1; moves <= K; moves++) {

			for (int cr = er - 1; cr >= 0; cr--) {

				for (int cc = ec - 1; cc >= 0; cc--) {

					int cnt = 0;

					if (cr - 1 < 0) {
						cnt++;
					} else {
						cnt += strg[moves - 1][cr - 1][cc];
					}

					if (cr + 1 >= er) {
						cnt++;
					} else {
						cnt += strg[moves - 1][cr + 1][cc];
					}

					if (cc - 1 < 0) {
						cnt++;
					} else {
						cnt += strg[moves - 1][cr][cc - 1];
					}

					if (cc + 1 >= ec) {
						cnt++;
					} else {
						cnt += strg[moves - 1][cr][cc + 1];
					}
					strg[moves][cr][cc] = cnt;
				}
			}

		}

		return strg[K][i][j];

	}

	public static int boundaryPathBUSE(int i, int j, int er, int ec, int K) {

		int[][] strg = new int[er][ec];

		for (int moves = 1; moves <= K; moves++) {

			for (int cr = er - 1; cr >= 0; cr--) {

				for (int cc = ec - 1; cc >= 0; cc--) {

					int cnt = 0;

					if (cr - 1 < 0) {
						cnt++;
					} else {
						cnt += strg[cr - 1][cc];
					}

					if (cr + 1 >= er) {
						cnt++;
					} else {
						cnt += strg[cr + 1][cc];
					}

					if (cc - 1 < 0) {
						cnt++;
					} else {
						cnt += strg[cr][cc - 1];
					}

					if (cc + 1 >= ec) {
						cnt++;
					} else {
						cnt += strg[cr][cc + 1];
					}
					strg[cr][cc] = cnt;
				}
			}

		}

		return strg[i][j];

	}

	public static int rodCutting(int[] price, int len) {

		int left = 1;
		int right = len - 1;

		int max = price[len];

		while (left <= right) {

			int fp = rodCutting(price, left);
			int sp = rodCutting(price, right);

			int total = fp + sp;

			if (total > max) {
				max = total;
			}

			left++;
			right--;

		}

		return max;

	}

	public static int rodCuttingTD(int[] price, int len, int[] strg) {

		if (strg[len] != 0) {
			return strg[len];
		}

		int left = 1;
		int right = len - 1;

		int max = price[len];

		while (left <= right) {

			int fp = rodCuttingTD(price, left, strg);
			int sp = rodCuttingTD(price, right, strg);

			int total = fp + sp;

			if (total > max) {
				max = total;
			}

			left++;
			right--;

		}

		strg[len] = max;
		return max;

	}

	public static int rodCuttingBU(int[] price) {

		int[] strg = new int[price.length];

		for (int len = 1; len < strg.length; len++) {

			int left = 1;
			int right = len - 1;

			int max = price[len];
			while (left <= right) {
				int fp = strg[left];
				int sp = strg[right];
				int total = fp + sp;

				if (total > max) {
					max = total;
				}
				left++;
				right--;
			}
			strg[len] = max;

		}

		return strg[price.length - 1];
	}

	public static void main(String[] args) {

		int n;

		System.out.println("Enter the number:");

		n = sc.nextInt();

		int[] a = new int[n + 1];

		String s1, s2;

		s1 = sc.next();

		s2 = sc.next();

		int l1 = s1.length();
		int l2 = s2.length();

		int[][] ab = new int[l1 + 1][l2 + 1];

		int[][] ad = new int[l1 + 1][l2 + 1];

		int vidx = 0;

		int cap = 10;

		int[][] b = new int[vidx][cap + 1];

		for (int[] bd : ad) {

			Arrays.fill(bd, -1);
		}
		// System.out.println("The result is as follows:");
//
//		System.out.println(fiboTD(n, a));

		// System.out.println(d);

	}

}
