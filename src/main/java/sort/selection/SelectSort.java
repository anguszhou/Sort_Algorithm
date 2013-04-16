package sort.selection;

import sort.Sort;
import sort.insert.InsertSort;

public class SelectSort<T extends Comparable<T>> extends Sort<T> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectSort is = new SelectSort();
		int[] data = is.integerToInt(is.getIntegerRandArray(10, 100));
		System.out.println("before sort:");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
		System.out.println();
		System.out.println("after sort:");
		is.selectSort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
	}
	public void selectSort(int[] data){
		if(data == null){
			throw new NullPointerException("Input array is null.");
		}
		for (int i = 0; i < data.length; i++) {
			int small = i , tmp ;
			for (int j = i+1; j < data.length; j++) {
				if(data[small] > data[j]){
					small = j;
				}
			}
			
			//swap data[small] and data[i]
			tmp = data[i] ; 
			data[i] = data[small];
			data[small] = tmp;
		}
	}
}
