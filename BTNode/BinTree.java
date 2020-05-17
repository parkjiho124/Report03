package BTNode;

public class BinTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BTNode<Integer> n1 = new BTNode<Integer>(100,null,null);
		BTNode<Integer> n2 = new BTNode<Integer>(200,null,null);
		BTNode<Integer> n3 = new BTNode<Integer>(300,null,null);
		BTNode<Integer> n4 = new BTNode<Integer>(400,null,null);
		BTNode<Integer> n5 = new BTNode<Integer>(500,null,null);
		BTNode<Integer> n6 = new BTNode<Integer>(600,null,null);
		BTNode<Integer> n7 = new BTNode<Integer>(700,null,null);
		BTNode<Integer> n8 = new BTNode<Integer>(800,null,null);
		n1.setLeft(n2); n1.setRight(n3); 
		n2.setLeft(n4); n2.setRight(n5); 
		n3.setLeft(n6); n3.setRight(n7); 
		n4.setLeft(n8);
		
	BinaryTree<Integer> t = new BinaryTree<Integer>(); 
	t.setRoot(n1); 
	System.out.print("Ʈ�� ��� �� = " + t.size(t.getRoot()) + "\nƮ�� ���� = " + t.height(t.getRoot()));
	System.out.printf("\n���� ��ȸ: ");
	t.preorder(t.getRoot());
	System.out.printf("\n���� ��ȸ: ");
	t.inorder(t.getRoot());
	System.out.printf("\n���� ��ȸ: ");
	t.postorder(t.getRoot());
	System.out.printf("\n���� ��ȸ: ");
	t.levelorder(t.getRoot());
	System.out.println();
	
	BTNode<Integer> n10 = new BTNode<Integer>(100,null,null);
	BTNode<Integer> n20 = new BTNode<Integer>(200,null,null);
	BTNode<Integer> n30 = new BTNode<Integer>(300,null,null);
	BTNode<Integer> n40 = new BTNode<Integer>(400,null,null);
	BTNode<Integer> n50 = new BTNode<Integer>(500,null,null);
	BTNode<Integer> n60 = new BTNode<Integer>(600,null,null);
	BTNode<Integer> n70 = new BTNode<Integer>(700,null,null);
	BTNode<Integer> n80 = new BTNode<Integer>(800,null,null);
	n10.setLeft(n20); n10.setRight(n30);
	n20.setLeft(n40); n20.setRight(n50);
	n30.setLeft(n60); n30.setRight(n70); 
	n40.setLeft(n80);
	
	BinaryTree<Integer> t2 = new BinaryTree<Integer>();
	t2.setRoot(n10);
	
	System.out.printf("���ϼ� �˻�: " + BinaryTree.isEqual(t.getRoot(), t2.getRoot()));
	System.out.println();
	
	BinaryTree<Integer> t3 = new BinaryTree<Integer>();
	t3.setRoot(t3.copy(t.getRoot()));
	System.out.printf("copy �׽�Ʈ: " + BinaryTree.isEqual(t.getRoot(), t3.getRoot()));
	System.out.println();
	}
}