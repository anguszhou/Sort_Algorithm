package interview_questions;

import java.util.LinkedList;
import java.util.Queue;

public class PrintFromTopToBottom_23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void printFromTopToBottom(TreeNode root){
		if(root == null){
			return;
		}
		Queue<TreeNode> tmp = new LinkedList<TreeNode>();
		TreeNode pNode = root;
		tmp.add(pNode);
		while(!tmp.isEmpty()){
			printNum(tmp.poll());
			if(pNode.leftChild != null){
				tmp.add(pNode.leftChild);
			}
			if(pNode.rightChild != null){
				tmp.add(pNode.rightChild);
			}
		}
	}
	private void printNum(TreeNode poll) {
		// TODO Auto-generated method stub
		System.out.print(poll.key+" , ");
	}
}
