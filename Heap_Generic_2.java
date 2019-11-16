package Lec_32;

import java.util.ArrayList;
import java.util.Comparator;

public class Heap_Generic_2<T> {

	protected ArrayList<T> data = new ArrayList<>();

	Comparator<T> comp;

	public Heap_Generic_2(Comparator<T> c) {
		comp = c;
	}

	public int size() {
		return data.size();
	}

	public void add(T item) {

		data.add(item);

		upheapify(data.size() - 1);

	}

	public void upheapify(int ci) {

		int pi = (ci - 1) / 2;

		if (comp.compare(data.get(pi), data.get(ci)) < 0) {
			swap(ci, pi);
			upheapify(pi);

		}
	}

	public void swap(int i, int j) {

		T ith = data.get(i);
		T jth = data.get(j);

		data.set(i, jth);
		data.set(j, ith);
	}

	public void display() {

		System.out.println(data);
	}

	public T getMin() {

		return data.get(0);
	}

	public T remove() {

		swap(0, data.size() - 1);
		T temp = data.remove(data.size() - 1);
		downheapify(0);
		return temp;

	}

	public void downheapify(int pi) {

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;

		int Priority = pi;

		if (lci < data.size() && comp.compare(data.get(Priority), data.get(lci)) < 0) {
			Priority = lci;
		}

		if (rci < data.size() && comp.compare(data.get(Priority), data.get(rci)) < 0) {
			Priority = rci;
		}

		if (Priority != pi) {
			swap(pi, Priority);
			downheapify(Priority);
		}

	}

}
