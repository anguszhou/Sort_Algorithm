package sort.insert;

import sort.Sort;

public class InsertSort <T extends Comparable<T>> extends Sort<T>{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertSort is = new InsertSort();
		int[] data = is.integerToInt(is.getIntegerRandArray(10, 100));
		System.out.println("before sort:");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
		System.out.println();
		System.out.println("after sort:");
		is.insertSort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
	}
	
	public void insertSort(int[]data){
		if(data == null){
			throw new NullPointerException("Input array is null");
		}
		for (int i = 1; i < data.length; i++) {
			int tmp = data[i];
			int j = i ;
			while( j >0 && tmp < data[j-1]){
				data[j] = data[j-1];
				j--;
			}
			data[j] = tmp; 
		}
	}
}
