package pack_24_25_26_Oct_2019;

public class Tree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "10 3 20 2 50 0 60 0 30 0 40 1 70 0";
		Tree_Operations gt = new Tree_Operations(str);
		gt.display();

		gt.mirror();
		System.out.println("Mirror");
		gt.display();
		gt.preorder();
	
		gt.printAtLevel(6);
	
		gt.levelOrder();
	
		gt.levelOrder1();
	
		gt.levelOrderZZ();
	
	
		
	
	}
	

}
