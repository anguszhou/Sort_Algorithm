package interview_questions;

import java.util.Random;

public class ReverseList_16 extends LinkList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseList_16 rl = new ReverseList_16();
		Random r = new Random();
		int size = r.nextInt(10);
		for (int i = 0; i < size; i++) {
			Node nn = new Node(i+1);
			rl.addNode(nn);
		}
		rl.printNodeList(rl.root);
		System.out.println();
		rl.printNodeList(rl.reverseLinkList(rl.root));
		
	}

	public Node reverseLinkList(Node head){
		Node reverseHead = null;
		if(head == null){
			return reverseHead;
		}else if(head.pNext == null){
			reverseHead = head;
			return reverseHead;
		}else{
			Node cur = head , pre = null;
			while(cur != null){
				Node next = cur.pNext;
				
				if(next == null){
					reverseHead = cur;
				}
				
				cur.pNext = pre;
				pre = cur;
				cur = next;
			}
			return reverseHead;
		}
	}
}
