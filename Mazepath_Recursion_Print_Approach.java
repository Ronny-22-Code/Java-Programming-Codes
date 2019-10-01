package java_21Sep_22Sep_2019;

import java.util.*;

public class Mazepath_Recursion_Print_Approach {

	static Scanner sc = new Scanner(System.in);

	public static void Maze(int cr, int cc, int er, int ec, String s) {

		
		
		if (cr < er && cc < ec) {

		Maze(cr + 1, cc, er, ec, "V");

		Maze(cr, cc + 1, er, ec, "H");

		Maze(cr + 1, cc + 1, er, ec, "D");
	
		}

		System.out.println(s);
		
		if (cr == er && cc == ec) {

			return;

		}

		if (cr > er || cc > ec) {

			return;

		}

	}

	public static void main(String[] args) {

		int cr, cc, er, ec;

		System.out.println("Enter the current row of the MazePath");

		cr = sc.nextInt();

		System.out.println("Enter the current column of the MazePath");

		cc = sc.nextInt();

		System.out.println("Enter the end row of the MazePath");

		er = sc.nextInt();

		System.out.println("Enter the end column of the MazePath");

		ec = sc.nextInt();

		Maze(cr, cc, er, ec, "");

	}

}
