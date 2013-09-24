package sort.insert;

import sort.Sort;

public class InsertSort <T extends Comparable<T>> extends Sort<T>{

	/**
	 * avg：O(n^2) worst:O(n^2)
	 * stable
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertSort is = new InsertSort();
		int[] data = is.integerToInt(is.getIntegerRandArray(10, 100));
		System.out.println("before sort:");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
		int a,b;a=b=100;
		System.out.println();
		System.out.println("after sort:");
		is.insertSortWithPiquet(data);
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
	
	public void insertSortWithPiquet(int[]data){
		int[] copydata = new int[data.length+1];
		for (int i = 1; i < copydata.length; i++) {
			copydata[i] = data[i-1];
		}
		
		for (int i = 2; i < copydata.length; i++) {
			copydata[0] = copydata[i];
			for (int j = i-1; copydata[0] < copydata[j]; j--) {
				copydata[j+1] = copydata[j];
				copydata[j] = copydata[0];
			}
		}
		
		for (int i = 1; i < copydata.length; i++) {
			data[i-1] = copydata[i];
		}
	}
}
