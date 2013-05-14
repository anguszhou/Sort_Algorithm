package interview_questions;

import java.util.Random;

public class MergerLinkList_17 extends LinkList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList ll = new LinkList();
		LinkList ll2 = new LinkList();
		Random r = new Random();
		int size = r.nextInt(10);
		for (int i = 0; i < size; i++) {
			Node n = new Node(i*2);
			Node n2 = new Node(i*2+1);
			ll.addNode(n);
			ll2.addNode(n2);
		}
		
		System.out.println("LinkList 1 : ");
		ll.printNodeList(ll.root);
		System.out.println();
		System.out.println("LinkList 2 : ");
		ll2.printNodeList(ll2.root);
		
		System.out.println();
		MergerLinkList_17 ml = new MergerLinkList_17();
		System.out.println("Merged LinkList : ");
		ll2.printNodeList(ml.mergeList(ll.root, ll2.root));
		
	}
	
	public Node mergeList(Node head1, Node head2){
		if(head1 == null){
			return head2;
		}else if(head2 == null){
			return head1;
		}
		Node mergeHead = null;
		if( head1.value < head2.value){
			mergeHead = head1;
			mergeHead.pNext = mergeList(head1.pNext, head2);
		}else{
			mergeHead = head2;
			mergeHead.pNext = mergeList(head1, head2.pNext);
		}
		return mergeHead;
	}
}
