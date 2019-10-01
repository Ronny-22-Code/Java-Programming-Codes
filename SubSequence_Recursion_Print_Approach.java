package java_21Sep_22Sep_2019;

import java.util.*;

public class SubSequence_Recursion_Print_Approach {

	static Scanner sc = new Scanner(System.in);

	public static void sub(String s, String t) {

		if (s.length() == 0) {

			System.out.println(t);

			return;

		}

		char c = s.charAt(0);

		String ros = s.substring(1);

		sub(ros, t);

		sub(ros, t + c);

	}

	public static void main(String[] args) {

		String s;

		System.out.println("Enter the string for finding subsequence:");

		s = sc.next();

		sub(s, "");

	}

}
