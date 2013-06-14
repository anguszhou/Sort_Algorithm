package interview_questions;

import java.util.Random;

public class HasSubtree_18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree sbt = new BinarySearchTree();
		Random r = new Random();
		int size = r.nextInt(10)+3;
		System.out.println("size : "+ size);
		for (int i = 0; i < size; i++) {
			TreeNode tn = new TreeNode(r.nextInt(100));
			sbt.insertNode(tn);
		}
		System.out.println();
		System.out.println();
		sbt.printBinaryTree(sbt.getRoot());
	}
	
	public boolean hasSubtree(TreeNode root1, TreeNode root2){
		boolean result = false;
		if(root1 != null && root2 != null){
			if(root1.key == root2.key){
				result = doesTreeHadTree(root1 , root2);
			}
			if(root1.leftChild != null){
				result = hasSubtree(root1.leftChild, root2);
			}
			if(root1.rightChild != null){
				result = hasSubtree(root1.rightChild, root2);
			}
		}
		
		return result;
	}

	private boolean doesTreeHadTree(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if(root2 == null){
			return true;
		}
		if(root1 == null || root1.key != root2.key){
			return false;
		}
		return doesTreeHadTree(root1.leftChild, root2.leftChild) &&
				doesTreeHadTree(root1.rightChild, root2.rightChild);
		
	}

}
