package sort.swap;

import java.util.Comparator;
import java.util.Random;

import sort.Sort;

public class QuickSort<T extends Comparable<T>> extends Sort<T> {

	/**
	 * 快速排序：通过一趟排序，将待排序记录分割成独立的两个部分，其中一部分记录的关键字均比另一部分记录的关键字小，
	 * 则可分别对这两部分记录继续进行排序，以达到整个序列有序。具体做法是：使用两个指针low,high, 初值分别设置为序列的头，
	 * 和序列的尾，设置pivotkey为第一个记录，首先从high开始向前搜索第一个小于pivotkey的记录和pivotkey所在位置进行交换，
	 * 然后从low开始向后搜索第一个大于pivotkey的记录和此时pivotkey所在位置进行交换，重复知道low=high了为止
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
