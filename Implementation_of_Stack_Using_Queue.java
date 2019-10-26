package java_18_19_20_Oct_2019;

public class Implementation_of_Stack_Using_Queue {

	Dynamic_Queue primary = new Dynamic_Queue();

		public void push(int item) throws Exception {

			primary.enqueue(item);
		}

		public int pop() throws Exception {

			try {
				Dynamic_Queue helper = new Dynamic_Queue();

				while (primary.size() > 1) {
					helper.enqueue(primary.dequeue());

				}

				int temp = primary.dequeue();

				while (!helper.isEmpty()) {
					primary.enqueue(helper.dequeue());
				}

				return temp;
			} catch (Exception e) {
				throw new Exception("Stack is Empty");
			}

		}
	}















