package interview_questions;

public class MergerLinkList_17 extends LinkList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
