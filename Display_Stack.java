package java_18_19_20_Oct_2019;

public class Display_Stack  {

	public static void main(String[] args) throws Exception {

		Dynamic_Stack S = new Dynamic_Stack();

		S.push(6);
		S.push(5);

	}

	public static void reverse(Dynamic_Stack S) throws Exception {

		
		if(S.isEmpty()) {
			
			return;
		}
		
		int temp;

		temp = S.pop();

		reverse(S);

		System.out.println(temp);

		S.push(temp);

	}

	public static void actualReverse_1(Dynamic_Stack D, Dynamic_Stack H) throws Exception {

		if (D.isEmpty()) {
			actualReverse_2(D, H);
			return;
		}

		H.push(D.pop());
		actualReverse_1(D, H);

	}

	public static void actualReverse_2(Dynamic_Stack D , Dynamic_Stack H) throws Exception {

		if (H.isEmpty()) {
			return;
		}

		int temp = H.pop();
		actualReverse_2(D, H);
		D.push(temp);

	}
			
	public static void nextGreater(int[] arr,Dynamic_Stack D) throws Exception {

		int[] res = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			while (!D.isEmpty() && arr[D.peak()] < arr[i]) {

				res[D.pop()] = arr[i];
			}

			D.push(i);
		}
		while (!D.isEmpty()) {
			res[D.pop()] = -1;
		}

	}
}
		
	
	
	
	
	
	
	





