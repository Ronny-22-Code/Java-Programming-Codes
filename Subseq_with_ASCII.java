package java_21Sep_22Sep_2019;

import java.util.*;

public class Subseq_with_ASCII {

	static Scanner sc = new Scanner(System.in);

	public static ArrayList<String> sub(String s) {

		if (s.length() == 0) {

			ArrayList<String> br = new ArrayList<>();

			br.add("");

			return br;

		}

		char c = s.charAt(0);

		String ros = s.substring(1);

		ArrayList<String> rr = sub(ros);

		ArrayList<String> mr = new ArrayList<>();

		for (String val : rr) {

			mr.add(val);

			mr.add(c + val);

			mr.add((int) c + val);

		}

		return mr;

	}

	public static void main(String[] args) {

		String s;

		s=sc.next();
		
		System.out.println(sub(s));
		
	}

	}


