package class31Aug_1Sep_2019;

import java.util.*;

public class GCD {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int ds, dv, rem = 0;

		ds = sc.nextInt();

		dv = sc.nextInt();

		while (dv % ds != 0) {

			rem = dv % ds;

			dv = ds;

			ds = rem;
		}

		System.out.println(ds);

	}

}
