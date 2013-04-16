package sort.selection;

import sort.Sort;

public class HeapSort<T extends Comparable<T>> extends Sort<T> {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void heapSort(int[] data){
		
	}

	
	private void buildHeap(int[] data){
		/**
		 * we start from (len-1)/2, because branch's node +1=leaf's node, 
		 * and all leaf node is already a heap
		 */
		int pos = (data.length - 1)/2 ;
		for (int index = pos; index >= 0 ; index--) {
			shiftDown(data, index);
		}
	}

	private void shiftDown(int[] data, int index) {
		// TODO Auto-generated method stub
		int tmp = data[index] , father = (index - 1)/2;
		while( father >=0 && index != 0){
			if( data[index] < data[father] ){
				data[index] = data[father];
				index = father;
				father = (index - 1)/2;
			}
		}
		data[father] = tmp;
	}
}
