package java_18_19_20_Oct_2019;

public class Stack_Exception {

	int d[];
	int tos;
	
	public Stack_Exception()
	{
		
		this.tos = -1;
		this.d = new int[5];
		
	}

	public Stack_Exception(int cap) {
		
		this.tos = -1;
		
		this.d = new int[cap];
		
		}
	

	public void push(int item,int cap) throws Exception {
		
		if(isFull(cap)) {
			
			throw new Exception("Queue is Full");
		}
		
		
		this.tos++;
		
		d[tos] = item;
	
	}

	public int pop() throws Exception {
		
		if(isEmpty()) {
			
			throw new Exception("Queue is Empty");
		}
		
		
		int temp = d[tos];
		
		d[this.tos] = 0;
		
		tos--;
		
		return temp;
	
	}

	public int peak() throws Exception {
		
		if(isEmpty()) {
			
			throw new Exception("Queue is Empty");
		}
		
		return d[tos];
		
	}

	public int size() {
		
		return this.tos+1;
	}

	public boolean isFull(int cap) {
		
		if(tos == cap-1) {
			
			return true;
			
		}
		
		else {
			
			return false;
		}
	
	}


	public boolean isEmpty() {
		
		if(tos==-1) {
			
			return true;
		}
	
		else {
			
			return false;
		}
	
	}

	public void display() {
		
		int i;
		
		for(i=tos;i<d.length;i++) {
			
			System.out.println(d[i]);
		}
		
		
	}



}

