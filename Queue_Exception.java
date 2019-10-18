package java_18_19_20_Oct_2019;

import java.util.*;

public class Queue_Exception {

	int[] d;

	int size = 0;

	int front = 0;

	public Queue_Exception() {

		this.d = new int[5];

	}

	public void Enqueue(int item) throws Exception {

		if (isFull()) {

			throw new Exception("Queue is Full");
		}

		d[front] = item;

		
		size++;

	}

	public int Dequeue() throws Exception {

		if (isEmpty()) {

			throw new Exception("Queue is Empty");
		}

		int temp = d[front];		
		
		front++;
		
		size--;

		return temp;
	
	}

	public boolean isFull() {

		if (size == d.length) {

			return true;
		}
		return false;

	}

	public boolean isEmpty() {

		if (size == 0) {

			return true;
		}
		return false;
	}

	public int getfront() throws Exception {

		if (isEmpty()) {

			throw new Exception("Queue is Empty");

		}

		return d[front];

	}

	public void display() throws Exception {

		int i;

		if (isEmpty()) {

			throw new Exception("Queue is Empty");
		}

		for (i = 0; i < front + size; i++) {

			System.out.println(d[i]);

		}

	}

}
