package sort.swap;

import sort.Sort;

public class MergeSort<T extends Comparable<T>> extends Sort<T> {

	public void mergeSort(int[] data, int begin, int end){
		if(data== null || begin> end){
			throw new NullPointerException("Error input.");
		}else if(begin == end){
			return;
		}else{
			int mid = ( begin + end ) / 2;
			mergeSort(data, begin, mid);
			mergeSort(data, mid+1, end);
			merge(data , begin , mid , end);
		}
		
	}

	private void merge(int[] data, int begin, int mid, int end) {
		// TODO Auto-generated method stub
		int i = begin , j = mid + 1 , k = begin;
		int [] tmp = new int[data.length];
		
		while(i <= mid && j <= end){
			if(data[i] < data[j]){
				tmp[k++] = data[i++];
			}else{
				tmp[k++] = data[j++];
			}
		}
		while(i <= mid){
			tmp[k++] = data[i++];
		}
		while(j <= end){
			tmp[k++] = data[j++];
		}
		
		for (int l = begin; l < end; l++) {
			data[l] = tmp[l];
		}
	}
}
