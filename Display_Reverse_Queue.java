package java_18_19_20_Oct_2019;

public class Display_Reverse_Queue  {

	
	
	public static void main(String[] args)throws Exception {
		
		Dynamic_Queue D = new Dynamic_Queue();
	
		D.enqueue(5);
		
		D.enqueue(6);
	
	}
	
	
	public static void displayReverse(Dynamic_Queue q, int cnt) throws Exception {

		if(cnt == q.size()) {
			return;
		}

		int temp = q.dequeue();
		q.enqueue(temp);
		displayReverse(q, cnt + 1);
		System.out.println(temp);

	}

	public static void ActualReverse(Dynamic_Queue q) throws Exception {

		if(q.isEmpty()) {
			return;
		}

		int temp = q.dequeue();
		ActualReverse(q);
		System.out.println(temp);
		q.enqueue(temp);
	}




}
	
	





