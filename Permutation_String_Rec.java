package java_21Sep_22Sep_2019;

import java.util.*;

public class Permutation_String_Rec {

	static Scanner sc = new Scanner(System.in);

	public static ArrayList<String> Permutation(String s) {

		if (s.length() == 0) {

			ArrayList<String> br = new ArrayList<>();

			br.add("");

			return br;

		}

		char c = s.charAt(0);

		String ros = s.substring(1);

		ArrayList<String> rr = Permutation(ros);

		ArrayList<String> mr = new ArrayList<>();

		for (String val : rr) {

			for (int i = 0; i <=val.length(); i++) {

				String temp = val.substring(0, i) + c + val.substring(i);

				mr.add(temp);

			}

		}
		return mr;

	}

	public static void main(String[] args) {

		String s;

		s = sc.next();

		System.out.println(Permutation(s));

	}

}
