package interview_questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
	
	private TreeNode root = null;
	private List<TreeNode> nodelist = new ArrayList<TreeNode>();
	
	//use for breadth search
	private static Queue<TreeNode> queue = new LinkedList<TreeNode>();
	//use for width search with iterator method
	private static Stack<TreeNode> stack = new Stack<TreeNode>();
	
	private class TreeNode{
		private int key;
		private TreeNode leftChild;
		private TreeNode rightChild;
		private TreeNode parent;
		
		public TreeNode(int key) {
			super();
			this.key = key;
			this.leftChild = null;
			this.rightChild = null;
			this.parent = null;
		}
		
		public int getKey(){
			return key;
		}
		
		public String toString() {  
            String leftkey = (leftChild == null ? "" : String  
                    .valueOf(leftChild.key));  
            String rightkey = (rightChild == null ? "" : String  
                    .valueOf(rightChild.key));  
            return "(" + leftkey + " , " + key + " , " + rightkey + ")";  
        }  
	}

	public boolean isEmpty(){
		if(root == null){
			return true;
		}else{
			return false;
		}
	}
	
	public void isTreeEmpty()throws Exception{
		if(isEmpty()){
			throw new Exception("The tree is empty.");
		}
	}
	
	public TreeNode searchByIterate(int key){
		if(root == null){
			return null;
		}
		TreeNode pNode = root;
		while(pNode != null && pNode.key != key){
			if(pNode.key < key){
				pNode = pNode.rightChild;
			}else{
				pNode = pNode.leftChild;
			}
		}
		return pNode;
	}
	
	public TreeNode searchByRecursion(TreeNode root , int key){
		if(root == null){
			throw new IndexOutOfBoundsException("input tree error.");
		}
		if(key > root.key){
			return searchByRecursion(root.rightChild, key);
		}else if(key < root.key){
			return searchByRecursion(root.leftChild, key);
		}else{
			return root;
		}			
	}
	
	public TreeNode searchMin(TreeNode node){
		if(node == null){
			throw new IndexOutOfBoundsException("input tree node error.");
		}
		TreeNode pNode = node;
		while(pNode.leftChild != null){
			pNode = pNode.leftChild;
		}
		return pNode;
	}
	
	public TreeNode searchMax(TreeNode node){
		if(node == null){
			throw new IndexOutOfBoundsException("input tree node error.");
		}
		TreeNode pNode = node;
		while(pNode.rightChild != null){
			pNode = pNode.rightChild;
		}
		return pNode;
	}
	
    /** 
     *find presessor node of input in mid-order  
     *
     */  
	public TreeNode presessor(TreeNode node){
		if(node == null){
			return null;
		}
		if(node.leftChild != null){
			return searchMax(node.leftChild);
		}else{
			if(node.parent == null){
				return null;
			}
			while(node != null){
				if(node.parent.rightChild  == node ){
					break;
				}
				node = node.parent;
			}
		}
		return node.parent;
	}
	
	 /** 
     *find successor node of input in mid-order  
     *
     */ 
	public TreeNode successor(TreeNode node){
		if(node == null){
			return null;
		}
		if(node.rightChild != null){
			return searchMin(node);
		}else{
			if(node.parent == null){
				return null;
			}
			while(node != null){
				if(node.parent.leftChild == node){
					break;
				}
				node = node.parent;
			}
		}
		return node.parent;
	}
	
	public void insertNode(TreeNode node){
		if(root == null){
			root = node ;
			return;
		}
		TreeNode pNode = root;
		TreeNode parentNode = null;
		while(pNode != null){
			parentNode = pNode;
			if(pNode.key > node.key){
				pNode = pNode.leftChild;
			}else{
				pNode = pNode.rightChild;
			}
		}
		if(node.key < parentNode.key){
			parentNode.leftChild = node;
			node.parent = parentNode;
		}else{
			parentNode.rightChild = node;
			node.parent = parentNode;
		}
	}
	
	public void deleteNode(TreeNode node){
		if(node == null){
			throw new IndexOutOfBoundsException("input tree node error.");
		}else if(searchByIterate(node.key) == null){
			throw new IndexOutOfBoundsException("there is no this node in the tree.");
		}
		
		//if this node has no left child and right child
		if(node.leftChild == null && node.rightChild == null){
			TreeNode parentNode = node.parent;
			if(parentNode.leftChild == node){
				parentNode.leftChild = null;
			}else{
				parentNode.rightChild = null;
			}
			return;
		}
		
		//if this node has no left child ,but has right child
		else if(node.leftChild== null && node.rightChild != null){
			TreeNode parentNode = node.parent;
			if(parentNode.leftChild == node){
				parentNode.leftChild = node.rightChild;
				node.rightChild.parent = parentNode;
			}else{
				parentNode.rightChild = node.rightChild;
				node.rightChild.parent = parentNode;
			}
			return;		
		}
		
		//if this node has no right child , but has left child
		else if(node.leftChild != null && node.rightChild == null){
			TreeNode parentNode = node.parent;
			if(parentNode.leftChild == node){
				parentNode.leftChild = node.leftChild;
				node.leftChild.parent = parentNode;
			}else{
				parentNode.rightChild = node.leftChild;
				node.leftChild.parent = parentNode;
			}
			return;	
		}		
		/** 
	     *if this node has both left child and right child
	     *successor of this node has no left child . 
	     */  
		else if(node.leftChild != null && node.rightChild != null){
			TreeNode successorNode = successor(node);
			deleteNode(successorNode);
			node.key = successorNode.key;
		}
	}
	
	public void breadthSearch(TreeNode node){
		if(node == null){
			throw new IndexOutOfBoundsException("empty input tree.");
		}
		queue.clear();
		TreeNode pNode = node;
		queue.add(pNode);
		while( (pNode = queue.poll()) != null){
			System.out.println(pNode.toString());
			if(pNode.leftChild != null){
				queue.add(pNode.leftChild);
			}
			if(pNode.rightChild != null){
				queue.add(pNode.rightChild);
			}
		}
	}
	
	public void preOrderWithStack1(TreeNode node){
		if(node == null){
			throw new IndexOutOfBoundsException("empty input tree.");
		}
		stack.clear();
		TreeNode pNode = node;
		stack.push(pNode);
		while(!stack.empty()){
			TreeNode tmp = stack.pop();
			System.out.println(tmp.key);
			if(tmp.rightChild != null){
				stack.push(tmp.rightChild);
			}
			if(tmp.leftChild != null){
				stack.push(tmp.leftChild);
			}
		}
	}
	public void preOrderWithStack2(TreeNode node){
		if(node == null){
			throw new IndexOutOfBoundsException("empty input tree.");
		}
		stack.clear();
		TreeNode pNode = node;
		stack.push(pNode);
		while(pNode != null || !stack.empty()){
			while(pNode != null){
				System.out.println(pNode.key);
				stack.push(pNode);	
				pNode = pNode.leftChild;					
			}
			if(!stack.empty()){
				pNode = stack.pop();
				pNode = pNode.rightChild;
			}
		}
	}
	public void inOrderWithStack1(TreeNode node){
		if(node == null){
			throw new IndexOutOfBoundsException("empty input tree.");
		}
		stack.clear();
		TreeNode pNode = node;
		stack.push(pNode);
		while(pNode != null || !stack.empty()){
			while(pNode != null){
				stack.push(pNode);
				pNode = pNode.leftChild;
			}
			if(!stack.empty()){
				pNode = stack.pop();
				System.out.println(pNode.key);
				pNode = pNode.rightChild;
			}
		}
	}
	public void postOrderWithStack1(TreeNode node){
		if(node == null){
			throw new IndexOutOfBoundsException("empty input tree.");
		}
		stack.clear();
		TreeNode pNode = node;
		TreeNode preNode = null;
		stack.push(pNode);
		while(!stack.empty()){
			TreeNode tmp = stack.peek();
			if( (tmp.leftChild == null && tmp.rightChild == null)
				 || ( preNode != null && (tmp.leftChild == preNode || tmp.rightChild == preNode) ) 
			   ){
				System.out.println(tmp.key);
				stack.pop();
				preNode = tmp;
			}else{
				if(pNode.rightChild != null){
					stack.push(pNode.rightChild);
				}
				if(pNode.leftChild != null){
					stack.push(pNode.leftChild);
				}
			}			
		}
	}
}
