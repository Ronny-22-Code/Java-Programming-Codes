package java5thOct_6thOct_2019;

import java.util.*;

public class N_Queen_Efficient_Backtracking {

	static Scanner sc = new Scanner(System.in);

	public static void N_Queen_Efficient(boolean[][] board, int r, int qpsf, int tq, String ans) {

		int c;

		if (tq == qpsf) {

			System.out.println(ans);

			return;
		}

		if (r == board.length) {

			return;
		}

		for (c = 0; c < board[0].length; c++) {

			if (isItSafeToPlaceQueen(board, r, c)) {

				board[r][c] = true;

				N_Queen_Efficient(board, r + 1, qpsf + 1, tq, ans + "(" + r + "-" + c + "-");

				board[r][c] = false;

			}
		}

	}

	public static boolean isItSafeToPlaceQueen(boolean[][] board, int row, int col) {

		int r = row - 1;
		int c = col;

		while (r >= 0) {

			if (board[r][c]) {
				return false;
			}

			r--;
		}

		r = row;
		c = col - 1;

		while (c >= 0) {

			if (board[r][c]) {
				return false;
			}

			c--;
		}

		r = row - 1;
		c = col - 1;

		while (c >= 0 && r >= 0) {

			if (board[r][c]) {
				return false;
			}

			r--;
			c--;
		}

		r = row - 1;
		c = col + 1;

		while (c < board[0].length && r >= 0) {

			if (board[r][c]) {
				return false;
			}

			r--;
			c++;
		}

		return true;

	}

	public static void main(String[] args) {

		boolean[][] board = new boolean[4][4];

		N_Queen_Efficient(board, 0, 0, 4, "");

	}

}
