package interview_questions;

public class DeleteNode_13 {
	
	Node root;

	class Node{
		int nValue;
		Node pNext;
		
		public Node(int i){
			this.nValue = i;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void insert(Node node){
		if(node == null){
			throw new IndexOutOfBoundsException("Error input");
		}
		if(root == null){
			System.out.println("root is null and creat it.");
			root = new Node(0);
		}
		Node tmp = root;
		while(tmp.pNext != null){
			tmp = tmp.pNext;
		}
		tmp.pNext = node;
	}
	
	public boolean deleteNode(Node node){
		if(node == null || root == null){
			return false;
		}
		if(node.pNext != null){
			Node pNext = node.pNext;
			node.nValue = pNext.nValue;
			node.pNext = pNext.pNext;
		}else if(root == node){
			root = null;
		}else{
			Node pNext = root;
			while(pNext.pNext != node){
				pNext = pNext.pNext;
			}
			pNext.pNext = null;
		}
		return true;
	}

}
