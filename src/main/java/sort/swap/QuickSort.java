package sort.swap;

import java.util.Comparator;
import java.util.Random;

import sort.Sort;

public class QuickSort<T extends Comparable<T>> extends Sort<T> {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	/**
	 * partition array into three part.array[start , index-1]  
	 *array[index] and array[index +1 , start ]
	 * 
	*/
	public void quickSort(T data[] , int length , int start , int end){
		if(length <= 1){
			return;
		}
		int index = partition(data , length , start , end);
		if(index > start){
			quickSort(data, length,start , index-1);
		}
		if(index < end){
			quickSort(data, length, index+1, end);
		}
	}

	/**
	 * choose one index of array and return it .
	 * swap all smaller than array[index] to left of array 
	 * swap all bigger than array[index] to right of array
	 * 
	*/
	public int partition(T[] data, int length, int start, int end) {
		// TODO Auto-generated method stub
		if(data == null || length <=0 || start < 0 || end >= length){
			throw new IndexOutOfBoundsException("argument error!");
		}
		Random r = new Random();
		//nextInt(0,n+1) create an int in [0, n+1) == [0, n];
		int index = r.nextInt(end-start+1)+start;
		swap(data , index , end);
		
		int small = start;
		for(int i = start ; i <= end ; i++){
			if(data[i].compareTo(data[end]) < 0){
				if( small != i){
					swap(data, small , i);
				}
				small++;
			}
		}
		swap(data , small , end);		
		return small;
	}
	
	public void quickSortInt(int data[] , int length , int start , int end){
		if(length <= 1){
			return;
		}
		int index = partitionInt(data , length , start , end);
		if(index > start){
			quickSortInt(data, length,start , index-1);
		}
		if(index < end){
			quickSortInt(data, length, index+1, end);
		}
	}
	public int partitionInt(int[] data, int length, int start, int end) {
		// TODO Auto-generated method stub
		if(data == null || length <=0 || start < 0 || end >= length){
			throw new IndexOutOfBoundsException("argument error!");
		}
		Random r = new Random();
		//nextInt(0,n+1) create an int in [0, n+1) == [0, n];
		int index = r.nextInt(end-start+1)+start;
		swapInt(data , index , end);
		
		int small = start;
		for(int i = start ; i <= end ; i++){
			if(data[i] < data[end]){
				if( small != i){
					swapInt(data, small , i);
				}
				small++;
			}
		}
		swapInt(data , small , end);		
		return small;
	}
}
