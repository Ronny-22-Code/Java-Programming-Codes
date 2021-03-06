package java_18_19_20_Oct_2019;

public class Linked_List {

	class Node {

		int val;

		Node next;

		
		Node(){
			
		}
		
		Node(int item) {

			val = item;
		}

	}

	private Node head;

	private Node tail;

	private int size;

	public boolean isEmpty() {

		return head == null;

	}

	public int getFirst() throws Exception {

		if (isEmpty()) {

			throw new Exception("Linked List is Empty");

		}

		else {

			return head.val;
		}

	}

	public int getLast() throws Exception {

		if (isEmpty()) {

			throw new Exception("Linked List is Empty");
		}

		else {

			return tail.val;

		}

	}

	public void addLast(int item) {

		Node nn = new Node();

		nn.val = item;

		if (isEmpty()) {

			head = nn;

			tail = nn;

			size++;

		}

		else {

			tail.next = nn;

			tail = nn;

			size++;

		}

	}

	public void addFirst(int item) {

		Node nn = new Node();

		nn.val = item;

		if (isEmpty()) {

			head = nn;

			tail = nn;

			size++;

		}

		else {

			nn.next = head;

			head = nn;

			size++;

		}

	}

	public void Display() {

		Node temp;

		temp = head;

		while (temp != null) {

			System.out.println(temp.val + " ");

			temp = temp.next;
		}
	}

	public int getAt(int idx) throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty!!");
		}

		if (idx < 0 || idx >= size) {
			throw new Exception("Invalid Index");
		}

		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}

		return temp.val;

	}

	public Node getNodeAt(int idx) throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty!!");
		}

		if (idx < 0 || idx >= size) {
			throw new Exception("Invalid Index");
		}

		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}

		return temp;

	}

	public void addAt(int item, int idx) throws Exception {

		if (idx < 0 || idx > size) {
			throw new Exception("Invalid Index");
		}

		if (idx == 0) {
			addFirst(item);
		} else if (idx == size) {
			addLast(item);
		} else {
			// Create Node
			Node nn = new Node();
			nn.val = item;

			// Get Node
			Node pnode = getNodeAt(idx - 1);
			Node cnode = pnode.next;

			// Attach Node
			pnode.next = nn;
			nn.next = cnode;

			size++;
		}

	}

	public int removeFirst() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty!!!");
		}

		int temp = head.val;

		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head = head.next;
			size--;
		}

		return temp;
	}

	public int removeLast() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty!!!");
		}

		int temp = tail.val;

		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			Node pnode = getNodeAt(size - 2);
			pnode.next = null;
			tail = pnode;
			size--;
		}

		return temp;
	}

	public int removeAt(int idx) throws Exception {

		if (idx < 0 || idx >= size) {
			throw new Exception("Invalid Index");
		}

		if (idx == 0) {
			return removeFirst();
		} else if (idx == size - 1) {
			return removeLast();
		} else {

			Node pnode = getNodeAt(idx - 1);
			Node cnode = pnode.next;
			Node ahead = cnode.next;

			pnode.next = ahead;

			size--;
			return cnode.val;

		}

	}

	private Node left;

	private Node h1;

	private Node h2;

	int k;

	public void RDI() throws Exception {

		int i = 0;
		int j = size - 1;

		while (i < j) {

			Node ith = getNodeAt(i);
			Node jth = getNodeAt(j);

			int temp = ith.val;
			ith.val = jth.val;
			jth.val = temp;

			i++;
			j--;
		}
	}

	public void RPI() {

		Node prev = head;
		Node curr = prev.next;

		while (curr != null) {

			Node save = curr.next;
			curr.next = prev;
			prev = curr;
			curr = save;

		}

		Node temp = head;
		head = tail;
		tail = temp;
		tail.next = null;

	}

	public void RPR() {

		RPR(head, head.next);
		Node temp = head;
		head = tail;
		tail = temp;

		tail.next = null;
	}

	public void RPR(Node prev, Node curr) {

		if (curr == null) {
			return;
		}

		RPR(curr, curr.next);
		curr.next = prev;
	}

	class mover {
		Node left;
	}

	public void RDR() {

		mover m = new mover();
		m.left = head;
		RDR(m, head, 0);

	}

	public void RDR(mover m, Node right, int cnt) {

		if (right == null) {
			return;
		}

		RDR(m, right.next, cnt + 1);

		if (cnt >= size / 2) {
			int temp = m.left.val;
			m.left.val = right.val;
			right.val = temp;

			m.left = m.left.next;
		}

	}

	public int mid() {

		Node a = head;

		Node b = head;

		while (b.next != null && b.next.next != null) {

			a = a.next;
			b = b.next.next;

		}

		return a.val;

	}

	public int KthFormList() {

		int i;

		Node a = head;

		Node b = head;

		for (i = 1; i <= k; i++) {

			b = b.next;

		}

		while (b != null) {

			a = a.next;

			b = b.next;
		}

		return a.val;

	}

	public void createDummyList() {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		Node n6 = new Node(60);
		Node n7 = new Node(70);
		Node n8 = new Node(80);
		Node n9 = new Node(90);
		Node n10 = new Node(100);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = null;
		n9.next = n10;
		n10.next = null;
		Node h1 = n1;
		Node h2 = n9;
		System.out.println();
		System.out.println(intersection(h1, h2));
	}

	public int intersection(Node h1, Node h2) {

		Node f1 = h1;

		Node f2 = h2;

		while (f1 != f2) {

			if (f1 != null) {

				f1 = f1.next;

			}

			else {

				f1 = h2;
			}

		}

		if (f2 != null) {

			f2 = f2.next;

		}

		else {

			f2 = h1;

		}

		if (f1 == null) {
			return -1;
		} else
			return f1.val;

	}

	public void Kreverse(int k) throws Exception {

		Linked_List prev = null;

		while (size != 0) {

			Linked_List curr = new Linked_List();

			for (int i = 1; i <= k && size > 0; i++) {
				curr.addFirst(this.removeFirst());
			}

			if (prev == null) {
				prev = curr;
			} else {
				prev.tail.next = curr.head;
				prev.tail = curr.tail;
				prev.size += curr.size;
			}
		}

		this.head = prev.head;
		this.tail = prev.tail;
		this.size = prev.size;

	}

	public void fold(mover m, Node right, int cnt) {

		if (right == null) {

			return;
		}

		fold(m, right.next, cnt + 1);

		if (cnt > size / 2) {

			Node ahead = m.left.next;

			m.left.next = right;

			right.next = ahead;
			

			m.left = ahead;

			if (cnt == size / 2) {

				tail = right;

				tail.next = null;

			}

		}

	}

}
