package pack_24_25_26_Oct_2019;

import java.util.*;

public class Tree_Operations {

	Scanner scn;

	class Node {

		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public Tree_Operations(String str) {

		scn = new Scanner(str);
		root = constuct(null, -1);
	}

	public Node constuct(Node parent, int ithc) {

		if (parent == null) {
			System.out.println("Enter the data for root Node? ");
		} else {
			System.out.println("Enter the data for " + ithc + " child of" + parent.data + "? ");
		}

		Node nn = new Node();
		int item = scn.nextInt();
		nn.data = item;

		System.out.println("child for " + nn.data + " ? ");
		int nc = scn.nextInt();

		for (int i = 0; i < nc; i++) {
			Node child = constuct(nn, i);
			nn.children.add(child);
		}

		return nn;

	}

	public void display() {

		display(root);
	}

	private void display(Node node) {

		System.out.print(node.data + "-> ");

		if (node.children.size() == 0) {
			System.out.print(".");
		}

		for (Node child : node.children) {
			System.out.print(child.data + ", ");
		}
		System.out.println();

		for (Node child : node.children) {
			display(child);
		}

	}

	public int size() {

		return size(root);
	}

	private int size(Node node) {

		int s = 0;

		for (Node child : node.children) {

			s = s + size(child);
		}

		return s + 1;
	}

	public int height() {

		return height(root);
	}

	private int height(Node node) {

		int h = -1;

		for (Node child : node.children) {

			int th = height(child);

			h = Math.max(h, th);
		}

		return h + 1;

	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {

		int m = node.data;

		for (Node child : node.children) {

			int tm = max(child);
			m = Math.max(m, tm);
		}

		return Math.max(m, node.data);

	}

	public boolean find(int item) {

		return find(root, item);
	}

	private boolean find(Node root, int item) {

		if (root.data == item) {
			return true;
		}

		for (Node child : root.children) {

			boolean rr = find(child, item);
			if (rr) {
				return true;
			}
		}

		return false;

	}

	public void mirror() {

		mirror(root);
	}

	public void mirror(Node node) {

		for (Node child : node.children) {
			mirror(child);
		}

		int i = 0;
		int j = node.children.size() - 1;

		while (i < j) {

			Node temp = node.children.get(i);
			node.children.set(i, node.children.get(j));
			node.children.set(j, temp);

			i++;
			j--;

		}

	}

	public void preorder() {

		preorder(root);
	}

	private void preorder(Node node) {

		for (Node child : node.children) {
			preorder(child);
		}

		System.out.println(node.data);
	}

	public void printAtLevel(int level) {

		printAtLevel(3);

	}

	public void printAtLevel(Node node, int c_level, int level) {

		if (c_level == level) {

			System.out.println(node.data);

			return;

		}

		for (Node i : node.children) {

			printAtLevel(i, c_level + 1, level);
		}

	}

	public void levelOrder() {

		LinkedList<Node> q = new LinkedList<>();

		q.addLast(root);

		while (!q.isEmpty()) {

			Node rp = q.removeFirst();

			if (rp == null) {

				System.out.println();

				q.addLast(null);
			}

			System.out.println(rp.data + ",");

			for (Node child : rp.children) {

				q.addLast(child);
			}

		}

	}

	public void levelOrder1() {

		LinkedList<Node> q = new LinkedList<>();

		q.addLast(root);

		q.addLast(null);

		while (!q.isEmpty()) {

			Node rp = q.removeFirst();

			if (rp == null) {

				if (q.isEmpty()) {

					break;
				}

				System.out.println();

				q.addLast(null);
			}

			System.out.println(rp.data + ",");

			for (Node child : rp.children) {

				q.addLast(child);
			}

		}

	}

	public void levelOrder2() {

		LinkedList<Node> q = new LinkedList<>();

		LinkedList<Node> h = new LinkedList<>();

		q.addLast(root);

		q.addLast(null);

		while (!q.isEmpty()) {

			Node rp = q.removeFirst();

			if (rp == null) {

				if (q.isEmpty()) {

					break;
				}

				System.out.println();

				q.addLast(null);
			}

			System.out.println(rp.data + ",");

			for (Node child : rp.children) {

				q.addLast(child);
			}

		}

	}

	public void levelOrderZZ() {

		LinkedList<Node> q = new LinkedList<>();
		LinkedList<Node> h = new LinkedList<>();

		q.addLast(root);

		int cnt = 0;

		while (!q.isEmpty()) {

			Node rp = q.removeFirst();

			System.out.print(rp.data + " ");

			if (cnt % 2 == 0) {
				for (Node child : rp.children) {
					h.addFirst(child);
				}
			} else {

				for (int i = rp.children.size() - 1; i >= 0; i--) {
					h.addFirst(rp.children.get(i));
				}
			}

			if (q.isEmpty()) {

				System.out.println();
				q = h;
				h = new LinkedList<>();

				cnt++;
			}

		}
	}

	public void linearize(Node node) {

		for (Node child : node.children) {
			linearize(child);
		}

		while (node.children.size() > 1) {
			Node tail = getTail(node.children.get(0));
			Node child = node.children.remove(1);

			tail.children.add(child);
		}

	}

	public Node getTail(Node node) {

		if (node.children.size() == 0) {
			return node;
		}

		return getTail(node.children.get(0));
	}

}