package java_18_19_20_Oct_2019;

public class Dynamic_Queue extends Queue_Exception_New {

	@Override

	public void enqueue(int item) throws Exception {

		if (isFull()) {

			int[] na = new int[2 * data.length];

			for (int i = front; i < front + size; i++) {

				int idx = (i) % data.length;
				
				na[i] = data[idx];

			}

			data = na;
		
		}

		super.enqueue(item);

	}

}
