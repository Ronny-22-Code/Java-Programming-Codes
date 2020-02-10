package Lec_33;

public class Segment_Tree {

	class Node {

		int data;
		int si;
		int ei;
		Node left;
		Node right;
	}

	private Node root;
	private Operations opt;

	public Segment_Tree(int[] arr, Operations opt) {

		this.opt = opt;
		root = construct(arr, 0, arr.length - 1);
	}

	public Node construct(int[] arr, int lo, int hi) {

		Node nn = new Node();

		if (lo == hi) {

			nn.data = arr[lo];
			nn.si = lo;
			nn.ei = hi;

			return nn;
		}

		int mid = (lo + hi) / 2;

		Node l = construct(arr, lo, mid);
		Node r = construct(arr, mid + 1, hi);

		nn.left = l;
		nn.right = r;

		nn.data = opt.operation(l.data, r.data);
		nn.si = lo;
		nn.ei = hi;

		return nn;

	}

	public void display() {

		display(root);
	}

	public void display(Node parent) {

		if (parent == null) {
			return;
		}

		String str = "";

		if (parent.left != null) {
			str += parent.left.data;
		} else {
			str += ".";
		}

		str += "<-" + parent.data + "->";

		if (parent.right != null) {
			str += parent.right.data;
		} else {
			str += ".";
		}

		System.out.println(str);

		display(parent.left);
		display(parent.right);

	}

	public int query(int qsi, int qei) {
		return query(root, qsi, qei);
	}

	public int query(Node parent, int qsi, int qei) {

		if (parent.ei < qsi || parent.si > qei) {
			return opt.defaultVal();
		} else if (parent.si >= qsi && parent.ei <= qei) {
			return parent.data;
		} else {

			int ls = query(parent.left, qsi, qei);
			int rs = query(parent.right, qsi, qei);

			return opt.operation(ls, rs);
		}

	}

	public void update(int idx, int val) {

		update(root, idx, val);
	}

	public void update(Node parent, int idx, int val) {

		if (parent.si == idx && parent.ei == idx) {
			parent.data = val;
			return;
		}

		if (parent.si <= idx && parent.ei >= idx) {

			update(parent.left, idx, val);
			update(parent.right, idx, val);

			parent.data = opt.operation(parent.left.data, parent.right.data);
		}

	}

}
