package interview_questions;

import sort.Sort;
import sort.swap.QuickSort;

public class MoreThanHalfNum_29{

	/**
	 * Find the number whose frequency of occurrence is more
	 * than half size of array  in array  
	 * 
	 */
	private static int  INVALID_ARRAY = -99999;
	QuickSort<Integer> s = new QuickSort<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	/**
	 * use partition to find n-th 
	 * 
	 */
	public int moreThanHalfNum(int data[] , int length){
		if(checkInvalidArray(data, length)){
			return INVALID_ARRAY;
		}
		
		Integer[] array  = s.intToInteger(data);
		
		int middel = length >>1;
		int start = 0 , end = length - 1 ;
		
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

	private boolean checkInvalidArray(int[] data, int length) {
		// TODO Auto-generated method stub
		if(data == null || length <= 0 )
			return true;
		return false;
	}

	/**
	 * use a number and timer to record the value and times
	 * frequency of occurrence
	 */
	public int moreThanHalfNum2(int[] data , int length){
		if(checkInvalidArray(data, length)){
			return INVALID_ARRAY;
		}
		int value =data[0], times = 1;
		for (int i = 1; i < data.length; i++) {
			if(times == 0 ){
				value = data[i];
				times = 1;
			}
			if(data[i] == value){
				times++;
			}else{
				times--;
			}
		}
		if(!checkMoreThanHalf(s.intToInteger(data), length, value)){
			return INVALID_ARRAY;
		}
		return value;
	}
}
