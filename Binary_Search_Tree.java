package java_31_Oct_01_02_03_Nov_pack;

public class Binary_Search_Tree {

	class Node {

		int data;

		Node left;

		Node right;

	}

	private Node root;

	public Binary_Search_Tree(int[] a) {

		root = construct(a, 0, a.length - 1);

	}

	public Node construct(int[] a, int l, int h) {

		if (l > h) {

			return null;
		}

		Node nn = new Node();

		int m = (h + l) / 2;

		nn.data = a[m];

		nn.left = construct(a, 0, m - 1);

		nn.right = construct(a, m, h);

		return nn;

	}

	public void display() {

		display(root);
	}

	private void display(Node node) {

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

	private int size(Node root) {

		if (root == null) {

			return 0;
		}

		int ls = size(root.left);

		int rs = size(root.right);

		return rs + ls + 1;

	}

	public int height() {

		return height(root);
	}

	private int height(Node root) {

		if (root == null) {

			return -1;

		}

		int lh = height(root.left);

		int rh = height(root.right);

		return Math.max(lh, rh) + 1;

	}

	public int max() {

		return max(root);
	}

	private int max(Node parent) {

		if (parent == null) {

			return Integer.MIN_VALUE;

		}

		int rm = max(parent.right);

		return Math.max(parent.data, rm);

	}

	public boolean find(int item) {

		return find(root, item);
	}

	private boolean find(Node parent, int item) {

		if (parent == null) {

			return false;
		}

		boolean ld = false, rd = false;

		if (item == parent.data) {

			return true;

		}

		else if (item < parent.data) {

			ld = find(parent.left, item);

		}

		else if (item > parent.data) {

			rd = find(parent.right, item);

		}

		if (ld || rd) {

			return true;
		}

		return false;

	}

	public void printInrange(int l, int u) {

		printInrange(root, l, u);

	}

	private void printInrange(Node parent, int l, int u) {

		if (parent == null) {

			return;
		}

		if (parent.data < l) {

			printInrange(parent.right, l, u);
		}

		else if (parent.data > u) {

			printInrange(parent.left, l, u);
		} else {
			printInrange(parent.left, l, u);

			System.out.println(parent.data + " ");

			printInrange(parent.right, l, u);
		}
	}

	private int s = 0;

	public void replace() {

		replace(root);
	}

	private void replace(Node parent) {

		if (parent == null) {

			return;

		}

		replace(parent.right);
		int temp = parent.data;
		parent.data = s;
		s += temp;

		replace(parent.left);

	}

	public void replace2(int ssf) {

		replace2(root, 0);
	}

	private int replace2(Node parent, int ssf) {

		if (parent == null) {

			return ssf;

		}

		int ts = replace2(parent.right, ssf);

		int temp = parent.data;

		parent.data = ts;

		ts += temp;

		return replace2(parent.left, ssf);

	}

	public void add(int item) {

		add(root, item);

	}

	private Node add(Node parent, int item) {

		if (parent == null) {

			Node nn = new Node();

			nn.data = item;

			return nn;

		}

		Node nn = new Node();

		if (item <= parent.data && parent.left == null) {

			add(parent.left, item);

		}

		else if (item >= parent.data && parent.right == null) {

			add(parent.right, item);

		}

		return nn;

	}

	public void add_oneLevelBefore(int val) {

		add_oneLevelBefore(root, val);

	}

	public void add_oneLevelBefore(Node node, int val) {

		Node nn = new Node();
		nn.data = val;

		if (val <= node.data && node.left == null) {
			node.left = nn;
			return;
		} else if (val >= node.data && node.right == null) {
			node.right = nn;
			return;
		}

		if (node.data > val) {

			add_oneLevelBefore(node.left, val);
		} else {

			add_oneLevelBefore(node.right, val);
		}

	}

	public void remove(int item) {

		remove(root, item);
	}

	public Node remove(Node parent, int item) {

		if (parent == null) {

			return null;
		}



		if (item < parent.data) {

			remove(parent.left, item);

		}

		else if (item > parent.data) {

			remove(parent.right, item);

		}

		else {

			if (parent.left != null && parent.right == null) {

				return parent.left;

			}

			else if (parent.left == null && parent.right != null) {

				return parent.right;
			}

			else if (parent.left == null && parent.right == null) {

				return null;
			}

			else {

				int lm = max(parent.left);
				

				parent.left = remove(parent.left, lm);

			}

		}

		return parent;

	}

}
