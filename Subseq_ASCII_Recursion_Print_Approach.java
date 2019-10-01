package java_21Sep_22Sep_2019;

import java.util.*;

public class Subseq_ASCII_Recursion_Print_Approach {

	static Scanner sc = new Scanner(System.in);

	public static void subA(String s, String t) {

		if (s.length() == 0) {

			System.out.println(t);

			return;

		}

		char c = s.charAt(0);

		String ros = s.substring(1);

		subA(ros, t);

		subA(ros, t + c);

		subA(ros,t+(int)c);
	
	}

	public static void main(String[] args) {
		String s;

		System.out.println("Enter the string for finding subsequence:");

		s = sc.next();

		subA(s, "");

	}

}
