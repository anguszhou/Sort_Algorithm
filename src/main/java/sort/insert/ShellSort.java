package sort.insert;

import sort.Sort;

public class ShellSort<T extends Comparable<T>> extends Sort<T> {

	/**
	 * avg：O(nlog n) ~ O(n^2) [ O(n^1.3)]
	 * stable
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShellSort ss = new ShellSort();
		int[] data = ss.integerToInt(ss.getIntegerRandArray(10, 100));
		System.out.println("before sort:");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
		System.out.println();
		System.out.println("after sort:");
		ss.shellSort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
	}

	public void shellSort(int[] data){
		if(data == null){
			throw new NullPointerException("Input array is null.");
		}
		
		int delta = 1 , outer , inter , tmp;
		while( delta*3 +1  < data.length){
			delta = delta*3 + 1;
		}
		
		while(delta > 0){
			for(outer = delta ; outer < data.length ; outer++){
				tmp = data[outer];
				inter = outer;
				while( inter > delta -1 && tmp < data[inter - delta]){
					data[inter] = data[inter-delta];
					inter -= delta;
				}
				data[inter] = tmp; 
			}
			delta = (delta -1)/3; 
		}
	}
}
