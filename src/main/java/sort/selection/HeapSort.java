package sort.selection;

import sort.Sort;
import sort.swap.BubbleSort;

public class HeapSort<T extends Comparable<T>> extends Sort<T> {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapSort is = new HeapSort();
		int[] data = is.integerToInt(is.getIntegerRandArray(10, 100));
		System.out.println("before sort:");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
		System.out.println();
		System.out.println("after sort:");
		is.heapSort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
	}
	
	public void heapSort(int[] data){
		if(data == null){
			throw new NullPointerException("input array is null.");
		}
		buildHeap(data, data.length);
		for (int i = data.length - 1; i >= 0; i--) {
			int tmp = data[0];
			data[0] = data[i];
			data[i] = tmp; 
			shiftDown(data, 0, i);
		}
	}

	//build max heap
	private void buildHeap(int[] data , int length){
		/**
		 * we start from (len-1)/2, because branch's node +1=leaf's node, 
		 * and all leaf node is already a heap
		 */
		int pos = data.length /2 - 1;
		for (int index = pos; index >= 0 ; index--) {
			shiftDown(data, index , length);
		}
	} 

	private void shiftDown(int[] data, int index , int length) {
		// TODO Auto-generated method stub
		int tmp = data[index] , child = index*2 +1;
		
		while( child < length){
			if( child + 1 < length && data[child+1] > data[child]){
				child += 1;
			}
			if(tmp > data[child]){
				break;
			}
			
			data[index] = data[child];
			index = child;
			child = index*2 +1;
			
		}
		data[index] = tmp;
	}
	
	private void shiftUp(int[] data , int index){
		int tmp = data[index] , father = (index-1) / 2;
		
		while(father >= 0){
			if(tmp < data[father]){
				break;
			}
			
			data[index] = data[father];
			index = father;
			father = (index -1) /2;
		}
		data[index] = tmp;
	}
	
	public void delete(int[] data){
		//delete the root node, size of data subtract 1
		data[0] = data[data.length-1];
		shiftDown(data, 0 , data.length -1 );
	}
	public void add(int[] data , int num){
		//size of data add 1
		data[data.length] = num;
		shiftUp(data, data.length);
	}
}
