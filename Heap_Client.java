package Lec_32;

import Lec_32.Heap;

public class Heap_Client {

	public static void main(String[] args) {

		Heap.add(20);
		Heap.add(10);
		Heap.add(70);
		Heap.add(80);
		Heap.add(1);

		int[] arr = { 1, 5, 2, 3, 10, 20, 2, 1, 6, 7 };

		KthLargest(arr, 3);
	}

	public static void KthLargest(int[] arr, int k) {

		Heap hp = new Heap();

		for (int i = 0; i < k; i++) {
			Heap.add(arr[i]);
		}

		for (int i = k; i < arr.length; i++) {

			int weakest = hp.remove();
			Heap.add(Math.max(weakest, arr[i]));

		}

		while (Heap.size() != 0) {
			System.out.println(hp.remove());
		}

	}

}