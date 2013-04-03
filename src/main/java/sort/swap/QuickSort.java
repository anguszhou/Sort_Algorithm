package sort.swap;

import java.util.Comparator;
import java.util.Random;

import sort.Sort;

public class QuickSort<T extends Comparable<T>> extends Sort<T> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
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
	private int partition(T[] data, int length, int start, int end) {
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
	
}
