package java_18_19_20_Oct_2019;

public class Next_Greater_Element extends Stack_Exception {


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

	public static void main(String[] args)throws Exception {
		
		Stack_Exception N = new Next_Greater_Element(); 
	
		int[] a = new int[N.d.length];		
		
		N.push(7);
	
		N.push(8);
	
		N.push(6);
		
		N.push(3);
		
		N.push(2);
	
	
		nextGreater(a,N);
	
	}



}



