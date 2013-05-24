package interview_questions;

import java.util.Iterator;
import java.util.Random;
import java.util.Stack;

public class FindPathInTree_25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree sbt = new BinarySearchTree();
		sbt.insertNode(new TreeNode(10));
		sbt.insertNode(new TreeNode(5));
		sbt.insertNode(new TreeNode(4));
		sbt.insertNode(new TreeNode(7));
		sbt.insertNode(new TreeNode(12));
		System.out.println();
		sbt.printBinaryTree(sbt.getRoot());
		
		FindPathInTree_25 fp = new FindPathInTree_25();
		fp.findPath(sbt.getRoot(), 22);
	}

	public void findPath(TreeNode root , int expectedNum){
		if(root == null){
			return ;
		}
		Stack<Integer> path = new Stack();
		int currentNum = 0 ;
		findPath(root, expectedNum , path , currentNum);
	}

	private void findPath(TreeNode root, int expectedNum, Stack<Integer> path,
			int currentNum) {
		// TODO Auto-generated method stub
		currentNum += root.key;
		path.push(root.key);
		
		boolean isLeaf = root.leftChild == null && root.rightChild == null ;
		if(currentNum == expectedNum && isLeaf){
			printPath(path);					
		}
		
		if(root.leftChild != null){
			findPath(root.leftChild, expectedNum, path, currentNum);
		}
		if(root.rightChild != null){
			findPath(root.rightChild, expectedNum, path, currentNum);
		}
		
		currentNum -= root.key;
		path.pop();
	}

	private void printPath(Stack<Integer> path) {
		// TODO Auto-generated method stub
		System.out.println("A path is found:");
		Iterator it = path.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" , ");
		}
		System.out.println();
	}
	
}
