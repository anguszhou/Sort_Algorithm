package face_questions;

import sort.Sort;
import sort.swap.QuickSort;

public class MoreThanHalfNum{

	/**
	 * Find the number whose frequency of occurrence is bigger
	 * than half size of array  in array  
	 * 
	 */
	private static int  INVALID_ARRAY = -99999;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int moreThanHalfNum(int data[] , int length){
		if(checkInvalidArray(data, length)){
			return INVALID_ARRAY;
		}
		Integer[] array  = intToInteger(data);
		
		int middel = length >>1;
		int start = 0 , end = length - 1 ;
		QuickSort<Integer> s = new QuickSort<Integer>();
		int index = s.partition(array, length, start, end);
		
		return 0;
	}

	private Integer[] intToInteger(int[] data) {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean checkInvalidArray(int[] data, int length) {
		// TODO Auto-generated method stub
		if(data == null || length <= 0 )
			return true;
		return false;
	}

}
