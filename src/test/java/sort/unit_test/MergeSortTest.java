package sort.unit_test;

import sort.swap.MergeSort;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void test_MergeSort(){
		MergeSort ms = new MergeSort();
		int[] data = ms.integerToInt(ms.getIntegerRandArray(10, 100));
		System.out.println("before");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
		System.out.println();
		System.out.println("after");
		ms.mergeSort(data, 0, data.length-1);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
	}
	
}
