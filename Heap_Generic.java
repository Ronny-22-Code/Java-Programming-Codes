package Lec_32;

import java.util.ArrayList;

public class Heap_Generic<H extends Comparable<H>> {

	protected ArrayList<H> data = new ArrayList<>();

	public int size() {
		return data.size();
	}

	public void add(H item) {

		data.add(item);

		upheapify(data.size() - 1);

	}

	public void upheapify(int ci) {

		int pi = (ci - 1) / 2;

		if (data.get(pi).compareTo(data.get(ci)) < 0) {
			swap(ci, pi);
			upheapify(pi);

		}
	}

	public void swap(int i, int j) {

		H ith = data.get(i);
		H jth = data.get(j);

		data.set(i, jth);
		data.set(j, ith);
	}

	public void display() {

		System.out.println(data);
	}

	public H getMin() {

		return data.get(0);
	}

	public H remove() {

		swap(0, data.size() - 1);
		H temp = data.remove(data.size() - 1);
		downheapify(0);
		return temp;

	}

	public void downheapify(int pi) {

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;

		int Priority = pi;

		if (lci < data.size() && data.get(Priority).compareTo(data.get(lci)) < 0) {
			Priority = lci;
		}

		if (rci < data.size() && data.get(Priority).compareTo(data.get(rci)) < 0) {
			Priority = rci;
		}

		if (Priority != pi) {
			swap(pi, Priority);
			downheapify(Priority);
		}

	}

}