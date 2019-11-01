package pack_24_25_26_Oct_2019;

import java.util.*;

public class BinaryTree {

	class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;
	Scanner scn = new Scanner(System.in);

	public BinaryTree() {

		root = construct(null, false);
	}

	public Node construct(Node parent, boolean ilc) {

		if (parent == null) {
			System.out.println("Enter the data for root node? ");
		} else {

			if (ilc) {
				System.out.println("Enter the data for left child of " + parent.data + "? ");
			} else {
				System.out.println("Enter the data for right child of " + parent.data + "? ");
			}
		}

		Node nn = new Node();
		int item = scn.nextInt();
		nn.data = item;

		System.out.println("is left child of " + nn.data + "? ");
		boolean lc = scn.nextBoolean();

		if (lc) {
			nn.left = construct(nn, true);
		}

		System.out.println("is right child of " + nn.data + "? ");
		boolean rc = scn.nextBoolean();

		if (rc) {
			nn.right = construct(nn, false);
		}

		return nn;
	}

	public void display() {

		display(root);
	}

	public void display(Node node) {

		if (node == null) {
			return;
		}

		String str = "";

		if (node.left != null) {
			str += node.left.data;
		} else {
			str += ".";
		}

		str += "<-" + node.data + "->";

		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";
		}

		System.out.println(str);

		display(node.left);
		display(node.right);

	}

	public int size() {

		return size(root);
	}

	public int size(Node root) {

		if (root == null) {

			return 0;
		}

		int ls = size(root.left);

		int rs = size(root.right);

		return rs + ls + 1;

	}

	public int max() {

		return max(root);
	}

	public int max(Node root) {

		if (root == null) {

			return Integer.MIN_VALUE;

		}

		int lm = max(root.left);

		int rm = max(root.right);

		return (Math.max(root.data, Math.max(lm, rm)));

	}

	public boolean find(int item) {

		return find(root, item);
	}

	public boolean find(Node root, int item) {

		if (root == null) {

			return false;

		}

		boolean lf = find(root.left, item);

		boolean rf = find(root.right, item);

		if (root.data == item) {

			return true;
		}

		else if (rf || lf) {

			return true;
		}

		return false;

	}

	public int height() {

		return height(root);
	}

	public int height(Node root) {

		if (root == null) {

			return -1;

		}

		int lh = height(root.left);

		int rh = height(root.right);

		return Math.max(lh, rh) + 1;

	}

	public int diameter() {

		return diameter(root);

	}

	public int diameter(Node root) {

		if (root == null) {

			return 0;
		}

		int ld = diameter(root.left);

		int rd = diameter(root.right);

		int self = height(root.left) + height(root.right) + 2;

		return (Math.max(self, Math.max(ld, rd)));

	}

	class diapair {

		int ht = -1;

		int d = 0;
	}

	public int diameter2() {

		return diameter2(root).d;
	}

	public diapair diameter2(Node parent) {

		if (parent == null) {

			return new diapair();
		}

		diapair ld = diameter2(parent.left);

		diapair rd = diameter2(parent.right);

		diapair dp = new diapair();

		dp.ht = Math.max(ld.ht, rd.ht) + 1;

		int self = ld.ht + rd.ht + 2;

		Math.max(self, Math.max(ld.ht, rd.ht));

		return dp;

	}

	public boolean isBalanced(Node parent) {

		if (parent == null) {

			return true;

		}

		boolean lb = isBalanced(parent.left);

		boolean rb = isBalanced(parent.right);

		int lh = height(parent.left);

		int rh = height(parent.right);

		if ((lh - rh == 0 || lh - rh == 1 || lh - rh == -1) && lb && rb) {

			return true;

		}

		return false;

	}

	class hpair {

		boolean bal = true;

		int ht = -1;

	}

	public hpair isBalanced2(Node parent) {

		if (parent == null) {

			return new hpair();

		}

		hpair lb = isBalanced2(parent.left);

		hpair rb = isBalanced2(parent.right);

		hpair hp = new hpair();

		hp.ht = Math.max(lb.ht, rb.ht) + 1;

		int bf = lb.ht - rb.ht;

		hp.bal = (lb.bal && rb.bal && (lb.ht - rb.ht == 0 || lb.ht - rb.ht == -1 || lb.ht - rb.ht == 1));

		return hp;

	}

	public void preorder(Node parent) {

		if (parent == null) {

			return;
		}

		System.out.println(parent.data + " ");

		display(parent.left);
		display(parent.right);

	}

	public int preorder() {

		return root.data;
	}

	public int postorder() {

		return root.data;

	}

	public void postorder(Node parent) {

		if (parent == null) {

			return;

		}

		display(parent.left);

		display(parent.right);

		System.out.println(parent.data + " ");

	}

	public int inoder() {

		return root.data;

	}

	public void inorder(Node parent) {

		if (parent == null) {

			return;
		}

		display(parent.left);

		System.out.println(parent.data + " ");

		display(parent.right);

	}

}