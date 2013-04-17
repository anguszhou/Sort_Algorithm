package sort.swap;

import sort.Sort;
import sort.insert.InsertSort;

public class BubbleSort<T extends Comparable<T>> extends Sort<T> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort is = new BubbleSort();
		int[] data = is.integerToInt(is.getIntegerRandArray(10, 100));
		System.out.println("before sort:");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
		System.out.println();
		System.out.println("after sort:");
		is.improveBubbleSort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
	}

	public void bubbleSort(int[] data){
		if(data == null){
			throw new NullPointerException("Input array is null.");
		}
		for (int i = 0; i < data.length; i++) {
			for (int j = data.length -1; j > i; j--) {
				if(data[j] < data[j-1]){
					int tmp = data[j];
					data[j] = data[j-1];
					data[j-1] = tmp;
				}
			}
		}
	}
	
	public void improveBubbleSort(int[] data){
		if(data == null){
			throw new NullPointerException("Input array is null.");
		}
		boolean flag = true;
		for (int i = 0; i < data.length && flag; i++) {
			flag = false;
			for(int j = data.length-1 ; j>i ; j--){
				if(data[j] < data[j-1]){
					int tmp = data[j];
					data[j] = data[j-1];
					data[j-1] = tmp;
					flag = true;
				}
			}
		}
	}
}
