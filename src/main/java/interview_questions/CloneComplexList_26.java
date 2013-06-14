package interview_questions;

public class CloneComplexList_26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ComplexListNode clone(ComplexListNode pHead){
		cloneNodes(pHead);
		connectSiblingNodes(pHead);
		return reconnectNodes(pHead);
	}

	private void cloneNodes(ComplexListNode pHead) {
		// TODO Auto-generated method stub
		ComplexListNode pNode = pHead;
		while(pNode != null){
			ComplexListNode pClone = new ComplexListNode();
			pClone.m_value = pNode.m_value;
			pClone.m_pNext = pNode.m_pNext;
			pClone.m_pSibling = null;
			pNode.m_pNext = pClone;
			
			pNode = pClone.m_pNext;
		}
	}

	private void connectSiblingNodes(ComplexListNode pHead) {
		// TODO Auto-generated method stub
		ComplexListNode pNode = pHead;
		while(pNode != null){
			ComplexListNode pClone = pNode.m_pNext;
			if(pNode.m_pSibling != null){
				pClone.m_pSibling = pNode.m_pSibling.m_pNext;
			}
			pNode = pClone.m_pNext;
		}
	}

	private ComplexListNode reconnectNodes(ComplexListNode pHead) {
		// TODO Auto-generated method stub
		ComplexListNode pNode = pHead;
		ComplexListNode pCloneHead = null;
		ComplexListNode pCloneNode = null;
		
		if(pNode != null){
			pCloneHead = pCloneNode = pNode.m_pNext;
			pNode.m_pNext = pCloneNode.m_pNext;
			pNode = pNode.m_pNext;
		}
		while(pNode != null){
			pCloneNode.m_pNext = pNode.m_pNext;
			pCloneNode = pCloneNode.m_pNext;
			pNode.m_pNext = pCloneNode.m_pNext;
			pNode = pNode.m_pNext;
		}
		
		return pCloneHead;
	} 
	
}

class ComplexListNode{
	int m_value;
	ComplexListNode m_pNext;
	ComplexListNode m_pSibling;
}
