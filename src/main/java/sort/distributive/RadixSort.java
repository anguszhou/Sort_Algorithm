package sort.distributive;

import java.util.ArrayList;
import java.util.List;

import sort.Sort;

public class RadixSort extends Sort {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadixSort bs = new RadixSort();
		int[] data = bs.integerToInt(bs.getIntegerRandArray(10, 100));
		System.out.println("befort:");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
		System.out.println();
		System.out.println("after");
		bs.radixSort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
	}
	
	class Node{
		List<Integer> list ;
		public void Node(){
			this.list = new ArrayList<Integer>();
		}
	}
	
	public void radixSort(int[] data){
		
		int max = data[0] , radix = 1;;
		for (int i = 0; i < data.length; i++) {
			if(max < data[i]){
				max = data[i];
			}
		}
		
		while( max/radix > 0 ){
			Node[] bucket = new Node[10];
			for (int i = 0; i < bucket.length; i++) {
				bucket[i] = new Node();
			}
			for (int i = 0; i < data.length; i++) {
				bucket[ (data[i] / radix)%10 ].list.add(data[i]);
			}
			int pos = 0 ;
			for (int i = 0; i < bucket.length; i++) {
				for (int j = 0; j < bucket[i].list.size(); j++) {
					data[pos++] = bucket[i].list.get(j);
				}
			}
			radix *= 10;
		}
	}

}
