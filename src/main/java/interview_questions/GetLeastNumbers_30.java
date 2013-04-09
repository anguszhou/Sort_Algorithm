package interview_questions;

import sort.swap.QuickSort;

public class GetLeastNumbers_30 {

	/**
	 * @param args
	 */
	QuickSort s = new QuickSort();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * find the smallest of k number in array
	 * used partition method which would change the array
	 */
	public int[] getLeastNumbers(Integer[] data, int length , int k){
		if(data == null || length <= 0 || k<=0 || k > k){
			throw new IndexOutOfBoundsException("input error!");
		}
		int[] result = new int[k];
		
		int start = 0 , end = length -1 ;
		int index = s.partition(data, length, start, end);
		
		while(index != k-1){
			if(index > k-1){
				end = index - 1;
				index = s.partition(data, length, start, end);
			}else{
				start = index + 1;
				index = s.partition(data, length, start, end);
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			result[i] = data[i];
		}
		
		return result;
	}
	
	public int[] GetLeastNumbers_useExternalStorage(Integer[] data, int length , int k){
		if(data == null || length <=0 || k <= 0 || k > length){
			throw new IndexOutOfBoundsException("input array error.");
		}
		int[] result = new int[k];
		return result;
	}
}
