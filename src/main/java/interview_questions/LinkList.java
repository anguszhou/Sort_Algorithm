package interview_questions;

public class LinkList {

	/**
	 * @param args
	 */
	public Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void printNodeList(Node head){
		if(head != null){
			Node cc = head;
			System.out.print(cc.value+" , ");
			while(cc.pNext != null){
				cc = cc.pNext;
				System.out.print(cc.value+" , ");			
			}
		}
	}
	
	public void addNode(Node nn){
		if(root != null){
			Node pp = root;
			while(pp.pNext != null){
				pp = pp.pNext;
			}
			pp.pNext = nn;
		}else{
			root = new Node();
			root.value = nn.value ;
			root.pNext = null;
		}
	}
	
	public void deleteNode(Node nn){
		if(nn == null || root == null){
			return;
		}
		//if nn is not the tail node in list
		if(nn.pNext != null){
			Node pre = nn.pNext;
			nn.value = pre.value;
			nn.pNext = pre.pNext;
			pre.pNext = null;	
		}
		//if root has only one node nn
		else if(root == nn){
			nn = null;
			root = null;
		}
		//if nn is tail node of root
		else{
			Node cur = root;
			while(cur.pNext != nn){
				cur = cur.pNext;
			}
			cur.pNext = null;
			nn = null;
		}
	}

}

class Node{
	int value;
	Node pNext;
	
	public Node(int i){
		value = i;
	}
	public Node(){
		
	}
}