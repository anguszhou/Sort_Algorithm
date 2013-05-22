package interview_questions;

import java.util.Random;

public class MirrorRecursively_19 {

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
		System.out.println("original tree:");
		sbt.printBinaryTree(sbt.getRoot());
		
		System.out.println("mirror tree:");
		MirrorRecursively_19 mr = new MirrorRecursively_19();
		mr.mirrorRecursively(sbt.getRoot());
		sbt.printBinaryTree(sbt.getRoot());
	}
	
	public void mirrorRecursively(TreeNode root){
		if(root == null || (root.leftChild == null && root.rightChild == null) )
			return;
		
		TreeNode tmp = root.leftChild;
		root.leftChild = root.rightChild;
		root.rightChild = tmp;
		
		if(root.leftChild != null){
			mirrorRecursively(root.leftChild);
		}
		
		if(root.rightChild != null){
			mirrorRecursively(root.rightChild);
		}
	}

}
