package interview_questions;

import java.util.Random;

public class FindKthToTail_15 {

	private Node root;
	/**
	 * find the k-th node from the bottom
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		FindKthToTail_15 ft = new FindKthToTail_15();
		int size = r.nextInt(10);
		
		for (int i = 0; i < size; i++) {
			Node nn = new Node();
			nn.value = i + 1;
			ft.addNode(nn);
		}
		
		System.out.println(size);
		ft.printNodeList();
		System.out.println();
		System.out.println(ft.findKthToTail(ft.root, size-3).value);
	}

	public void printNodeList(){
		if(root != null){
			Node cc = root;
			while(cc.pNext != null){
				System.out.print(cc.value+" , ");
				cc = cc.pNext;
			}
		}
	}
	
	public void addNode(Node nn){
		if(root != null){
			Node pp = root;
			while(pp.pNext != null){
				pp = pp .pNext;
			}
			pp.pNext = nn;
		}else{
			root = new Node();
			root.value = 0 ;
			root.pNext = nn;
		}
	}
	
	public Node findKthToTail(Node head , int k){
		if(head == null || k <= 0){
			throw new NullPointerException("Error input arguements.");
		}
		
		Node pre = head;
		Node behind = null;
		
		for (int i = 0; i < k; i++) {
			if( pre != null){
				pre = pre.pNext;
			}else{
				throw new NullPointerException("Link List has no k-th node from bottom.");
			}
		}
		behind = head;
		
		while(pre.pNext != null){
			pre = pre.pNext;
			behind = behind.pNext;
		}
		return behind;
	}
}
