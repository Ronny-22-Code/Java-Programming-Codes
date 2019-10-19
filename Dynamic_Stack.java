package java_18_19_20_Oct_2019;

import java_18_19_20_Oct_2019.Stack_Exception;

public class Dynamic_Stack extends Stack_Exception {

	@Override

	public void push(int item) throws Exception {

		if (isFull()) {

			int[] na = new int[2 * d.length];

			for (int i = 0; i < d.length; i++) {

				na[i] = d[i];
			}

			d = na;
		
		}

		super.push(7);

	}

}
