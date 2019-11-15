package Lec_32;

import java.util.*;

public class Heap {

	static ArrayList<Integer> d = new ArrayList<>();

	public static int size() {

		return d.size();

	}

	public static void add(int item) {

		d.add(item);
		upheapify(d.size() - 1);

	}

	public static void upheapify(int ci) {

		int pi = (ci - 1) / 2;

		if (d.get(pi) > d.get(ci)) {

			swap(pi, ci);

			upheapify(pi);
		}

	}

	public static void swap(int i, int j) {
		int ith = d.get(i);
		int jth = d.get(j);
		d.set(i, jth);
		d.set(j, ith);

	}

	public static void display() {

		System.out.println(d);
	}

	public int getMin() {

		return d.get(0);

	}

	public int remove() {

		swap(0, d.size() - 1);

		int temp = d.remove(d.size() - 1);

		downheapify(0);

		return temp;

	}

	public void downheapify(int pi) {

		int lci, rci;

		lci = 2 * pi + 1;

		rci = 2 * pi + 2;

		int mini = pi;

		if (lci < d.size() && d.get(lci) < d.get(mini)) {

			mini = lci;
		}

		if (rci < d.size() && d.get(rci) < d.get(mini)) {

			mini = rci;
		}

		if (mini != pi) {

			swap(pi, mini);

			downheapify(mini);
		}
	}

}
