package java_29Sep2019_Lec_12;

import java.util.*;

public class Lexical_Count_Recursion {

	static Scanner sc = new Scanner(System.in);

	public static void Lexical(int st, int en) {

		int i = 0, j;

		if (st == 0) {

			i = 1;

			System.out.println(st);

		}

		if (st > en) {
			return;
		}

		System.out.println(st);

		while (i < 10) {
			Lexical(st * 10 + i, en);
			i++;
		}
	}

	public static void main(String[] args) {

		int n, m;

		System.out.println("Enter the starting integer:");

		n = sc.nextInt();

		System.out.println("Enter the ending integer:");

		m = sc.nextInt();

		Lexical(n, m);

	}

}
