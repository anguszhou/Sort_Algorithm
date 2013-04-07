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
		
		while(index != middel){
			if(index > middel){
				end = index -1 ;
				index = s.partition(array, length, start, end);
			}else{
				start = index +1 ;
				index = s.partition(array, length, start, end);
			}
		}
		
		int result = array[index];
		if(!checkMoreThanHalf(array, length , result))
			return INVALID_ARRAY;
		return result;
	}

	private boolean checkMoreThanHalf(Integer[] array, int length, int result) {
		// TODO Auto-generated method stub
		int times = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == result){
				times++;
			}
		}
		
		if(times*2 <= length)
			return false;
		else
			return true;
	}

	private Integer[] intToInteger(int[] data) {
		// TODO Auto-generated method stub
		Integer[] array = new Integer[data.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = data[i];
		}
 		return array;
	}

	private boolean checkInvalidArray(int[] data, int length) {
		// TODO Auto-generated method stub
		if(data == null || length <= 0 )
			return true;
		return false;
	}

}
