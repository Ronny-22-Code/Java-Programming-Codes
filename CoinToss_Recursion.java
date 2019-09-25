package java_21Sep_22Sep_2019;

import java.util.*;

public class CoinToss_Recursion {

	static Scanner sc = new Scanner(System.in);

	public static ArrayList<String> coin(int n) {

		if (n == 0) {

			ArrayList<String> br = new ArrayList<>();

			br.add("");

			return br;

		}

		ArrayList<String> rr = coin(n - 1);

		ArrayList<String> mr = new ArrayList<>();

		for (String val : rr) {

			mr.add("H" + val);

		}

		for(String val : rr) {
			
			mr.add("T" + val);
			
		}

		return mr;
	
	}

	public static void main(String[] args) {

		int n;

		System.out.println("Enter the number of cases:");

		n = sc.nextInt();

		System.out.println(coin(n));

	}

}
